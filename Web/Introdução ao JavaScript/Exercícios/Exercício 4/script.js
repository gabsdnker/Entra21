//Pesquisa de satisfação

let pesquisa = confirm("Você está satisfeito com o serviço ou produto?");
let agradecimento = "Muito obrigado!";

//Se ele estiver satisfeito, então pergutar se desejar dar um feedback
if(pesquisa){
    let feedback = confirm("Deseja fazer um feedback?");
    if(feedback){
        prompt("FeedBack: ");
        alert(agradecimento);
    //Se ele não desejar um feedback, então agradecimento
    } else{
        alert(agradecimento);
    }
//Se ele não gostou do serviço ou produto, então pergunte o que podemos mudar e agradeça
} else{
    prompt("O que podemos mudar?");
    alert(agradecimento);
}