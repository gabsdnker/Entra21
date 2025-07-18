function finalizarCompra() {
  const usuario = JSON.parse(localStorage.getItem('usuarioLogado'));

  if (usuario && usuario.nome) {
    window.location.href = 'pagamento.html';
  } else {
    alert("Você precisa estar logado para finalizar a compra.");
    window.location.href = 'login.html';
  }
}
