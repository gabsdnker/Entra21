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

INSERT INTO Proprietario (cd_localidade, nm_proprietario, ds_logradouro, ds_complemento, 
ds_bairro, nr_telefone, ds_email, sg_uf) 
VALUES
(1, 'Carlos Silva', 'Rua das Flores', 'Apto 101', 'Centro', '479998988888', 'carlos@email.com', 'SC'),
(2, 'Ana Souza', 'Av. Brasil', 'Casa', 'Jardim América', '479856987777', 'ana@email.com', 'SC'),
(3, 'João Pereira', 'Rua das Palmeiras', 'Bloco A', 'Velha', '4797765596666', NULL, 'SC'),
(4, 'Mariana Lima', 'Rua XV de Novembro', 'Bloco B', 'Itoupava Norte', '479632114555', 'mariana@email.com', 'SC'),
(5, 'Lucas Oliveira', 'Rua Bahia', 'Casa 2', 'Garcia', '47955465444', NULL, 'SC');

INSERT INTO acessorio (cd_acessorio, ds_acessorio)
VALUES
(16, 'Som automotivo');

INSERT INTO proprietario(cd_localidade, nm_proprietario, ds_logradouro, ds_complemento, 
ds_bairro, nr_telefone, ds_email, sg_uf) 
VALUES
(6, 'Fernanda Ribeiro', 'Rua das Acácias', 'Casa 3', 'Itoupava Central', '11991234567', 'fernanda.ribeiro@email.com', 'SP'),
(7, 'Eduardo Martins', 'Av. Beira Rio', 'Apto 202', 'Ponta Aguda', '21993456789', 'eduardo.martins@email.com', 'RJ'),
(8, 'Patrícia Gomes', 'Rua São Paulo', 'Bloco C', 'Victor Konder', '31994561234', NULL, 'MG');

# a) Listar todos os dados do modelos disponíveis

SELECT *
FROM modelo;

# b) Listar a descrição de todas as marcas disponiveis

SELECT ds_marca
FROM marca;

# c) Listar qual(is) proprietário(s) não possuem e-mail, mas que possuem número de telefone cadastrado

SELECT nm_proprietario
FROM proprietario
WHERE ds_email IS NULL 
	AND nr_telefone IS NOT NULL;
	
# d) Mostre os veículos fabricados após o ano de 2015, ordenados pelo ano de fabricação de forma decrescente 

SELECT nr_placa, nr_ano_fab
FROM veiculo
WHERE nr_ano_fab > 2015 
ORDER BY nr_ano_fab ASC;

# e) Liste os nomes dos modelos cujo nome começa com a letra "F", ordenandos em ordem alfabética

SELECT ds_modelo
FROM modelo
WHERE ds_modelo LIKE 'F%'
ORDER BY ds_modelo ASC;

# f) Mostre os acessorios cujo nome contém a palavra 'som'

SELECT ds_acessorio
FROM acessorio
WHERE ds_acessorio LIKE '%Som%';

# g) Selecione os proprietarios cujo telefone começa com o DDD '47'

SELECT nm_proprietario, nr_telefone
FROM proprietario
WHERE nr_telefone LIKE '47%';

# h) Selecione todos os veiculos com 2 portas

SELECT modelo.ds_modelo,  veiculo.qt_portas
FROM veiculo
JOIN modelo
ON veiculo.cd_modelo = modelo.cd_modelo
WHERE qt_portas = 2;

# i) Mostre os veículos com mais de 100.000km rodados, ordenados dos mais rodados para o menos

SELECT modelo.ds_modelo, veiculo.qt_km_rodado
FROM veiculo
JOIN modelo
ON veiculo.cd_modelo = modelo.cd_modelo
WHERE qt_km_rodado > 100000
ORDER BY qt_km_rodado DESC;
