// Seleciona todos os botões "Comprar"
const botoesComprar = document.querySelectorAll('.btn-comprar');

botoesComprar.forEach(botao => {
  botao.addEventListener('click', (e) => {
    e.preventDefault();

    // Pega os dados do produto dos atributos data-*
    const nome = botao.getAttribute('data-nome');
    const preco = parseFloat(botao.getAttribute('data-preco'));
    const imagem = botao.getAttribute('data-imagem');

    // Pega o carrinho do localStorage ou cria um array vazio
    const carrinho = JSON.parse(localStorage.getItem('carrinho')) || [];

    // Verifica se produto já está no carrinho
    const produtoExistente = carrinho.find(item => item.nome === nome);

    if (produtoExistente) {
      // Se existe, só aumenta a quantidade
      produtoExistente.quantidade++;
    } else {
      // Se não existe, adiciona novo produto
      carrinho.push({
        nome,
        preco,
        quantidade: 1,
        imagem
      });
    }

    // Salva o carrinho atualizado no localStorage
    localStorage.setItem('carrinho', JSON.stringify(carrinho));

    // Feedback (você pode substituir por modal, toast etc)
    console.log(`"${nome}" adicionado ao carrinho!`);

    // Opcional: atualizar visual na página se tiver carrinho visível
  });
});
