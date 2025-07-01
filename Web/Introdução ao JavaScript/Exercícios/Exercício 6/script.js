//Valores inteiros

let valor1 = 2;
let valor2 = 6;

console.log("Valor 1: " + valor1);
console.log("Valor 2: " + valor2);

//São multiplos ou não?

//Se são divisiveis o resto tem que ser igual a 0 (zero)
if(valor1 % valor2 === 0){
    console.log(valor1 + " é multiplo de " + valor2);
} else{
    console.log(valor1 + " não é multiplo de " + valor2);
}

if(valor2 % valor1 === 0){
    console.log(valor2 + " é multiplo de " + valor1);
} else {
    console.log(valor2 + " não é multiplo de " + valor1);
}
