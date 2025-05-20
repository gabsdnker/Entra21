## Introdução ao Banco de Dados

banco de dados <-> servidor web <-> internet <-> usuários

### SGBD

- MySQL
- Oracle
- SQLServer

## Arquiteturas de Banco de Dados

Cliente - Servidor
- Arquitetura mais comum nos dias de hoje.

Distribuidos
- A informação está distribuída em diversos servidores.
- Cada servidor atua como no sistema cliente-servidor.
- Usados quando o volume de informações é muito grande.

## Abordagens de Banco de Dados

Definição

|Nome | CPF | E-mail|

Atributos são colunas

Regras de registros são linhas

## Sistema Gerenciador de Banco de Dados

- SGBDR (Sistema Gerenciador de Banco de Dados Relacional) é o mais utilizado hoje em dia.
- Arquitetura de 3 níveis:
  
      -> Nível externo (visão do usuário)
  
      -> Nível conceitual (visão global do banco de dados)
  
      -> Nível interno (aonde está fisicamente as informações do banco de dados)

## Modelagem

### MER (Modelo entidade-relacionamento)

- Para determinar se uma situação deve ser uma entidade:
  
       -> Há necessidade de guardar informações sobre cada objeto?
  
       -> Há mais de um objeto desse tipo?
  
       -> É possível identificar cada objeto unicamente?

### Tabela

- É uma estrutura de objetos usada para guardar e organizar informações.
- Armazena dados em linhas e colunas
- Cada coluna possui um nome (ex.: cd_aluno, nm_aluno, dt_nascimento).
- Cada coluna tem um tipo de dado específico (ex.: INTEGER, DATE, VARCHAR).

### Chaves Primárias e Estrangeiras

-  Primary Key (PK)

  -> Identificador único e obrigatório da tabela
  
  -> Imutável
  
  -> Não nulo
    
- Foreign Key (FK)
  
  -> Referência da PK me outra tabela.

### Relacionamentos

- São elas:
  
  -> 1 para 1
  
    - Ambas tabelas podem ter somente uma instância em ambos os lados.
    - A maioria das relações "1 para 1" são definidas por regras de negócios.
      
  -> 1 para muitos
  
    - A chave primária contêm somente uma instância que se relaciona a uma ou muitas instâncias da outra tabela.
    - A chave primária da tabela do "lado 1" se torna uma chave estrangeira na tabela do "lado muitos".
      
  -> Muitos para muitos
  
    - Cada instância em ambas as tabelas podem se relacionar a qualquer número de instâncias em outra tabela.
    - Esses relacionamentos requerem uma terceira tabela, chamada de tabela de associação.

### Normalização

- Segue um conjunto de regras chamadas formas normais (FN).
  -> 1º Forma Normal (1FN)
        - Também chamada de regra de atomicidade.
        - Cada célula da tabela deve conter apenas um único valor.
        - Cada coluna deve ter um nome único.

  -> 2º Forma Normal (2FN)
        -  Uma tabela está na 2FN se:
              -> Ela já esta na 1FN.
              -> Todo atributo não-chave é totalmente dependente funcionalmente da chave primária.
  
  -> 3º Forma Normal (3FN)
        - Uma tabela está na 3FN se:
              -> Elá já esta na 2FN.
              -> Todos os atributos não-chave dependem diretamente da chave primária, não de outro atributo não-chave.


    
