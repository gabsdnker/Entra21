document.addEventListener('DOMContentLoaded', () => {
    carregarDepartamentos();
});

function carregarDepartamentos() {
    fetch('/departamentos')
        .then(res => res.json())
        .then(departamentos => {
            const lista = document.getElementById('departamentos');
            lista.innerHTML = '';
            departamentos.forEach(departamento => {
                const div = document.createElement('div');
                div.className = 'departamento';
                div.innerHTML = `
                    <span><strong>Nome:</strong> ${departamento.nmDepartamento}</span>
                    <span><strong>ID:</strong> ${departamento.idDepartamento}</span>
                    <div class="acoes">
                         <button class="btn-editar" title="Editar" onclick="editarDepartamento(${departamento.idDepartamento})">✏️</button>
                            <button class="btn-excluir" title="Excluir" onclick="confirmarExclusao(${departamento.idDepartamento})">❌</button>
                    </div>

                `;
                lista.appendChild(div);
            });
        });
}




function editarDepartamento(idDepartamento) {
    window.location.href = `edicao-departamento.html?id=${idDepartamento}`;
}



async function confirmarExclusao(idDepartamento) {
    const confirmacao = confirm("Tem certeza que deseja excluir este departamento?");
    if (!confirmacao) return;

    try {
        const resposta = await fetch(`http://localhost:8080/departamentos/${idDepartamento}`, {
            method: 'DELETE'
        });

        if (resposta.ok) {
            alert("Departamento excluído com sucesso!");
            window.location.reload();
        } else {
            const erro = await resposta.text();
            alert("Erro ao excluir: " + erro);
        }
    } catch (erro) {
        alert("Erro de rede ao excluir: " + erro.message);
    }
}