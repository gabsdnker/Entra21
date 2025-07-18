    // Validação simples do formulário bootstrap 5
    (() => {
      'use strict'

      const form = document.querySelector('#paymentForm')

      form.addEventListener('submit', event => {
        if (!form.checkValidity()) {
          event.preventDefault()
          event.stopPropagation()
        } else {
          event.preventDefault()
          alert('Pagamento efetuado com sucesso! Obrigado por comprar na EcoVibe Store.')
          window.location.href = 'index.html'
        }

        form.classList.add('was-validated')
      })
    })()