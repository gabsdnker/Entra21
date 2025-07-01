document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('formVenda');
    form.addEventListener('submit', function (e) {
        e.preventDefault();

        // Validação extra (exemplo: valor positivo)
        if (!form.nome.value.trim()) {
            alert('O nome do produto é obrigatório.');
            form.nome.focus();
            return;
        }
        if (!form.descricao.value.trim()) {
            alert('A descrição do produto é obrigatória.');
            form.descricao.focus();
            return;
        }
        if (!form.tipo.value) {
            alert('O tipo de produto é obrigatório.');
            form.tipo.focus();
            return;
        }
        // Aceita valores com vírgula ou ponto como separador decimal
        const valorStr = form.valor.value.replace(',', '.');
        const valor = parseFloat(valorStr);
        if (isNaN(valor) || valor <= 0) {
            alert('O valor deve ser um número positivo.');
            form.valor.focus();
            return;
        }

        // Criação do objeto produto
        const produto = {
            nome: form.nome.value.trim(),
            descricao: form.descricao.value.trim(),
            valor: valor,
            tipo: form.tipo.value,
            contemLactose: form.lactose.checked
        };

        // Exemplo: mostrar no console
        console.log('Produto cadastrado:', produto);
        alert('Produto cadastrado com sucesso!');

        form.reset();
    });
});