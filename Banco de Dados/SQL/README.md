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
 
- Criação de tabela

CREATE TABLE nome_tabela(
  cd_pessoa INTEGER;
  nm_pessoa VARCHAR(50);
)
