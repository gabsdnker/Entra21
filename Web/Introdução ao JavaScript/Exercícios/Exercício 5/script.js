//Dois números inteiros distintos

let num1 = 15;
let num2 = 12;

console.log("Número 1: " +  num1);
console.log("Númeor 2: " + num2);

//Qual número é maior?

if (num1 > num2){
    console.log("Número 1 é maior que o Número 2");
} else {
    console.log("Número 2 é maior que Número 1");
}

//Outra forma de fazer
const numero1 = parseInt(prompt("Digite o primeiro número: "));
const numero2 = parseInt(prompt("Digite o segundo número: "));

if (numero1 > numero2) {
    alert(numero1 + " é maior que o " + numero2);
}
else if (numero2 > numero1) {
    alert(numero2 + " é maior que o " + numero1);
}