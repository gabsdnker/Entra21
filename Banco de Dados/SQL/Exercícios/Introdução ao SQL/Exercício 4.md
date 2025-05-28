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
            
            #INSERINDO INFORMAÇÕES NAS TABELAS
            INSERT INTO cor(cd_cor, ds_cor)
            VALUES (1, 'Amarelo'), 
            (2, 'Verde'),
            (3, 'Azul'),
            (4, 'Vermelho');
            
            INSERT INTO combustivel(cd_combustivel, ds_combustivel)
            VALUES(1, 'Gasolina comum'),
            (2, 'Gasolina aditivada'),
            (3, 'Etanol'),
            (4, 'GNV'),
            (5, 'Diesel');
            
            INSERT INTO marca(cd_marca, ds_marca)
            VALUES(1, 'Toyota'),
            (2, 'Honda'),
            (3, 'Tesla'),
            (4, 'Audi'),
            (5, 'Ford'),
            (6, 'Hyundai'),
            (7, 'Volkswagen'),
            (8, 'Subaru'),
            (9, 'BMW'),
            (10, 'Mercedes-Benz');
            
            INSERT INTO modelo(cd_modelo, cd_marca, ds_modelo)
            VALUES
            (1, 1, 'Corolla'),
            (2, 1, 'Yaris'),
            (3, 2, 'Civic'),
            (4, 2, 'Fit'),
            (5, 3, 'Model S'),
            (6, 3, 'Model 3'),
            (7, 4, 'A3'),
            (8, 4, 'Q5'),
            (9, 5, 'Focus'),
            (10, 5, 'Fusion'),
            (11, 6, 'HB20'),
            (12, 6, 'Creta'),
            (13, 7, 'Gol'),
            (14, 7, 'Polo'),
            (15, 8, 'Impreza'),
            (16, 8, 'Forester'),
            (17, 9, '320i'),
            (18, 9, 'X1'),
            (19, 10, 'Classe C'),
            (20, 10, 'GLA');
            
            INSERT INTO acessorio(cd_acessorio, ds_acessorio)
            VALUES
            (1, 'Ar-condicionado'),
            (2, 'Direção hidráulica'),
            (3, 'Travas elétricas'),
            (4, 'Vidros elétricos'),
            (5, 'Sensor de estacionamento'),
            (6, 'Câmera de ré'),
            (7, 'Rádio com Bluetooth'),
            (8, 'GPS integrado'),
            (9, 'Airbag duplo'),
            (10, 'Freios ABS'),
            (11, 'Teto solar'),
            (12, 'Bancos de couro'),
            (13, 'Rodas de liga leve'),
            (14, 'Alarme'),
            (15, 'Faróis de neblina');
            
            INSERT INTO localidade(cd_localidade, nm_localidade)
            VALUES
            (1, 'São Paulo'),
            (2, 'Rio de Janeiro'),
            (3, 'Belo Horizonte'),
            (4, 'Curitiba'),
            (5, 'Porto Alegre'),
            (6, 'Salvador'),
            (7, 'Brasília'),
            (8, 'Recife'),
            (9, 'Fortaleza'),
            (10, 'Manaus');
            
            INSERT INTO proprietario(cd_proprietario,cd_localidade, nm_proprietario, ds_logradouro, ds_complemento, ds_bairro, nr_telefone, ds_email, sg_uf)
            VALUES (1, 1, 'João da Silva', 'Rua das Flores', 'Apto 101', 'Centro', '47999998888', 'joao.silva@email.com', 'SC'),
            (2, 2, 'Maria Oliveira', 'Av. Brasil', 'Casa 2', 'Jardim América', '47988887777', 'maria.oliveira@email.com', 'SP'),
            (3, 3, 'Carlos Souza', 'Rua das Palmeiras', 'Bloco B', 'Vila Nova', '47977776666', 'carlos.souza@email.com', 'RJ'),
            (4, 4, 'Ana Paula Lima', 'Rua do Comércio', 'Sala 5', 'Centro', '47966665555', 'ana.paula@email.com', 'MG'),
            (5, 5, 'Fernanda Costa', 'Av. Atlântica', 'Cobertura', 'Beira Mar', '47955554444', 'fernanda.costa@email.com', 'RS');
            
            INSERT INTO veiculo (nr_placa, cd_cor, cd_proprietario, cd_modelo, nr_ano_fab, nr_ano_mod, qt_km_rodado, qt_portas, ds_observacao) 
            VALUES ('ABC1234', 1, 1, 1, 2019, 2020, 55000, 4, 'Revisado recentemente.'),
            ('XYZ2E45', 2, 2, 2, 2021, 2021, 23000, 2, 'Único dono, sem multas.'),
            ('JKL3F67', 3, 3, 3, 2018, 2019, 78000, 4, 'Pneus novos, IPVA pago.'),
            ('MNO4G89', 4, 4, 4, 2020, 2021, 41000, 4, 'Veículo de garagem.'),
            ('PQR5H01', 2, 5, 5, 2022, 2022, 12000, 2, 'Sem detalhes, pintura original.'),
            ('STU6I23', 1, 1, 6, 2017, 2018, 89000, 4, 'Troca de óleo em dia.'),
            ('VWX7J45', 4, 1, 7, 2016, 2017, 102000, 4, 'Manual e chave reserva.'),
            ('YZA8K67', 2, 2, 8, 2023, 2023, 5000, 4, 'Novo, ainda na garantia.'),
            ('BCD9L89', 3, 3, 9, 2015, 2016, 115000, 2, 'Bom estado geral.'),
            ('EFG0M01', 1, 5, 20, 2021, 2022, 36000, 4, 'Sem sinistros, revisões feitas.');
            
            #ATUALIZANDO A COR DO VEÍCULO COM PLACA 'ABC1234' PARA 'AZUL'
            UPDATE Veiculo
            SET cd_cor = 3
            WHERE nr_placa = 'ABC1234';
            
            #ATUALIZANDO O NÚMERO DE TELEFONE DO PROPRIETÁRIO COM CÓDIGO 10 PARA 47123456789
            UPDATE Proprietario
            SET nr_telefone = '47123456789'
            WHERE cd_proprietario = 1;

            #SELECT
            SELECT *
            FROM localidade;
            
            SELECT ds_cor
            FROM cor;

Após inserir nas tabelas:

a) Atualize a cor veículo com placa 'ABC1234' para 'Azul'

            UPDATE Veiculo
            SET cd_cor = 3
            WHERE nr_placa = 'ABC1234';
            
b) Atualize o número de telefone do proprietário com código 10 para 47123456789

            UPDATE Proprietario
            SET nr_telefone = '47123456789'
            WHERE cd_proprietario = 1;

