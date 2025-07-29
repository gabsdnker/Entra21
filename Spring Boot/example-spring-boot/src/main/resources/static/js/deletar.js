document.getElementById('deletarForm').addEventListener('submit', function(e) {
    e.preventDefault(); // Impede o envio padrão do formulário
    // Coleta o ID do produto a ser deletado
    const produtoId = parseInt(document.getElementById('id').value);
    // Envia o ID para o servidor
    fetch(`http://localhost:8080/produtos/${produtoId}`, {
        method: 'DELETE',
    }) 
    // Exibe uma mensagem de sucesso
    alert('Produto deletado com sucesso!');
    // Limpa os campos do formulário
    document.getElementById('deletarForm').reset();
});