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
  	  INSERT INTO pessoa(cd_pessoa, nm_pessoa, salaris)
  	  VALUES (1, 'João', 5000),
  	  (2, 'Mateus', 4000);

     	- Para deixar algum valor nulo:
  	     INSERT INTO pessoa(cd_pessoa, nm_pessoa, salario)
  	     VALUES (1, 'João', 5000),
  	  	(2, 'Mateus', 4000),
		(3, 'Marcas', NULL);
