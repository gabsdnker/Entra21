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