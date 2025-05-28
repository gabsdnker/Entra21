# Introdução ao SQL

- Não é case sensitive
- Utilizada para interagir com os principais SGBD relacionais através de instruções/ comandos.
- Existes algumas recomendações para nomeclatura de tabelas e colunas:
    - Comece sempre com uma letra
    - Utilize no máximo 30 caracteres
    - Dê preferencia as caracteres A-Z, a-z, 0-9 e _
    - Não duplique o nome de outro objeto de propriedade do mesmo usuário

- Instalar MariaDB/ MySQL
  - https://mariadb.org/download/
  - long-term release is MariaDB 11.4

  - https://dev.mysql.com/downloads/installer/
  
- IDE HeidiSQL
  - https://www.heidisql.com/download.php?download=portable-64
  - 64 bit
  - Notepad++
 
- Criação de tabela

CREATE TABLE pessoa(
	cd_pessoa INTEGER,
	nm_pessoa VARCHAR(50),
	fl_estado_civil CHAR(1)
	);

# Manipulação de Dados

- INSERT
  
	INSERT INTO nome_tabela (coluna1, coluna2, ...)
	VALUES(valor1, valor2, ...);

	- Para inserir várias instâncias:
	
		INSERT INTO pessoa(cd_pessoa, nm_pessoa, salario)
		VALUES (1, 'João', 5000),
		(2, 'Mateus', 4000));
	
	- Para deixar algum valor nulo:
	
		INSERT INTO pessoa(cd_pessoa, nm_pessoa, salario)
		VALUES (1, 'João', 5000),
		(2, 'Mateus', 4000),
		(3, 'Marcas', NULL));

# Restrição de Dados

- NOT NULL
    - Impede que uma coluna receba valores nulos(NULL)
      
      	CREATE TABLE funcionario(
      	cd_funcionario INTEGER,
      	nome VARCHAR(50) NOT NULL,
      	cargo VARCHAR(50),
      	salario DECIMAL(10) NOT NULL,
      	PRIMARY KEY(cd_funcionario));

- UNIQUE
    - Garante que os valores daquela coluna não se repitam em nenhuma outra inserção.
    - No MariaBD e MySQL a restrição *UNIQUE* não garante que o valor inserido não será nulo.
      
      	CREATE TABLE funcionario(
      	cd_funcionario INTEGER,
      	nome VARCHAR(50) NOT NULL,
      	email VARCHAR(50) UNIQUE,
      	cargo VARCHAR(50),
      	salario DECIMAL(10) NOT NULL,
      	PRIMARY KEY(cd_funcionario));

- AUTO_INCREMENT
   - Gera números sequencias únicos automaticamente sempre que uma nova linha é inserida na tabela.
   - Geralmente usado em chaves primárias para garantir que cada registro tenha um identificador único.
   - Se você insrir um valor manualmente, o SGBD continuará a partir do maior valor já usado.
   - Somente 1 *AUTO_INCREMENT* é permitido por tabela.
     
     	CREATE TABLE funcionario(
     	cd_funcionario INTEGER AUTO_INCREMENT,
     	nome VARCHAR(50) NOT NULL,
     	email VARCHAR(50),
     	cargo VARCHAR(50),
     	salario DECIMAL(10) NOT NULL,
     	PRIMARY KEY (cd_funcionario));

 - Inserindo os valores com a restrição AUTO_INCREMENT:
   
   	INSERT INTO funcionario(nome, email, cargo, salario)
   	VALUES ('Carlos', 'email@email.com', 'Analista', 4500.00),
   	('Gabriel', 'email2@email.com', 'RH', 4000.00));

- PRIMARY KEY
   - Uma (ou conjunto de) coluna usada para identificar de forma única cada registro em uma tabela.
   - Une as restrições de  *UNIQUE* e *NOT NULL*.

- FOREIGN KEY
   - Restrição que cria um vínculo entre duas tabelas no banco de dados.
   - Serve para garantir integridade referencial, ou seja, um valor em uma tabela só pode existir se estiver presente na tabela relacionada.
   - A tabela filha (dependente) tem a chave estrangeira.
   - A tabela pai (referenciada) tem chave primária que está sendo referida.

- CHECK
   - Usada para limitar valores que podem ser inseridos em uma coluna com base em uma condição lógica.
   - Se a condição for falsa, o banco rejeita a inserção ou atualização.
     
     	CREATE TABLE funcionario(
     	cd_funcionario INTEGER AUTO_INCREMENT,
     	nome VARCHAR(50) NOT NULL,
     	email VARCHAR(50),
     	cargo VARCHAR(50),
     	salario DECIMAL(10) NOT NULL,
     	CHECK (salario > 0),
     	PRIMARY KEY (cd_funcionario));

     - Inserindo os valores com a restrição CHECK:
       
       	 INSERT INTO funcionario(nome, email, cargo, salario)
   	 VALUES ('Carlos', 'email@email.com', 'Analista', -5));  -> ``SQL Error``

- DEFAULT
   - Define um valor padrão para uma coluna quando nenhum valor é explicitamente informado durante uma operação de *INSERT*.
   - Se você não passar um valor para a coluna, o SGBD usará o valor *DEFAULT* que foi definido.
     
       CREATE TABLE funcionario(
     	cd_funcionario INTEGER AUTO_INCREMENT,
     	nome VARCHAR(50) NOT NULL,
     	email VARCHAR(50) UNIQUE,
     	cargo VARCHAR(50) DEFAULT 'RH',
     	salario DECIMAL(10) NOT NULL,
     	PRIMARY KEY (cd_funcionario));

     - Inserindo os valores com a restrição DEFAULT:
       
         INSERT INTO funcionario(nome, email, salario)
   	 VALUES ('Carlos', 'email@email.com', 2000));

# Seleção de Dados 

SELECT
- Utilizado para recuperar dados de uma ou mais tabelas.
- Principal comando da linguagem
- Estatísticas mostram que mais de 70% das operações em um SGBD relacional correspondem a consultas aos dados
- Seleciona, restringe, projeta e agrupa dados de uma ou mais tabelas.
- Gera diferentes visões sobre os mesmos dados.

   Comandos:
    -  O comando ``SELECT`` pode apresentar até seis cláusulas, sendo que duas delas são obrigatórias ``SELECT E FROM``
 
      ``FROM`` Qual tabela(s) deve ser recuperada
      ``ORDER BY`` Oredenamento dos dados
      ``SELECT`` Informar quais colunas deseja recuperar
      ``WHERE`` Informar as condições que os dados a serem recuperados devem atender

  	SELECT
  	{*, coluna[apelido], coluna[apelido], ...}
  	FROM
  	{tabela[apelido], tabela[apelido], ...}
  	WHERE
  	{condição, condição, ...}
  	GROUP BY
  	{coluna_agrupamento, coluna_agrupamento, ...}
  	HAVING
  	{condição_função_agrupamento, condição_função_agrupamento, ...}
  	ORDER BY
  	{coluna, coluna, ...}

  - SELECT

	SELECT coluna1, coluna1, ...
	FROM tabela;

	- Para selecionar todas as colunas de uma tabela, use SELECT*
    
    	SELECT *
    	FROM tabela;

    	- Para selecionar somente algumas colunas

       	SELECT nm_departamento, localização(Colunas)
    	FROM departamento; (Tabela
       

  - WHERE

	- A cláusula ``WHERE`` é usada para filtrar os registros de uma tabela com base em uma condição.
    	-  Serve para dizer ao banco de dados quais linhas devem ser retornadas de acordo com critérios definidos.

       	SELECT coluna1, coluna2, ...
    	FROM tabela
    	WHERE condição;

       	SELECT nm_departamento, localizacao
    	FROM departamento
    	WHERE localizacao = 'Blumenau';

  - ORDER BY

	- Para ordenar em ordem descrescente

		SELECT  nm_pessoa, salario
		FROM pessoa
		ORDER BY salario DESC;

	- Para ordenar em ordem crescente (padrão, podendo ser omitida)

		SELECT  nm_pessoa, salario
		FROM pessoa
		ORDER BY salario ASC;	

  - JOIN

	- Usado para combinar linhas de 2 ou mais tabelas baseadas em uma coluna relacionada entre eles (normalmente atributos chaves).
	- Por exemplo, se você possui uma tabela ``Departamento`` e uma tabela ``Funcionario``, pode realizar um join entre elas usando a coluna ``cd_departamento`` para exibir os pedidos de  cada funcionário juntamente com o nome do departamento que ele trabalha.

  - INNER JOIN

      - Só retorna as linhas que possuem correspondência nas duas tabelas.
      - Se não houver correspondência, nada será exibido.
      - O comando ON define a condição de junção das tabelas.

	SELECT colunas
	FROM tabela1
	INNER JOIN tabela2
	ON tabela1.coluna = tabela2.coluna;

