# APIs

## JavaScript Object Notation (JSON)

- Formato de dados baseado em texto usado para armazenar e trocar informações
- Representa informações estruturadas como pares chave-valor, arrays ou combinações aninhadas desses elementos
- Deriva da sintaxe de objetos JavaScript, mas é apenas um formato de dados, sendo mais restrito e limitado, então não suporta funções ou métodos
- Embora tenha origem na sintaxe do JavaScript, o JSON é independente de linguagem, sendo amplamente utilizado em aplicações web, **APIs** e armazenamento de dados

        {
            "marca":"Honda",
            "modelo": "Civic",
            "ano": 2010
        }


## No JavaScript 

- No JavaScript, o JSON é usado principalmente para:
    - Serialização: Converter objetos ou arrays JavaScript em strings JSON **(stringify)**
    - Desserialização: Converter strings JSON em objetos ou arrays JavaScript **(parse)**
    - Trocar dados entre cliente e servidor (APIs), a partir de **requisições HTTP**
    - Armazenar dados estruturados em arquivos ``.json``

## Serialização (Stringify)

- Converte objetos ou arrays JavaScript em strings **JSON**

        //Exemplo de uso do JSON.stringify
        const objeto = {marca: "Honda", modelo: "Civic", ano: 2010}; //Objeto JavaScript
        const stringJson = JSON.stringify(objeto); //Converte o objeto JavaScript em uma string JSON
        console.log(stringJson); //Exibe a string JSON resultante

## Desserialização (Parse)

- Converteuma string **JSON** em um objeto ou array JavaScript

//Exemplo de uso do JSON.parse
const string = '{"marca": "Honda", "modelo": "Civic", "ano": 2010}'; //String JSON
const obj = JSON.parse(string); //Converte a string JSON em um objeto JavaScript 
console.log(obj.marca); //Acessa a propriedade "marca" do objeto
console.log(obj.modelo); //Acessa a propriedade "modelo" do objeto
console.log(obj.ano); //Acessa a propriedade "ano" do objeto

## Introdução a APIs

- Conjunto de regras e protocolos que permitem que diferentes aplicativos de software se comuniquem entre si

- Podem ser categorizadas por:

    - Escopo de acesso (públicas, parceiras, privadas).
    - Estilo arquitetural (REST, SOAP, GraphQL, gRPC).
    - Caso de uso (APIs de dados, APIs de SO, APIs de hardware).

- APIs web utilizam o protocolo **HTTP**

## REST

- Serve como um conjunto de regras e convenções para construir e interagir com serviços web.

- Geralmente utiliza JSON para a transferência de dados.

- É **stateless** (sem estado): Cada requisição do cliente deve conter todas as informações necessárias para o servidor processá-la. O servidor não armazena nenhum estado de sessão entre requisições.

- O cliente e o servidor são independentes.

## Métodos HTTP

- Métodos de requisição suportados pelo protocolo HTTP.

- Cada método indica um tipo específico de operação a ser realizada.

- São eles:

    - GET
    - POST
    - PUT
    - DELETE

## GET

- Tem o objetivo de recuperar dados de um servidor no recurso especificado.

- Ex: 

    - Buscar um perfil de usuário.
    - Carregar uma lista.
    - Carregar uma página web ou uma imagem

- Não modifica nenhum dado no servidor.

- Múltiplas requisições idênticas geram o mesmo resultado (idempotente).

- Não possui corpo de requisição.


## POST

- Tem o objetivo de enviar dados para serem processados em um recurso especificado.

- Ex:
    - Criar um novo usuário
    - Publicar algo em uma rede social
    - Enviar um formulário

- Carrega dados no corpo em formato JSON.

## PUT

- Tem o objetivo de atualizar algum recurso, substituindo pelos dados enviados no corpo da requisição.

- Ex:

    - Atualizar número de contato de um usuário.

- Se o recurso não existir, alguns servidores podem criá-lo.

## DELETE

- Tem o objetivo de remover o recurso especificado.

- Ex:

    - Deletar um usuário

## Status Codes

- Códigos de três dígitos padronizados que os servidores enviam em resposta a uma requisição HTTP de um cliente, indicando o resultado da requisição.

- Agrupados em cinco classes, cada uma começando com um dígito diferente (1xx a 5xx).

    - 1xx - Informativo: Requisição recebida, processo em continuidade
    - 2xx - Sucesso: A ação foi recebida, compreendida e aceita com sucesso
    - 3xx - Redirecionamento: Ação adicional é necessária para completar a requisição
    - 4xx - Erro do cliente: A requisição contém sintaxe incorreta ou não pode ser atendida
    - 5xx - Erro do servidor: O servidor falhou em atender uma requisição

## 2xx (Sucesso)

- 200 (OK):

    - A requisição foi bem-sucedida, e a resposta contém os dados solicitados
    - Código de sucesso genérico

- 201 (Created):

    - A requisição resultou na criação de um novo recurso
    - Geralmente utilizado com requisições POST

- 204 (No Content):

    - A requisição foi bem-sucedida, mas não há conteúdo para retornar
    - Frequentemente usado para atualizações ou exclusões

## 4xx (Erro do Cliente)

- 400 (Bad Request):

    - O servidor não pode processar a requisição devido a um erro do cliente
    - Exemplo: Um JSON malformado em uma requisição POST

- 401 (Unauthorized):

    - A requisição exige autenticação, mas o cliente não forneceu credenciais (tokens) válidas

- 403 (Forbidden):

    - O cliente está autenticado, mas não tem permissão para acessar o recurso

- 404 (Not Found):

    - O servidor não consegue encontrar o recurso solicitado

- 429 (Too Many Requests):

    - Cliente enviou muitas requisições ao servidor em um curto período de tempo, ultrapassando os limites estabelecidos pelo servidor

## 5xx (Erro do servidor)

- 500 (Internal Server Error):

    - Erro genérico indicando que o servidor encontrou uma condição inesperada

- 503 (Service Unavailable):

    - O servidor está temporariamente indisponível, muitas vezes devido a manutenção ou sobrecarga

## Fetch

- API moderna do JavaScript utilizada para fazer requisições HTTP.

- Substitui o **XMLHttpRequest**

        fetch(/* `resource`, {options} */) //Retrona uma Promise
            .then(response => response.json()) //Converte a resposta em JSON
            .then(data => {
                console.log(data)
            }) // Trabalha com os dados
            .catch(error => {
                console.error(`Erro: ${error}`)
            }); //Captura e exibe erros