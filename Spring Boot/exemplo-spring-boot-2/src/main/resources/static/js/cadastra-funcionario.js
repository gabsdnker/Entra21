document.getElementById('formFuncionario').addEventListener('submit', async function (e) {
    e.preventDefault();

    const form = e.target;

    const funcionario = {
        nome: form.nome.value,
        cpf: form.cpf.value,
        email: form.email.value,
        senha: form.senha.value,
        dataNascimento: form.dataNascimento.value,
        salario: parseFloat(form.salario.value) || 0,
        gerente: form.gerente.checked,
        endereco: {
            pais: form.pais.value,
            estado: form.estado.value,
            cidade: form.cidade.value,
            bairro: form.bairro.value,
            logradouro: form.logradouro.value,
            numero: form.numero.value,
            cep: form.cep.value
        },
        departamento: {
            idDepartamento: parseInt(form.departamento.value)
        }
    };

    // console.log(funcionario);

    try {
        const response = await fetch('http://localhost:8080/funcionarios', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(funcionario)
        });

        if (response.ok) {
            alert('Funcionário cadastrado com sucesso!');
            form.reset();
        } else {
            const errorText = await response.text();
            alert('Erro ao cadastrar: ' + errorText);
        }
    } catch (error) {
        alert('Erro de rede: ' + error.message);
    }
});