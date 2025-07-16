    // Validação simples do formulário
    (function () {
      'use strict'
      const form = document.getElementById('cadastroForm');
      form.addEventListener('submit', function (event) {
        // limpa mensagens customizadas
        document.getElementById('senhaFeedback').style.display = 'none';

        if (!form.checkValidity()) {
          event.preventDefault();
          event.stopPropagation();
        } else {
          // valida senha igual
          const senha = document.getElementById('senha').value;
          const confirmarSenha = document.getElementById('confirmarSenha').value;
          if (senha !== confirmarSenha) {
            event.preventDefault();
            event.stopPropagation();
            const senhaFeedback = document.getElementById('senhaFeedback');
            senhaFeedback.style.display = 'block';
            document.getElementById('confirmarSenha').classList.add('is-invalid');
          }
        }
        form.classList.add('was-validated');
      }, false);
    })();