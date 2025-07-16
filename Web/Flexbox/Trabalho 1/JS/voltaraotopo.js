  // Mostra o botão quando a rolagem passar de 100px
  window.onscroll = function () {
    document.getElementById("btnTopo").style.display =
      window.scrollY > 100 ? "block" : "none";
  };

  // Volta ao topo da página quando o botão for clicado
  document.getElementById("btnTopo").onclick = function () {
    window.scrollTo({ top: 0, behavior: 'smooth' });
  };