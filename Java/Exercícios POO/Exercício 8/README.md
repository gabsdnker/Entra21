# Exercício 8

Para efetuar o recolhimento do Imposto de Renda a Receita Federal tem o NOME, CPF, UF (RS, 
PR e SC) e RENDA ANUAL.
EX:
Nome: João da Silva
CPF: 123.456.789-00
UF: PR
RendaAnual: R$40.000

Para o cálculo do imposto a pagar de cada contribuinte, considere o seguinte:
Nível de Renda Anual Alíquota
0 a 4.000 0%
4.001 a 9.000 5,8%
9.001 a 25.000 15%
25.001 a 35.000 27,5%
acima de 35.000 30%

Sendo assim, deve-se calcular o imposto a pagar do seguinte modo:
Imposto a pagar = Renda Anual * Alíquota

Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.

Calcule:
a) Quem mais paga imposto.
b) Quem menos paga imposto.
c) Qual o total de imposto pago entre os 5 contribuintes?

- COMO RODAR?
No terminal você precisa esta na pasta aonde tem os arquivos Contribuinte.java e MainContribuinte.java, agora para rodar você vai digitar no terminal os seguites comandos:

``javac Contribuinte.java MainContribuinte.java``

Depois que compilar os arquivos corretamente, execute o arquivo MainContribuinte.java, da seguinte forma:

``java MainContribuinte.java``