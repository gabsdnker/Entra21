//Criando cadastro de pessoas
console.log("Cadastro de pessoas");

//Perguntar ao usuário se ele deseja inserir uma nova pessoa
let confirmacao = confirm("Deseja inserir uma nova pessoa?");
while(confirmacao){

    //Criando objeto
    let cadastro = {
        nome: prompt("Digite o nome da pessoa:"),
        idade: prompt("Digite a idade:"),
        email: prompt("Digite o email:")
    };

    //Exibindo o objeto
    alert("Nome: " + cadastro.nome + "\n" +
          "Idade: " + cadastro.idade + "\n" +
          "Email: " + cadastro.email);
    
    //Perguntando se o usuário deseja inserir outra pessoa
    confirmacao = confirm("Deseja inserir outra pessoa?");
}

