# Cifra de César 

## Objetivo 

Neste desafio iremos implementar o algoritmo de cifragem denominado de **Cifra de César**.

A Cifra de César encripta uma mensagem trocando os caracteres 3, e somente 3, posições à sua frente.

Por exemplo: a palavra ``CESAR`` vai ser tornar ``FHVDU``, a palavra ``COMPUTADOR`` se tornará ``FRPSXWDGRU``.

Construa um programa que possibilite ao usuário cifrar algum texto e decifrar algum texto utilizando este algoritmo. Isto é, o programa deve permitir que o usuário acione estas funcionalidades:

    - Cifrar um texto
    - Decifrar um texto

A Cifra de César limita-se a cifrar apenas caracteres constituídos de letras do alfabeto.

Espaços, números e outros caracteres não compõe o texto simples.

Se atente com:

- Caracteres especiais como: é, á, ã, etc...
- Letras maiúsculas e minúsculas

## Dica

Use a função ``nextLine()`` em vez da ``next()`` para poder colocar mais palavras na entrada do Scanner.