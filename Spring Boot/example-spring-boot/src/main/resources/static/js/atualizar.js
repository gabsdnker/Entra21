document.getElementById('atualizarForm').addEventListener('submit', function(e) {
    e.preventDefault(); // Impede o envio padrão do formulário
    // Coleta os dados do formulário
    const produto = {
        nmProduto: document.getElementById('nome').value,
        preco: parseFloat(document.getElementById('preco').value),
        id: parseInt(document.getElementById('id').value)
    };

    // Envia os dados para o servidor
    fetch('http://localhost:8080/produtos', {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'},
        body: JSON.stringify(produto)
    });
    // Exibe uma mensagem de sucesso
    alert('Produto atualizado com sucesso!');
    // Limpa os campos do formulário
    document.getElementById('atualizarForm').reset();

});
