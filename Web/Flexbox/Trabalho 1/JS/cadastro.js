(function () {
  'use strict';
  const form = document.getElementById('cadastroForm');
  form.addEventListener('submit', function (event) {
    event.preventDefault();
    event.stopPropagation();

    const senha = document.getElementById('senha').value;
    const confirmarSenha = document.getElementById('confirmarSenha').value;
    const senhaFeedback = document.getElementById('senhaFeedback');
    senhaFeedback.style.display = 'none';
    document.getElementById('confirmarSenha').classList.remove('is-invalid');

    if (!form.checkValidity()) {
      // Bootstrap validation
    } else if (senha !== confirmarSenha) {
      senhaFeedback.style.display = 'block';
      document.getElementById('confirmarSenha').classList.add('is-invalid');
    } else {
      // Cadastro bem-sucedido
      senhaFeedback.style.display = 'none';
      const nome = document.getElementById("nome").value;
      const email = document.getElementById("email").value;

      const usuario = {
        nome: nome,
        email: email,
        senha: senha
      };

      localStorage.setItem("usuarioCadastrado", JSON.stringify(usuario));
      alert("Cadastro realizado com sucesso!");
      window.location.href = "login.html";
    }

    form.classList.add('was-validated');
  }, false);
})();
