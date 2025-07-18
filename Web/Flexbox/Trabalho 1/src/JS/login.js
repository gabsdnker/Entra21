  // Validação simples do formulário bootstrap 5
  (() => {
    'use strict'

    const form = document.querySelector('#loginForm')

    form.addEventListener('submit', event => {
      if (!form.checkValidity()) {
        event.preventDefault()
        event.stopPropagation()
      } else {
        event.preventDefault()
        // Aqui você pode adicionar lógica de autenticação
        alert('Login efetuado com sucesso!')
        window.location.href = 'index.html'
      }

      form.classList.add('was-validated')
    })
  })()

function login() {
  localStorage.setItem('usuarioLogado', 'true');
  window.location.href = 'index.html'; // ou para onde quiser redirecionar
}

document.getElementById("formLogin").addEventListener("submit", function(e) {
  e.preventDefault();

  const email = document.getElementById("loginEmail").value;
  const senha = document.getElementById("loginSenha").value;

  const usuarioCadastrado = JSON.parse(localStorage.getItem("usuarioCadastrado"));

  if (usuarioCadastrado && usuarioCadastrado.email === email && usuarioCadastrado.senha === senha) {
    localStorage.setItem("usuarioLogado", JSON.stringify(usuarioCadastrado));
    alert("Login realizado com sucesso!");
    window.location.href = "index.html";
  } else {
    alert("Email ou senha incorretos!");
  }
});
