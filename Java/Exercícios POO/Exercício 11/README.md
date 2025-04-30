# Exercício 11

Você foi contratado para desenvolver uma funcionalidade de controle de empréstimo de livros. 
Para isso, você deverá criar uma classe Livro que implemente as regras de empréstimo e 
devolução, lançando exceções para tratar casos inválidos. Crie a classe Livro com os seguintes 
atributos e métodos:

Atributos:
• Título do livro
• Emprestado (boolean)

Métodos:
• Emprestar: Marque o livro como emprestado. Caso o livro já esteja emprestado, deve lançar 
uma exceção
• Devolver: Marque o livro como disponível. Caso o livro não esteja emprestado, deve lançar uma 
exceção
Personalize o toString para mostrar se o livro está disponível ou nã

- COMO RODAR?
No terminal você precisa esta na pasta aonde tem os arquivos Livro.java e MainLivro.java, agora para rodar você vai digitar no terminal os seguites comandos:

``javac Livro.java MainLivro.java``

Depois que compilar os arquivos corretamente, execute o arquivo MainLivro.java, da seguinte forma:

``java MainLivro.java``