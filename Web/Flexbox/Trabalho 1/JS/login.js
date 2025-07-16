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