// Lendo 4 valores inteiros A, B, C e D
let a = 5;
let b = 10;
let c = 15;
let d = 20;

console.log("Valores lidos: A = " + a + ", B = " + b + ", C = " + c + ", D = " + d);

// Calculando a diferença do produto de A e B pelo produto de C e D

let produto1 = a * b;
let produto2 = c * d;

console.log("Produto de A e B: " + produto1);
console.log("Produto de C e D: " + produto2);

let diferenca = produto1 - produto2;

// Exibindo o resultado
console.log("Diferença: " + diferenca);

// Outra forma de resolver o exercício

const num1 = prompt("Digite o valor de A:");
const num2 = prompt("Digite o valor de B:");    
const num3 = prompt("Digite o valor de C:");
const num4 = prompt("Digite o valor de D:");

const produtoAB = num1 * num2;
const produtoCD = num3 * num4;

const diferencaFinal = produtoAB - produtoCD;
alert("Diferença: " + diferencaFinal);