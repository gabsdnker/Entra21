# Introdução à Web

As principais linguagens para desenvolvimento web são:
- JavaScript
- PHP (Back-End)
- Java Spring Boot (Back-End)
- HTML (não é considerado uma linguagem de programação)
- CSS (não é considerado uma linguagem de programação)

## O que o navegador entende?

- Um compuntador não consegue compilar Java nativamente, para isso precisamos de uma JVM (Java Virtual Machine)
- Nossos navegadores entendem por padrão HTML, CSS e JavaScript

## HTML, CSS, Java Script 

- Podemos dizer que o HTML é o 'esqueleto do site'.
- CSS é a roupa, aparência, cor
- E o JavaScript é o cérebro

## O que é HTML?

- Não é uma linguagem de programação
- Constitui uma programação em tags, sendo sua fórmula: ``<tag>`` conteúdo ``</tag>``

## O que é CSS?

- Dá a aparência ao site
- Todos comandos terminam em ';'
- Assim como no Java, para abrir um corpo se usa '{' e '}'

## O que é JavaScript?

- É uma linguagem para fazer os cálculos e comparações do site
- Variáveis podem ser criadas usando palavras-chave como 'var', 'let' ou 'const'
- É uma linguagem levemente tipada, ou seja, as variáveis podem conter diversos tipos de dados, como números, strings ou objetos

# Introdução ao Visual Studio Code

- Visual Studio Code (os VS Code)
- Desenvolvido pela Microsoft
- Possui compatibilidade com várias linguagens

## Dicas de Extensões

- O VS Code utiliza 'extensões', ou seja ele é customizável
- As extensões que utilizaremos são:
  - Live Server
  - Material Icon

# Introdução ao HTML

## Estrutura

- ``!DOCTYPE`` Tipo do documento
- ``HTML lang`` Linguagem do documento
- ``meta charset`` Lista de caracteres que serão escritos no documento
- ``meta name`` Define a área usável da tela
-  A tag ``<title>`` é onde está escrito o nome que aparecerá na aba do navegador
-  O esqueleto da nossa página fica dentro da tag ``<body>``
-  O HTML é uma linguagem estruturada em tags, com a tag ``<div>`` sendo uma tag genérica
-  A maioria das tags servem mais como divisões semânticas do que sintáticas


# Introdução ao CSS

## Criando arquivo

- Dentro da pasta escolhida para o projeto, crie um arquivo chamado style.css
- Diferente do HTML, o CSS não possui uma estrutura inicial
- Porém , é recomendado sempre começar "zerando a página" (CSS Reset).

## Conectando HTML e CSS

- Somente o arquivo CSS sozinho não afeta nossa página
- Para isso adicionamos ao nosso HTML, no final do ``head`` , a tag que referência o estilo:
  ``<link rel= "stylesheet" href= "style.css">``

## Propriedades básicas CSS

``background-color`` -> Altera a cor de fundo
``font-family`` -> Altera o estilo da letra do texto
``color`` -> Altera a cor do texto
``font-size`` -> Tamanho do texto
``text-align`` -> Alinhamento do texto
``margin`` -> Define uma margem
``width`` -> Define a largura
``height`` -> Define a altura

## Criando classes

- As vezes possuímos muitas tags iguais que não terão o mesmo estilo.
- Ou temos algum estilo (cor, tamanho, etc) que se repete por diversas partes na nossa página.
- Para isso criamos uma classe no arquivo CSS dessa maneira: ``.nomeDaClasse{}``
- No HTML dentro da tag definimos como: ``class = "nome-classe"``
- São estilos reutilizáveis que permitem aplicar o mesmo conjunto de estilos a vários elementos em uma página da web.
- Podemos aplicar mais de uma classe  na tag

### Exemplos de classes

.textoImagem {
  margin-left: 50px;
  color: blue;
  font-family: 'Courier New', Courier, monospace;
}

<div class= "textoImagem"></div>

<div class= "classe1 classe2"></div>

.card {
width : 300px;
height: 5vh;
background-color: aqua;
}
<body>
<div class= "card"></div>
</body>

## Inline style

- É possivel aplicar estilos diretamente em uma tag usando o atributo style.
- Recomendado aplicar um estilo a m elemento sem editar o arquivo CSS
- Aplica somente ao elemento aonde são definidos.

## Padding

- Espaço interno entre o conteúdo de um elemento e sua borda.

## Margin

- Usada para criar espaço ao redor dos elementos.
- Define o espaço mais externo de umm elemento, afastando-o dos elementos ao seu redor.
- Diferente do padding, que cria espaço dentro do elemento (entre o conteúdo e a borda), a margem afeta o espaço fora da borda.

## nth-child()

- Permite selecionar elementos com base em sua posição entre seus irmãos
- Utilizando para estilizar elementos em sequência, como alternar cores de linhas em tabelas, listas ou qualquer outra estrutura repetitiva.

### Os mais usados são:

``nth-child(even)`` -> Para as linhas pares

``nth-child(odd)`` -> Para as linhas ímpares

``nth-child(3n)`` -> Para as linhas múltiplas de 3

``nth-child(5)`` -> Para a quinta linha

``first-child`` -> Para a primeira linha

``last-child`` -> Para a última linha

## Hierarquia de Especificidade

- Determina quais estilos são aplicados a um elemento quando há regras conflitantes 
- Calculada com base no tipo de seletor usado

### Ordem de hierarquia do menor para o maior:

- Seletor de tipo
  
- Seletor de classe e pseudo-classe ``.texto``
  
- Seletor de ID ``#principal``
  
- Estilos inline
  
- ``!important`` (não recomendado)

