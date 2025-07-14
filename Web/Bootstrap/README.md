# Bootstrap

## Como criar um projeto

- Precisa importar os links **CDN**
- Se atentar com a ordem!!

## Sistema de Grade (Grid System)

- O Bootstrap utiliza um layout de grade de 12 colunas
- Esse sistema se ajusta automaticamente baseado no tamanho de tela do dispositivo

## Container 

- Um container é uma classe que envolve e contém o conteúdo da página
- Usados para fornecer um layout consistente e centralizado para o conteúdo do seu site, garantindo espaçamento e alinhamento adequados
- O Bootstrap oferece dois principais de containers: **container** e **container-fluid**
    - ``.container`` Criar um container de largura fixa que se adapta a tamanho da tela. 
    - ``.container-fluid`` Cria um container de largura total que se estende por toda a largura do navegador, sendo adequado para designs que precisam preencher toda a largura da janela do navegador​

## Column

- Colunas devem ser colocadas dentro de uma linha (classe row) para conter as colunas e garantir um alinhamento e espaçamento adequado​

- O Bootstrap fornece classes para definir a largura das colunas com base no número de colunas que um elemento específico deve ocupar. Por exemplo, col-6 ocupa 6 colunas, col-4 ocupa 4 colunas​

- Os alinhamentos continuarão sendo feitos pelo ``justify-content`` e ``align-items``

## Componentes: navbar

- Utilizado para criar barras de navegação responsivas​
- Usado no lugar do header
- É possível usar a classe ``.navbar-expand`` para controlar quando que o menu mudará de formato​
- Ou seja, quando que será transformado de horizontal para vertical ou vice versa

## Componentes: spacing

- No Bootstrap, os espaçamentos são separados em m (margin) e p (padding)​
- As direções são separadas em:​

    - t (top)​
    - b (bottom)​
    - s (left)​
    - e (right)​
    - x (left e right)​
    - y (top e bottom)​

- A quantidade vai de 0-5​

## Componentes: button

- O Bootstrap oferece uma variedade de estilos e opções para criar botões visualmente atraentes e responsivos​
- Os botões são separados em diferentes finalidades, como ações principais, ações secundárias ou elementos puramente decorativos​

## Componentes: carousel

- O Carousel, também chamado de Slideshow é uma classe para percorrer imagens e vídeos​

## Componentes: dropdowns

- Um menu dropdown é um menu ativável usado para escolher de uma lista predefinida​
- Fornecem uma maneira de apresentar uma lista de opções ou ações aos usuários de forma compacta e organizada​
- Pode ser utilizado para diversos fins, como menus de navegação ou controles de formulários​

## Componentes: pagination

- Utilizado para criar um conjunto de links de navegação, permitindo a navegação por grandes conjuntos de dados ou conteúdos que são muito longos para caber em uma única página​
- A estrutura básica de um componente de paginação inclui um elemento pai **ul** com cada link de página envolto em um elemento **li**​

## Documentação: 
getbootstrap.com/docs/5.3/getting-started/introduction/​

