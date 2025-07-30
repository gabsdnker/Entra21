async function carregarFuncionarios() {
    try {
        const response = await fetch('http://localhost:8080/funcionarios');
        if (!response.ok) throw new Error('Erro ao buscar funcionários');

        const funcionarios = await response.json();
        const container = document.getElementById('funcionarios');

        if (funcionarios.length === 0) {
            container.innerHTML = '<p>Nenhum funcionário encontrado.</p>';
            return;
        }

        funcionarios.forEach(func => {
            const div = document.createElement('div');
            div.className = 'funcionario';

            div.innerHTML = `
                        <div class="acoes">
                            <button class="btn-editar" title="Editar" onclick="editarFuncionario(${func.idFuncionario})">✏️</button>
                            <button class="btn-excluir" title="Excluir" onclick="confirmarExclusao(${func.idFuncionario})">❌</button>
                        </div>

                        <strong>Nome:</strong> <span>${func.nome}</span>
                        <strong>CPF:</strong> <span>${func.cpf}</span>
                        <strong>Email:</strong> <span>${func.email}</span>
                        <strong>Senha:</strong> <span>${func.senha}</span>
                        <strong>Data de Nascimento:</strong> <span>${new Date(func.dataNascimento).toLocaleDateString('pt-BR')}</span>
                        <strong>Salário:</strong> <span>R$ ${func.salario?.toFixed(2) || "0.00"}</span>
                        <strong>Função:</strong> <span>${func.gerente ? "Gerente" : "Funcionário"}</span>
                        <strong>Departamento:</strong> <span>${func.departamento?.nmDepartamento || "N/A"}</span>
                        <strong>Endereço:</strong>
                        <span>${func.endereco?.logradouro || ""}, ${func.endereco?.numero || ""} - ${func.endereco?.bairro || ""}</span>
                        <span>${func.endereco?.cidade || ""} - ${func.endereco?.estado || ""}, ${func.endereco?.pais || ""}</span>
                        <span>CEP: ${func.endereco?.cep || ""}</span>
                    `;

            container.appendChild(div);
        });
    } catch (error) {
        document.getElementById('funcionarios').innerHTML =
            `<p style="color: red;">Erro ao carregar funcionários: ${error.message}</p>`;
    }
}


function editarFuncionario(id) {
    window.location.href = `edicao-funcionario.html?id=${id}`;
}



async function confirmarExclusao(id) {
    const confirmacao = confirm("Tem certeza que deseja excluir este funcionário?");
    if (!confirmacao) return;

    try {
        const resposta = await fetch(`http://localhost:8080/funcionarios/${id}`, {
            method: 'DELETE'
        });

        if (resposta.ok) {
            alert("Funcionário excluído com sucesso!");
            window.location.reload();
        } else {
            const erro = await resposta.text();
            alert("Erro ao excluir: " + erro);
        }
    } catch (erro) {
        alert("Erro de rede ao excluir: " + erro.message);
    }
}


carregarFuncionarios();
