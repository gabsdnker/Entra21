<img src="https://github.com/gabsdnker/Entra21/blob/a23856cb928a371c20c41b971f2f54001b7b02dc/Banco%20de%20Dados/SQL/Exerc%C3%ADcios/Imagens/exercicio2.sql.png" alt="Exercicio 2" width="400" height="300">
    
    CREATE TABLE marca(
    cd_marca INTEGER,
    ds_marca VARCHAR(30));
    
    CREATE TABLE combustivel(
    cd_combustivel INTEGER,
    ds_combustivel VARCHAR(30));
    
    CREATE TABLE veiculo_combustivel(
    cd_combustivel INTEGER,
    nr_placa CHAR(7));
    
    CREATE TABLE veiculo(
    nr_placa CHAR(7),
    cd_propietario INTEGER,
    cd_modelo INTEGER,
    nr_ano_fab INTEGER,
    nr_ano_mod INTEGER,
    qt_km_rodado INTEGER,
    qt_portas INTEGER,
    ds_observacao VARCHAR(100));
    
    CREATE TABLE localidade(
    cd_localidade INTEGER,
    nm_localidade VARCHAR(50));
    
    CREATE TABLE modelo(
    cd_modelo INTEGER,
    cd_marca INTEGER,
    ds_modelo VARCHAR(50));
    
    CREATE TABLE proprietario(
    cd_proprietario INTEGER,
    cd_localidade INTEGER,
    nm_proprietario VARCHAR(50),
    ds_logradouro VARCHAR(50),
    ds_complemento VARCHAR(50),
    ds_bairro VARCHAR(50),
    nr_telefone VARCHAR(50),
    ds_email VARCHAR(50),
    sg_uf CHAR(2));
