// Seleciona os campos do formulário pelo ID
const cepInput = document.getElementById('cep');
const logradouroInput = document.getElementById('logradouro');
const bairroInput = document.getElementById('bairro');
const cidadeInput = document.getElementById('cidade');
const ufInput = document.getElementById('uf');

// Adiciona um event listener para o campo de CEP, disparando a cada alteração (input)
cepInput.addEventListener('input', () => {
    let cep = cepInput.value;
    cep = removerLetras(cep);

    if (cep.length !== 8) {
        limparCampos();
        return;
    }

    // Faz a requisição para a API ViaCEP usando o valor do CEP
    fetch(`https://viacep.com.br/ws/${cep}/json/`) // Retorna uma Promise
        .then(response => response.json()) // A Promise é resolvida com a resposta da API e convertida para JSON
        .then(data => {
            // Se a API retornar o atributo erro (algo específico da ViaCEP), lança um erro
            if (data.erro) {
                throw new Error('CEP não encontrado');
            }
            // Preenche os campos do formulário com os dados retornados pela API
            logradouroInput.value = data.logradouro;
            bairroInput.value = data.bairro;
            cidadeInput.value = data.localidade;
            ufInput.value = data.uf;
        })
        .catch(error => {
            // Em caso de erro (CEP não encontrado ou problema na requisição), exibe um alerta e limpa os campos
            alert('Erro: ' + error.message);
            limparCampos();
        });
});

function removerLetras(cep) {
    return cep.replace(/\D/g, '');
}

// Função para limpar os campos menos o CEP do formulário
function limparCampos() {
    logradouroInput.value = '';
    bairroInput.value = '';
    cidadeInput.value = '';
    ufInput.value = '';
}
