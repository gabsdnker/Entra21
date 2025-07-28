fetch('http://localhost:8080/produtos')
    .then(response => response.json())
    .then(listaProdutos => {
        const container = document.getElementById('container');
        listaProdutos.forEach(produto => {
            const card = document.createElement('div');
            card.innerHTML = `
                <h3>${produto.nmProduto}</h3>
                <p>Preço: R$ ${produto.preco}</p>
                <p>${produto.id}</p>
            `;
            container.appendChild(card);
        });
    })
    .catch(error => console.error('Erro ao listar produtos:', error));