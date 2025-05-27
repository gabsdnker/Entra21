Reconstrua o modelo abaixo colocando as Primary Keys e Foreign Keys nas tabelas, após isso, faça comandos de inserção para as tabelas, aproximadamente 10 registros por tabela:

<img src="https://github.com/gabsdnker/Entra21/blob/74cf9d6ff6fe9af5e1488ce22ffdf80000f424ff/Banco%20de%20Dados/SQL/Exerc%C3%ADcios/Imagens/exercicio4sql.png" alt="Exercicio 4" width="600" height="400">

            #CRIANDO TABELAS
            CREATE TABLE Combustivel(
            cd_combustivel INTEGER,
            ds_combustivel VARCHAR(30),
            PRIMARY KEY (cd_combustivel));
            
            CREATE TABLE Marca(
            cd_marca INTEGER,
            ds_marca VARCHAR(30),
            PRIMARY KEY (cd_marca));
            
            CREATE TABLE Localidade(
            cd_localidade INTEGER,
            nm_localidade VARCHAR(50),
            PRIMARY KEY (cd_localidade));
            
            CREATE TABLE Acessorio(
            cd_acessorio INTEGER,
            ds_acessorio VARCHAR(50),
            PRIMARY KEY (cd_acessorio));
            
            CREATE TABLE Cor(
            cd_cor INTEGER,
            ds_cor VARCHAR(30),
            PRIMARY KEY (cd_cor));
            
            CREATE TABLE Modelo(
            cd_modelo INTEGER,
            cd_marca INTEGER,
            ds_modelo VARCHAR(50),
            PRIMARY KEY (cd_modelo),
            FOREIGN KEY (cd_marca) REFERENCES Marca (cd_marca));
            
            CREATE TABLE Proprietario(
            cd_proprietario INTEGER,
            cd_localidade INTEGER,
            nm_proprietario VARCHAR(50),
            ds_logradouro VARCHAR(50),
            ds_complemento VARCHAR(50),
            ds_bairro VARCHAR(50),
            nr_telefone VARCHAR(15),
            ds_email VARCHAR(50),
            sg_uf CHAR(2),
            PRIMARY KEY (cd_proprietario),
            FOREIGN KEY(cd_localidade) REFERENCES Localidade (cd_localidade));
            
            CREATE TABLE Veiculo(
            nr_placa CHAR(7),
            cd_cor INTEGER,
            cd_proprietario INTEGER,
            cd_modelo INTEGER,
            nr_ano_fab INTEGER,
            nr_ano_mod INTEGER,
            qt_km_rodado INTEGER,
            qt_portas INTEGER,
            ds_observacao VARCHAR(100),
            PRIMARY KEY(nr_placa),
            FOREIGN KEY(cd_cor) REFERENCES Cor (cd_cor),
            FOREIGN KEY(cd_proprietario) REFERENCES Proprietario (cd_proprietario),
            FOREIGN KEY(cd_modelo) REFERENCES Modelo (cd_modelo));
            
            CREATE TABLE Veiculo_Combustivel(
            cd_combustivel INTEGER,
            nr_placa CHAR(7),
            FOREIGN KEY (cd_combustivel) REFERENCES Combustivel (cd_combustivel),
            FOREIGN KEY (nr_placa) REFERENCES Veiculo (nr_placa));
            
            CREATE TABLE Veiculo_Acessorio(
            nr_placa CHAR(7),
            cd_acessorio INTEGER,
            FOREIGN KEY (nr_placa) REFERENCES Veiculo (nr_placa),
            FOREIGN KEY (cd_acessorio) REFERENCES Acessorio (cd_acessorio));
     
            INSERT INTO cor(cd_cor, ds_cor)
            VALUES (2, 'Verde');
            INSERT INTO combustivel(cd_combustivel, ds_combustivel)
            VALUES(2, 'Diesel');
            INSERT INTO marca(cd_marca, ds_marca)
            VALUES(2, 'Honda');
            INSERT INTO localidade(cd_localidade, nm_localidade)
            VALUES (2, 'Casa');
            INSERT INTO acessorio(cd_acessorio, ds_acessorio)
            VALUES (2, 'Cinto Rosa');
            
            INSERT INTO modelo(cd_modelo, ds_modelo)
            VALUES (50,'Automático');
            INSERT INTO proprietario(cd_proprietario, nm_proprietario, ds_logradouro, ds_complemento, ds_bairro, nr_telefone, ds_email, sg_uf)
            VALUES (51, 'Gabriel', 'Avenida', 'Apartamento', 'São João', '4798756789', 'alguemaleatorio@gmail.com', 'SP');
            
            INSERT INTO veiculo(nr_placa, nr_ano_fab, nr_ano_mod, qt_km_rodado, qt_portas, ds_observacao)
            VALUES ('ABC1234', 1998, 2000, 10, 4, 'Arranhado no parachoque');

            #ATUALIZANDO A COR DO VEÍCULO COM PLACA 'ABC1234' PARA 'AZUL'
            INSERT INTO Cor (cd_cor, ds_cor)
            VALUES (3, 'Azul');
            
            UPDATE Veiculo
            SET cd_cor = 3
            WHERE nr_placa = 'ABC1234';

            #ATUALIZANDO O NÚMERO DE TELEFONE DO PROPRIETÁRIO COM CÓDIGO 10 PARA 47123456789
            UPDATE Proprietario
            SET nr_telefone = '47123456789'
            WHERE cd_proprietario = 51;

Após inserir nas tabelas:

a) Atualize a cor veículo com placa 'ABC1234' para 'Azul'

            INSERT INTO Cor (cd_cor, ds_cor)
            VALUES (3, 'Azul');
            
            UPDATE Veiculo
            SET cd_cor = 3
            WHERE nr_placa = 'ABC1234';

b) Atualize o número de telefone do proprietário com código 10 para 47123456789

            UPDATE Proprietario
            SET nr_telefone = '47123456789'
            WHERE cd_proprietario = 1;

