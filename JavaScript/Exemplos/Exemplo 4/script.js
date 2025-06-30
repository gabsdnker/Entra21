function botao1(){
    //Ao clicar no botão, o texto "um" deve ser alterado para "Hello, world!".
    document.getElementById("botao1").innerHTML= "Hello, world!";
}
let contador = 0;

function botao2(){
    //Ao clicar no botão do texto "dois" deve mostrar um contador, e somar 1 sempre ao clicar.
    contador ++;
    document.getElementById("botao2").innerHTML= contador;
}

const array = ["Ana", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor", "Juliana"];
function botao3(){
    //Ao clicar o 3º botão deve mostrar e iterar os elementos de uma array um por um
    document.getElementById("botao3").innerHTML = array[contador];
    contador ++;

    if(contador >= array.length){
        contador = 0;
    }
}

let apareceTexto = true;
function botao4(){
    //Ao clicar no ultimo botão deve mostrar/ocultar o texto "quatro"
    if(apareceTexto){
        document.getElementById("texto2").style.visibility = "hidden";
        apareceTexto = false;
    } else {
        document.getElementById("texto2").style.visibility = "visible";
        apareceTexto = true;
    }
}

