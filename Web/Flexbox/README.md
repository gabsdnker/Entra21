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

        position: static;

### position: relative

- Posicionado em relação á sua posição normal, ocupando o espaço original no layout, mas você pode usar as propriedades **top**, **right**, **bottom** ou **left** para movê-lo em relação á posição original
- Não afeta o layout de outros elementos, ou seja, pode se sobrepor sobre outros elementos
- Usado quando você precisar ajustar levemente a posição de um elemento sem afetar os outros elementos ao seu redor.

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

        position: absolute;
        top: 0;
        left: 0;
        right: 0;
        bottom: 0;
