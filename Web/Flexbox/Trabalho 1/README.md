# Criação de um Website

## Websites para prototipação:

https://www.figma.com/pt-br/
https://moqups.com/
https://www.sketch.com/
https://www.fluidui.com/
https://www.lucidchart.com/pages

## Objetivo:

Neste projeto, você irá criar um website de vendas responsivo, com uma página inicial e páginas secundárias, incluindo menus, área de login e cadastro de usuários.

## Especificação técnica e entrega:

- Em todos os itens deverá ser seguido os padrões de usabilidade
- **Deve haver:** uma área de login e cadastro
- **Deve haver:** cabeçalho, menus de navegação (pelo menos 1 com submenu), conteúdo principal e rodapé com as informações dos desenvolvedores e da empresa
- Faça a validação nos campos dos inputs, ao submetê-los
- Deve ser responsivo (adaptável para mobile e desktop)
- Deve possuir um tema de sua escolha (cores, imagens, fontes, etc...)
- Ao clicar em algum menu ou produto, deverá ser redirecionado para as páginas secundárias
- Em todas as páginas deverá ter o logo da empresa aparecendo e ao clicar no logo, deverá ser redirecionado à página principal
- O trabalho pode ser feito em trios
- O trabalho será separado em duas partes:
   - A primeira parte será a parte da prototipação do website em alguma ferramenta 
    visual.
   - A segunda parte será a implementação

## Dicas

- Planejem a estrutura do site, incluindo as seções principais (Página Inicial, página de login e submenus). Isso ajuda na organização do conteúdo e na manutenção de um fluxo de navegação claro
- Pensem na estética geral do design. Considerem a paleta de cores, tipografia e layout. 
- Buscar um design que reflita com a mentalidade da marca
- Incentivem os usuários a agirem, seja explorando mais produtos, entrando em contato para colaboração ou se conectando nas redes sociais
- Façam proveito dos comandos de HTML, CSS e JavaScript mostrados em sala até agora, principalmente pseudo-classes, flexbox e media queries
- Sintam-se à vontade para utilizar elementos não vistos em sala
- Usem como base sites de vendas. Ex: Magazine Luiza, Mercado Livre, Casas Bahia, Amazon, etc

### Tema: Loja Online de Produtos Sustentáveis e Ecológicos

**Nome da loja:** *EcoVibe Store*

Um e-commerce voltado para a venda de produtos sustentáveis, ecológicos e reutilizáveis. O foco é atrair consumidores conscientes que buscam reduzir seu impacto ambiental.

### Categorias de produtos:
- Itens de higiene pessoal (escovas de bambu, shampoos sólidos, desodorantes naturais)
- Utensílios domésticos reutilizáveis (canudos de inox, panos de cera de abelha, potes de vidro)
- Moda sustentável (roupas de algodão orgânico, acessórios reciclados)
- Produtos para pets ecológicos
- Kits de presente ecológicos

## Estilo visual

- **Cores:** Verde musgo, branco, bege claro
- **Fontes:** Sans-serif moderna (ex: Poppins, Lato)
- **Ícones:** Folhas, recicláveis, natureza
- **Logo:** Um símbolo de folha ou planeta com o nome *EcoVibe Store*

## Funcionalidades

Na página **Inicial**: 
    - ao clicar no botão **Compre Agora**, vai para a página de todos os produtos 
    - ao clicar no logotipo vai para a página **Sobre nós**

Na página de todos os **Produtos**: 
    - ao clicar no botão **Menu**, irá abrir uma aba que terá **Contato**, **Login**, **Inicio**, **Sair** e **Carrinho**
    - ao clicar no botão **Produtos**, irá abrir a aba de filtro dos produtos

Na página **Contato**: 
    - Será no **rodapé** das páginas
    - terá email, telefone e endereço da loja e um botão **Sobre nós** 
    - ao clicar no botão **Sobre nós**, vai para a página sobre nós

Na página **Login**: feito
    - Terá o botão **Esqueceu a senha?**, **Login**, **Cadrastrar-se**
    - Para logar terá que colocar email e senha
    - ao clicar no botão **Esqueceu senha**, aparecer uma página para colocar o email e após colocar o email e pedir para redefinir senha ele notifica que **Email de redefinição de senha enviado!**
    - ao clicar no botão **Login**, irá logar na conta do usuário.
    - ao clicar no botão **Cadrastar-se** irá para a página de cadrastro

Na página **Carrinho**: feito
    - Terá os itens que o usuário selecionou para a compra, botão **Pagamento** que vai para a página de pagamento.
    - Cada item terá um botão de excluir ou adicionar quantidades do produto.
    - Se o usuário não tiver logado na loja, o carrinho manda direto para a página de login

Na página **Cadastro**:  
    - Terá o botão **Cadastrar**, para cadastrar precisará de email, nome completo, data de nascimento, cpf, senha e confirmação de senha
    - ao clicar no botão **Cadastrar** ele aparece uma notificação de **Cadastro concluído!** e loga direto na conta desse usuário

Na página **Pagamento**: 
    - Terá o botão **Pagar**, para poder pagar terá que ser as seguintes informações:
        - Forma de Pagamento:
            - Pix
                - Gerar um QRCode e uma chave aleatória
            - Cartão de Crédito
                - Número do cartão
                - Código de segurança
                - Validade do cartão
            - Cartão de Débito
                    - Número do cartão
                    - Código de segurança
                    - Validade do cartão

Na página **Sobre nós**:  
    - Terá a história da loja *EcoVibe Store*
        - Quem Somos
            - A EcoVibe Store nasceu com o propósito de transformar hábitos de consumo e promover um estilo de vida mais consciente e sustentável. Acreditamos que pequenas escolhas diárias podem gerar grandes impactos positivos no planeta.

        - Nossa Missão
            - Oferecer produtos ecológicos, reutilizáveis e de alta qualidade que ajudem nossos clientes a reduzir o uso de plástico, minimizar o desperdício e adotar práticas mais sustentáveis no dia a dia.

        - Nossa Visão
            - Ser referência nacional em comércio sustentável, inspirando pessoas a cuidarem do meio ambiente por meio de escolhas inteligentes e acessíveis.

        - Nossos Valores
            - 🌿 Sustentabilidade em primeiro lugar
            - 💚 Respeito ao meio ambiente e às pessoas
            - 🤝 Transparência e ética em todas as relações
            - 🛍️ Apoio a pequenos produtores e marcas conscientes

        - Nosso Compromisso
            - Todos os nossos produtos são cuidadosamente selecionados com base em critérios ecológicos, como materiais biodegradáveis, embalagens recicláveis e produção ética. Também buscamos parcerias com fornecedores locais e iniciativas que promovem o consumo responsável.

OBS.: 
        - Procurar imagens de produtos ecologicos e tirar o fundoda imagem
        - Colocar mais produtos na página de produtos





