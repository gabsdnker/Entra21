//Função que calcula o fatorial do número enviado

function calcularFatorial(event){
    event.preventDefault(); 

    const numero = document.getElementById("numero").value;
    let fatorial =  1;

    if(numero === 0 || numero === 1){
        fatorial = 1;
    } else{
        for( let i = 2; i <= numero; i++){
            fatorial *= i;
        }
    }
    document.getElementById("resultado").value = fatorial;
}