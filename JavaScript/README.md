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

## Funções no JavaScript

- Fórmula: ``function nomeDaFuncao(paramentros){corpo da função}``
- Pode ser executada de algumas formas, por exemplo, ao clicar em um botão

        No JavaScript:
                function aoClicarNoBotao(){
                        console.log("olá,mundo");
                }
        
        No HTML:
                <button onclick="aoClicarNoBotao()">teste</button>

## Modificar CSS com JavaScript

- É possível modificar o CSS através do JavaScript, alterando dinamicamente a aparência dos elementos.

        document.getElementById("minha-id").style.color = "red";

**As mais usadas são:**

- Alteração Inline:
        - Altera diretamente a aparência de um elemento HTML usando a propriedade .style no JavaScript.
        - No JavaScript os nomes das propriedades CSS devem ser escritos em camelCase

- Adicionar ou remover classes:
        -Em vez de modificar estilos diretamente você pode aplicar estilos predefinidos adicionando ou removendo classes

                document.getElementById("minha-id").classList.add("nome-classe);
                document.getElementById("minha-id").classList.remove("nome-classe");

## Formulários

- ``<form>`` será a tag mãe, dentro da tag pode ser colocada a ação que será feita como back-end.

- ``label`` é o rótulo do input, precisa ter a tag for com o mesmo nome da id do **input/textarea** 

- A tag ``type`` dita o tipo do input

- A tag ``name`` serve para o back-end reconhecer o conteúdo do input.

- O formulário é enviado a partir de um ``button`` , idealmente de tipo ``submit``

        No HTML:
                <label for="email">Insira o email</label>
                <input type = "email" id="email" name= "email"/><br>

                <label for="senha">Insira o email</label>
                <input type = "password" id="senha" name= "senha"/><br>

                <label for="descricao">Insira uma descrição sua</label>
                <textarea id="descricao" name="descricao"></textarea>

                <button type="submit">Enviar</button>

### Botões no final de um formulário

- No final de um formulário  é normalmente encontrada um botão, esses botões podem ser vários tipos, cada um servindo a um propósito específico.
- Os tipos mais comuns são:

        - **Submit (padrão em formulários):** Envia os dados do formulário para o servidor, é necessário um back-end

        - **Button:** Vai realizar alguma ação a partir da função chamada pelo botão.

        - **Reset:** Restaura todos os campos do formulário para seus valores iniciais, sem enviar dados ou requisições ao servidor.

### Botões de rádio (Radio buttons)

-  Permite selecionar somente 1 botão a partir de vários
-  A tag **name** defimirá o grupo dos botões e sua exclusividade.
-  A tag **value** é o valor que será enviado para o back-end.
-  Pode usar a tag **checked** após **value** para ter um botão pré-selecionado e a tag **disbled** para desabilitar um botão.

        <form>
                <label for="email":>Email:</label>
                <input type="email" id="email" name="email"/><br><br>

                <label for="senha">Senha:</label>
                <input type="password" id="senha" name="senha"/><br><br>

                <label for="descricao">Insira uma descrição sua:</label>
                <input type="text" id="descricao" name="descricao"/><br><br>

                <button type="submit">Enviar</button>
                <button type="reset">Limpar</button>
        </form>

### Checkbox

- Permite selecionar 0 ou mais opções

        <form>  
                <input type="checkbox" id="html" name="curso" value="html">
                <label for="html">HTML</label><br><br>
                <input type="checkbox" id="css" name="curso" value="css">
                <label for="css"> CSS</label><br><br>
                <input type="checkbox" id="javascript" name="curso" value="javascript">
                <label for="javascript">JavaScript</label><br><br>
                <input type="checkbox" id="java" name="curso" value="java">
                <label for="java">Java</label><br><br>
                <button type="submit">Enviar</button>
        </form>

### Select

- Usado para criar uma lista drop-down
- É separado por um **select** que será o menu drop-down
- E vários **option** que são as escolhas do usuário
- Para simular um **placeholder**: o primeiro **option** pode ter as tags **disabled**, **selcted** e **value=""** com o **select** tendo a tag **required**
- **optgroup** separa as opções por categoria

        <form>
                <label for="linguagem">Linguagem de Programação:</label>
                <select id="linguagem" name="linguagem">
                        <option value="" disabled selected>Selecione</option>
                        <optgroup label="Front-end">
                        <option value="html">HTML</option>
                        <option value="css">CSS</option>
                        <option value="javascript">JavaScript</option>
                        </optgroup>
                        <optgroup label="Back-end">
                        <option value="java">Java</option>
                        <option value="python">Python</option>
                        <option value="php">PHP</option>
                        </optgroup>
                </select>
                <button type="submit">Enviar</button>
        </form>


### Datalist

- Parecido com o select, porém com a opção de autocomplete ao usuário digitar as opções.

         <form> 
             <input list= "linguagen" name="linguagens">
             <datalist id= "linguagens">
                   <option value= "HTML">
                   <option value= "CSS">
                   <option value= "JavaScript">
                   <option value= "C#">
                   <option value= "Java">
             </datalist>
             <button type= "submit">Enviar</button>
         </form>


## Validação 

- É considerada boa prática algumas das validações estarem no JavaScript em vez do back-end
- Por exemplo: para obter a informação inserida como texto é necessário pegar o **value** dos **inputs**
- Com o **value** podemos validar o formulário
- Podemos redirecionar para outra página com o comando **window.location.href =“**

     No HTML:

        <form>
           <label for= "nome">Insira seu nome</label>
           <input type="text" id= "nome" name= "nome">
       
           <button type="submit" onclick="validarNome()">Enviar</button>
        </form>

