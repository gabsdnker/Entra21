# Introdução ao JavaScript

## Programação

- Possui operadores
- Palavras reservadas (como for, while, etc.)
- ";" no final é opcional 

### Começando a programar

- Utilizar alguma pasta que já contenha os arquivos index.html e style.css
- Criar o arquivo **script.js**
- Linke o script  no HTML.
- JavaScript é levemente tipado
- Criação de varável: ``let nome = valor``
- **let** é quando a variável pode ser alterada.
- **const** é utilizado quando será um valor constante ou em arrays.

## Condição

-  Quando comparamos Strings não precisamos utilizar o ``.equals()``
    - Utilizar **==** e **!=**
- Em razão de não ser tipado é possível comparar números com textos e booleans.
- Porém, para se comparar o "tipo", se utiliza **===** ou **!==**

        let numero = 10
        let texto = '10'

        if (numero == texto){
            // Retorna true
        }

        if(numeor === texto){
            // Retorna false
        }

### Alert

- Como o JavaScript é possível também dar um "alerta" na tela do usuário.
- Utilizando ``alert('Olá mundo')

### Prompt e Confirm

- ``prompt()`` Abre um campo para o usuário digitar
- ``confirm()`` O usuário confirma ou não a ação

        let campo = prompt('Digite'); // retorna o que foi digitado no campo

        let confirmar = confirm('Aceitar ou não'); // pode retornar true ou false

        console.log(campo);
        console.log(confirmar);

## Objetos

- Coleção de atributos compostos  por chave e valor
- Usado para armazenar dados e funcionalidades de forma estruturada
- Para criar um objeto em JavaScript, utilizamos chaves {}
- Dentro delas definimos as propriedades e valores do objeto.

        const carro = {
            marca: "Honda",
            modelo: "Civic",
            ano: 2010,
            cor: "Preto",
            preco: 400000
        };

        console.log(carro);

        console.log(carro.marca);

## Conexão entre HTML e JavaScript

- Nas tags do HTML é possível definir **id** e **name** re com tais atribuitos é possível manipular pelo arquivo JavaScript.

- Utilizaremos principalmente o **id**

- Para modificar um elemento do HTML com JavaScript, é necessário deixar a tag ``<script>`` dentro da tag ``<body>``

        <span id = "texto">sabbdd</span>
        <script src= "script.js"></script>

## Document Object Model (DOM)

- Representa a estrutura da página, permitindo que o JavaScript  possa modificar a estrutura, estilo e conteúdo de uma página.

- Os métodos mais utilizados são:
     - ``getElementById(nome-id)`` Seleciona um único elemento pelo seu id
     - ``getElementByClassName(nome-classe)`` Seleciona elementos pelo nome da classe
     - ``querySelector(seletor)`` Seleciona o primeiro elemento que corresponde ao seletor
     - ``querySelectorAll(seletor)`` Seleciona todos os elementos que correspondem ao seletor

            <p id = "meu-id">Texto original</p>
            <script src="script.js"></script>

            document.getElementById("meu-id").innerHTML = "Texto modificado";

- Também é possível escrever o script dentro do HTML, porém não é considerado uma boa prática ter várias linhas

        <span id = "texto">meu texto antes da mudança</span>
        <script>
        document.getElementById("texto").innerHTML = "Alterando texto";
        </script>
        <p>continuando o html</p>

## Arrays

- Instanciadas com const
- São dinâmicas, podendo alterar o tamanho adicionando ou removendo elementos
- Podem conter elementos de diferentes tipos de dados
- São indexadas a partir do elemento 0(zero)
- Podem ocupar o lugar de uma tag no HTML

        const linguagens = ["HTML", "CSS", "JavaScript"];

        linguagens[1] = "Java";             //Substitui CSS por Java
        console.log(linguagens);            // Saída: ["HTML", "Java", "JavaScript"]
        linguagens[3] = "C#";               //Adiciona C# na 4º posição
        console.log(linguagens);            //Saída: ["HTML", "Java", "JavaScript", "C#"]
        console.log(linguagens.lenght);     //Saída: 4

        <p id="minha-array"></p>
        <script src="script.js"></script>

        linguagens.push("PHP", "Delphi");       //Adiciona PHP e Delphi no final da array
        linguagens.unshift("Python");           //Adiciona PHP no começo da array
        let lingua = linguagens.pop();          //Remove e retorna o último elemento
        let lingua2 = linguagens.shift();       //Remove e retorna o primeiro elemento

        const stringLinguagens = linguagens.join(", ");  //Junta todos os elementos de um array em uma string


