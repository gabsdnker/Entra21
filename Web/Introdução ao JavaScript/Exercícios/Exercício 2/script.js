// Valor de dolares
let dolares = 100;

// Cotação do dolar
let cotacaoDolar = 5.25;

// Cálculo do valor em reais
let reais = dolares * cotacaoDolar;

// Exibe o resultado
console.log(`O valor em reais é: R$ ` + reais);

// Outra forma de resolver o exercício
const valorDolares = prompt("Digite o valor em dólares:");
const cotacao = prompt("Digite a cotação do dólar:");
const valorReais = valorDolares * cotacao;
alert(`O valor em reais é: R$ ` + valorReais);