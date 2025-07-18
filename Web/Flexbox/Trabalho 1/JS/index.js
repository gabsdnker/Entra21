// Simples controle de carrinho usando localStorage
    document.querySelectorAll('.comprar-btn').forEach(button => {
      button.addEventListener('click', () => {
        const nome = button.getAttribute('data-nome');
        const preco = parseFloat(button.getAttribute('data-preco'));
        const img = button.getAttribute('data-img');

        let carrinho = JSON.parse(localStorage.getItem('carrinho')) || [];

        // Verifica se produto já está no carrinho
        const produtoExistente = carrinho.find(p => p.nome === nome);
        if(produtoExistente){
          produtoExistente.quantidade++;
        } else {
          carrinho.push({ nome, preco, quantidade: 1, img });
        }

        localStorage.setItem('carrinho', JSON.stringify(carrinho));
        alert(`Produto "${nome}" adicionado ao carrinho!`);
      });
    });