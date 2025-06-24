# Equação de Segundo Grau com Soma e Produto

## Objetivo

Faça um algoritmo que descubra a solução para uma equação de segundo grau completa utilizando o método de soma e produto.

O usuário deve entrar os coeficientes da equação de segundo grau e você deve calcular quais as soluções utilizando um método conhecido como **força bruta**.

Força bruta consiste em testar todas as combinações possíveis até chegar no resultado. 

## Observação

Nem todas as combinações de coeficientes vão funcionar, essas equações são chamadas de "equações sem raízes reais".

### Lista de equações que dão certo:

``x² + x - 6 = 0``

``x² - 3x + 2 = 0``

``x² - 6x + 9 = 0``

``x² - 7y + 6 = 0``

``4x² - 4x - 1 = 0``

### Como funciona

Dada uma equação do tipo:   ``ax² + bx + c = 0``

A **soma das raízes** é:  ``-(b/a)``
 
O **produto das raízes** é:  ``c/a``