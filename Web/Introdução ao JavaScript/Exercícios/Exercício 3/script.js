// Perguntando para o usuário se ele deseja pedir uma pizza
let pedirPizza= confirm("Você deseja pedir uma pizza?");

// Se o usuário confirmar, solicita o sabor da pizza
if(pedirPizza){
    prompt("Qual seu sabor de pizza favorito?");
    alert("Sabor favorito confirmado!");
} else {
    alert("Muito obrigado!");
}