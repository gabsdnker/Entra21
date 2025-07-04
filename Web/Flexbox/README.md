# Flexbox

## Position

- Usado para especificar com um elemento é posicionado
- Permite que você posicione tags de forma relativa a outros elementos, á janela do navegador, ou mesmo fixados em um ponto específico.
- Os comandos de position existentes são:
    - ``static`` (padrão)
    - ``relative``
    - ``absolute``
    - ``fixed``
    - ``sticky``

### position: static

- Valor padrão para todos os elementos
- Posicionado de acordo com o fluxo normal da página
- Afeta o layout de outros elementos, ou seja, não se sobrepõe sobre outros elementos.
        No CSS:
                position: static;

### position: relative

- Posicionado em relação á sua posição normal, ocupando o espaço original no layout, mas você pode usar as propriedades **top**, **right**, **bottom** ou **left** para movê-lo em relação á posição original
- Não afeta o layout de outros elementos, ou seja, pode se sobrepor sobre outros elementos
- Usado quando você precisar ajustar levemente a posição de um elemento sem afetar os outros elementos ao seu redor.
        No CSS:
                position: relative;
                top: 0;
                right: 0;
                bottom: 0;
                left: 0;

### position: absolute

- Removido do fluxo normal do documento
- Posicionado em relação ao ancestral posicionado mais próximo (um elemento que tenha um valor de position diferente de **static**)
- As propriedades **top**, **right**, **bottom** e **left** definem sua posição em relação a esse ponto de referência
- Usado para elementos que precisam ser posicionados de forma precisa em relação a outro elemento ou á própria página, como menus suspensos ou (tooltips)
        No CSS:
                position: absolute;
                top: 0;         /* Para colocar algo no topo da tela */
                left: 0;        /* Para colocar algo no lado esquerdo da tela */ 
                right: 0;       /* Para colocar algo no lado direito da tela */
                bottom: 0;      /* Para colocar algo na parte inferior da tela */

### z-index

- Em situações em que os elementos se sobrepõem, a propriedade **z-index** determina qual elemento aparece por cima​

- Por padrão, elementos com **position: relative** ou **absolute** aparecerão sobre aqueles sem posicionamento​

- Caso não especificado, os elementos serão empilhados de acordo com a ordem em que aparecem no HTML (elementos que aparecem depois no HTML ficarão por cima)​

        No HTML:
                <img src="imagem.jfif" style="position: relative; z-index: 1;>
                <img src="imagem.jfif" style="position: relative; right: 400px;>

### position: fixed

- Removido do fluxo normal do documento e posicionado em relação à janela do navegador, permanecendo fixo nesse ponto, mesmo quando a página é rolada​

- As propriedades **top**, **right**, **bottom** e **left** posicionam o elemento em um local fixo na tela, independentemente da rolagem, podendo sobrepor outros elementos​

- Usado para elementos como cabeçalhos, rodapés ou barras laterais que devem permanecer visíveis no mesmo lugar enquanto o usuário rola a página​

        No CSS:
                position: fixed;
                top: 0;
                left: 0;
                right: 0;
                bottom: 0;

### position: sticky

- Se comporta como **relative** até cruzar um limite de rolagem especificado com **top**, **right**, **bottom** ou **left**, momento em que passa a se comportar como **fixed**​

- Usado para elementos como cabeçalhos de tabela ou barras de navegação que devem permanecer visíveis enquanto você rola até um determinado ponto​

        No HTML:
                <img src="images.jfif" style="position: sticky; top: 0; bottom: 0;">

## Display

- Serve para controlar como os elementos são renderizados e se comportam em relação a outros elementos em uma página da web​

- Define como os elementos serão exibidos, influenciando diretamente o layout e a disposição dos elementos na página​

- Os comandos de display existentes são:​

       - ``block:`` <div>, <h1>, <p>, <section>, <header>, <footer>, <nav>, <form>​

       - ``inline :`` <span>, <a>, <strong>, <img>, <label>​

       - ``inline-block:`` <button>, <textarea>​

       - ``grid​``

       - ``none``​

       - ``flex​``

       - ``inline-flex``​

### display: block

- Renderizado como um elemento de nível de bloco, começando em uma nova linha e ocupando toda a largura disponível de seu container​

- Utilizado quando quiser que um elemento fique em uma nova linha e ocupe toda a largura do container​

        No CSS:
                display: block;

### display: inline

- Renderizado como um elemento de nível **inline**, não começa em uma nova linha e ocupa apenas a largura do seu conteúdo​

- Ideal para quando deseja que elementos sejam dispostos lado a lado sem quebrar a linha, por exemplo, estilizar uma palavra dentro de um contexto maior​

- Não pode definir uma largura / altura específica​

        No CSS:
                display: inline;

### display: inline-block

- Combina características de **block** e **inline**​

- O elemento se comporta como **inline**, mas permite definir largura e altura como um elemento de bloco​

        No CSS:
                display: inline-block;

### display: grid

- O elemento se torna um container de grade, permitindo um layout bidimensional (linhas e colunas)​

- Ideal para criar layouts mais complexos, onde os itens precisam ser organizados tanto na vertical quanto na horizontal, ex: calculadoras​

        No CSS:
                display: grid;

### display: none

- O elemento é removido do fluxo do documento e não ocupa nenhum espaço na página​

- É como se o elemento não existisse no HTML​

- Diferente de ``visibility: hidden`` que torna o elemento invisível, mas ainda ocupa espaço​

        No CSS:
                display: none;

### display: flex e inline-flex​

``flex``

- O elemento se torna um container flexível, permitindo que os elementos sejam dispostos usando o modelo **Flexbox**

``​inline-flex​``

- Similar a ``display: flex``, mas o próprio container flexível é tratado como um elemento **inline**, permitindo que seus filhos sejam itens **flex**​

- Usado quando se deseja que um container flexível esteja **inline**, mas com a flexibilidade do **Flexbox** para seus elementos filhos​

        No CSS:
                display: flex;          /* Habilita o uso de flexbox */
                display: inline-flex;   /* Habilita o uso de flexbox */

## Introdução 

- Usado para adaptar as divs à largura da página​

- Usado para mudar o comportamento do **css** a partir de uma largura de tela específica (**media queries**) ​

- Será habilitado a partir do comando ``display: flex`` colocado no container​

- São separados em comandos aplicados no container e comandos aplicados em tags específicas

## Flexbox no container

- Os comandos aplicados no container são separados em 3 tópicos​

       - Direção do conteúdo na vertical ou na horizontal (**flex-direction**)​

       - Quebra de linha, uma div ir para a linha de baixo quando redimensionado (**flex-wrap**)​

       - Posição do conteúdo (**justify-content**, **align-items** e **align-content**)​

- Observe que a propriedade ``display: flex`` é aplicada apenas ao container, sem afetar diretamente os elementos filhos

### flex-direction

- Colunas são geralmente usadas em menus laterais, smartphones ou telas pequenas​

- Alternando o **flex-direction**, a direção do eixo também é alternada​

        Horizontal:
                flex-direction: row;​
​
        Vertical:
                flex-direction: column;​

## Eixos do Flexbox: principal​

- O eixo principal é o eixo padrão que os itens são colocados dentro do container, com sua direção sendo determinada pela propriedade **flex-direction​**

- Os eixos são os seguintes:​

       - Horizontal da esquerda para a direita (``flex-direction: row``)​

       - Vertical de cima para baixo (``flex-direction: column``)​

- Controla como os itens são alinhados em relação à:​

        - Largura do container (se o eixo principal for horizontal)​

        - Altura do container (se o eixo principal for vertical)	​

- Os eixos também podem ser invertidos com **row-reverse** ou **column-reverse​**

## Eixos do Flexbox: cruzado

- Também chamado de transversal, é o eixo perpendicular ao eixo principal​

- Os eixos são os seguintes:​

        - Se o eixo principal for horizontal: O eixo cruzado é vertical​

        - Se o eixo principal for vertical: O eixo cruzado é horizontal​

- Controla como os itens são alinhados em relação:​

        - Altura do container (se o eixo principal for horizontal)​

        - Largura do container (se o eixo principal for vertical)

### flex-wrap

- É possível usar ``flex-wrap: nowrap`` para impedir de ir para a outra linha​

        Tamanho reduzido​:
                flex-wrap: wrap;​
​

## Posição do conteúdo (justify-content)​

- Alinha os conteúdos a partir do **eixo principal​**

          justify-content: center;​
          justify-content: flex-start;​

## Posição do conteúdo (align-items)​

- Alinha os conteúdos a partir do **eixo cruzado​**

          align-items: center;​
          align-items: flex-start;​
          align-items: stretch; (padrão)  ​

## Centramento Perfeito

- Para obtermos um centramento perfeito de uma div em um container podemos utilizar ``align-items: center`` e ``justify-content: center``
- Essa técnica funciona independentemente do tamanho ou forma da **div**


