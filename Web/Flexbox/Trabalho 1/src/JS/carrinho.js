const tabelaCarrinhoBody = document.querySelector('#tabelaCarrinho tbody');
const subtotalEl = document.getElementById('subtotal');
const freteEl = document.getElementById('frete');
const totalEl = document.getElementById('total');

const FRETE_FIXO = 10.00;

function formatarPreco(valor) {
  return valor.toFixed(2).replace('.', ',');
}

function carregarCarrinho() {
  const carrinho = JSON.parse(localStorage.getItem('carrinho')) || [];
  tabelaCarrinhoBody.innerHTML = '';

  if (carrinho.length === 0) {
    tabelaCarrinhoBody.innerHTML = `<tr><td colspan="6" class="text-center">Seu carrinho está vazio.</td></tr>`;
    subtotalEl.textContent = 'R$ 0,00';
    totalEl.textContent = 'R$ 0,00';
    return;
  }

  let subtotal = 0;

  carrinho.forEach((item, index) => {
    const totalProduto = item.preco * item.quantidade;
    subtotal += totalProduto;

    tabelaCarrinhoBody.innerHTML += `
      <tr>
        <td><img src="Imagens/Produtos/${item.imagem}" alt="${item.nome}" style="width: 60px;"></td>
        <td>${item.nome}</td>
        <td>R$ ${formatarPreco(item.preco)}</td>
        <td><input type="number" min="1" value="${item.quantidade}" class="form-control text-center quantidade-input" data-index="${index}" style="width: 80px; margin: auto;"></td>
        <td>R$ <span class="total-produto">${formatarPreco(totalProduto)}</span></td>
        <td><button class="btn btn-danger btn-sm btn-remover" data-index="${index}" title="Remover item"><i class="fas fa-trash-alt"></i></button></td>
      </tr>
    `;
  });

  subtotalEl.textContent = `R$ ${formatarPreco(subtotal)}`;
  freteEl.textContent = `R$ ${formatarPreco(FRETE_FIXO)}`;
  totalEl.textContent = `R$ ${formatarPreco(subtotal + FRETE_FIXO)}`;

  adicionarEventos();
}

function adicionarEventos() {
  // Atualizar quantidade
  const inputsQuantidade = document.querySelectorAll('.quantidade-input');
  inputsQuantidade.forEach(input => {
    input.addEventListener('change', e => {
      const index = e.target.getAttribute('data-index');
      let novaQtd = parseInt(e.target.value);
      if (isNaN(novaQtd) || novaQtd < 1) {
        novaQtd = 1;
        e.target.value = 1;
      }
      atualizarQuantidade(index, novaQtd);
    });
  });

  // Remover item
  const botoesRemover = document.querySelectorAll('.btn-remover');
  botoesRemover.forEach(botao => {
    botao.addEventListener('click', e => {
      const index = e.target.closest('button').getAttribute('data-index');
      removerItem(index);
    });
  });
}

function atualizarQuantidade(index, quantidade) {
  const carrinho = JSON.parse(localStorage.getItem('carrinho')) || [];
  carrinho[index].quantidade = quantidade;
  localStorage.setItem('carrinho', JSON.stringify(carrinho));
  carregarCarrinho();
}

function removerItem(index) {
  const carrinho = JSON.parse(localStorage.getItem('carrinho')) || [];
  carrinho.splice(index, 1);
  localStorage.setItem('carrinho', JSON.stringify(carrinho));
  carregarCarrinho();
}

// Carrega carrinho ao abrir a página
window.addEventListener('load', carregarCarrinho);
