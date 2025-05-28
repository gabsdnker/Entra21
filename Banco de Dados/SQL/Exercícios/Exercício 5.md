Utilizando o script de criação das tabelas da questão anterior, faça um outro banco de dados (ou modifiquem as tabelas) para conter as restrições que vimos na aula.

    #CRIANDO TABELAS
    CREATE TABLE Combustivel(
    cd_combustivel INTEGER,
    ds_combustivel VARCHAR(30) NOT NULL UNIQUE,
    PRIMARY KEY (cd_combustivel));
    
    CREATE TABLE Marca(
    cd_marca INTEGER,
    ds_marca VARCHAR(30) NOT NULL UNIQUE,
    PRIMARY KEY (cd_marca));
    
    CREATE TABLE Localidade(
    cd_localidade INTEGER,
    nm_localidade VARCHAR(50) NOT NULL UNIQUE,
    PRIMARY KEY (cd_localidade));
    
    CREATE TABLE Acessorio(
    cd_acessorio INTEGER AUTO_INCREMENT,
    ds_acessorio VARCHAR(50) NOT NULL UNIQUE,
    PRIMARY KEY (cd_acessorio));
    
    CREATE TABLE Cor(
    cd_cor INTEGER AUTO_INCREMENT,
    ds_cor VARCHAR(30) NOT NULL UNIQUE,
    PRIMARY KEY (cd_cor));
    
    CREATE TABLE Modelo(
    cd_modelo INTEGER AUTO_INCREMENT,
    cd_marca INTEGER,
    ds_modelo VARCHAR(50) NOT NULL UNIQUE,
    PRIMARY KEY (cd_modelo),
    FOREIGN KEY (cd_marca) REFERENCES Marca (cd_marca));
    
    CREATE TABLE Proprietario(
    cd_proprietario INTEGER AUTO_INCREMENT,
    cd_localidade INTEGER,
    nm_proprietario VARCHAR(50) NOT NULL,
    ds_logradouro VARCHAR(50) NOT NULL,
    ds_complemento VARCHAR(50) NOT NULL,
    ds_bairro VARCHAR(50) NOT NULL,
    nr_telefone VARCHAR(15) UNIQUE,
    ds_email VARCHAR(50) UNIQUE,
    sg_uf CHAR(2) NOT NULL,
    PRIMARY KEY (cd_proprietario),
    FOREIGN KEY(cd_localidade) REFERENCES Localidade (cd_localidade));
    
    CREATE TABLE Veiculo(
    nr_placa CHAR(7) NOT NULL,
    cd_cor INTEGER,
    cd_proprietario INTEGER,
    cd_modelo INTEGER,
    nr_ano_fab INTEGER NOT NULL,
    nr_ano_mod INTEGER NOT NULL,
    qt_km_rodado INTEGER NOT NULL,
    qt_portas INTEGER NOT NULL,
    ds_observacao VARCHAR(100),
    PRIMARY KEY(nr_placa),
    FOREIGN KEY(cd_cor) REFERENCES Cor (cd_cor),
    FOREIGN KEY(cd_proprietario) REFERENCES Proprietario (cd_proprietario),
    FOREIGN KEY(cd_modelo) REFERENCES Modelo (cd_modelo));
    
    CREATE TABLE Veiculo_Combustivel(
    cd_combustivel INTEGER AUTO_INCREMENT,
    nr_placa CHAR(7),
    FOREIGN KEY (cd_combustivel) REFERENCES Combustivel (cd_combustivel),
    FOREIGN KEY (nr_placa) REFERENCES Veiculo (nr_placa));
    
    CREATE TABLE Veiculo_Acessorio(
    nr_placa CHAR(7),
    cd_acessorio INTEGER,
    FOREIGN KEY (nr_placa) REFERENCES Veiculo (nr_placa),
    FOREIGN KEY (cd_acessorio) REFERENCES Acessorio (cd_acessorio));

-RESTRIÇÕES:

        #INSERINDO VALORES NAS TABELAS COM RESTRIÇÕES
        
        #NOT NULL
        INSERT INTO combustivel(ds_combustivel)
        VALUES (NULL); #TEM QUE DAR ERRO
        
        #UNIQUE
        INSERT INTO proprietario(nm_proprietario, ds_logradouro, ds_complemento, ds_bairro, nr_telefone, ds_email, sg_uf)
        VALUES ('João da Silva', 'Rua das Flores', 'Apto 101', 'Centro', '47999998888', 'joao.silva@email.com', 'SC'),
               ('Maria Oliveira', 'Av. Brasil', 'Casa 2', 'Jardim América', '47999998888', 'maria.oliveira@email.com', 'SP');
        		#Número de telefones iguais, tem que dar erro
        		
        INSERT INTO proprietario(nm_proprietario, ds_logradouro, ds_complemento, ds_bairro, nr_telefone, ds_email, sg_uf)
        VALUES ('João da Silva', 'Rua das Flores', 'Apto 101', 'Centro', '47999998888', 'joao.silva@email.com', 'SC'),
               ('Maria Oliveira', 'Av. Brasil', 'Casa 2', 'Jardim América', '47999997777', 'joao.silva@email.com', 'SP');
               #Email igual, tem que dar erro 
        
        #AUTO_INCREMENT
        INSERT INTO localidade(nm_localidade)
        VALUES
        ('São Paulo'),
        ('Rio de Janeiro'),
        ('Belo Horizonte'),
        ('Curitiba'),
        ('Porto Alegre'),
        ('Salvador'),
        ('Brasília'),
        ('Recife'),
        ('Fortaleza'),
        ('Manaus');

- DELETE
  
      #DELETANDO UMA LINHA DE UMA TABELA
      DELETE FROM acessorio
      WHERE cd_acessorio = 8;

      #DELETANDO DA TABELA VEICULO OS QUE TEM A QUANTIDADE DE KILOMETROS RODADOS MENOR OU IGUAL A 50000
      DELETE FROM veiculo 
      WHERE qt_km_rodado <= 50000;

- UPDATE

      #ATUALIZANDO A DESCRIÇÃO DO BAIRRO DO EMAIL ana.paula@email.com: De CENTRO para VILA NOVA
      UPDATE proprietario
      SET ds_bairro = 'Vila Nova'
      WHERE 
      ds_email = 'ana.paula@email.com'
      AND 
      ds_bairro = 'Centro';
