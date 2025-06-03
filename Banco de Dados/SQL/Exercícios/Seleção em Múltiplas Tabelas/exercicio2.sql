#Utilizando o diagrama dos veículos:

# a) Listar a marca e o modelo de todos os carros

SELECT marca.ds_marca, modelo.ds_modelo
FROM marca
JOIN modelo
ON marca.cd_marca = modelo.cd_marca;

# b) Listar qual(is) proprietário(s) residem nos estados de "SC" ou "PR"

SELECT proprietario.nm_proprietario, proprietario.sg_uf
FROM proprietario
WHERE proprietario.sg_uf IN ('SC', 'PR');

# c) Listar as informações do(s) veículo(s) que apresenta(m) ano de fabricação diferente do ano modelo

SELECT veiculo.nr_ano_fab, veiculo.nr_ano_mod
FROM veiculo
WHERE veiculo.nr_ano_fab <> veiculo.nr_ano_mod;

# d) Listar o nome do(s) proprietário(s) que residem em um bairro em que o nome tenha a palavra "Novo" ou "Nova" e que a UF seja de "SC"

SELECT proprietario.nm_proprietario, proprietario.ds_bairro, proprietario.sg_uf
FROM proprietario
WHERE proprietario.ds_bairroIN ('Nova%', 'Novo%')
AND proprietario.sg_uf = 'SC';

# e) Listar todas as marcas (descrição) disponíveis com o respetivo modelo (descrição), ordenando em ordem crescente de marca, seguida de modelo


SELECT marca.ds_marca, modelo.ds_modelo
FROM modelo
JOIN marca ON modelo.cd_marca = marca.cd_marca
ORDER BY marca.ds_marca ASC, modelo.ds_modelo ASC;

# f) Listar os veículos (com placa, descrição da marca, descrição do modelo) que possuem como acessório "Direção hidráulica"

SELECT veiculo.nr_placa, marca.ds_marca, modelo.ds_modelo
FROM veiculo
JOIN modelo ON veiculo.cd_modelo = modelo.cd_modelo
JOIN marca ON modelo.cd_marca = marca.cd_marca
JOIN veiculo_acessorio ON veiculo.nr_placa = veiculo_acessorio.nr_placa
JOIN acessorio ON veiculo_acessorio.cd_acessorio = acessorio.cd_acessorio
WHERE acessorio.ds_acessorio = 'Direção hidráulica';

# g) Listar o número da placa do veículo, ano de fabricação e modelo do(s) veículos fabricados a partir de 2015, com menos de 50 mil quilômetros rodados, com 4 portas ou mais e que não possui(am) observações


SELECT veiculo.nr_placa, veiculo.nr_ano_fab, modelo.ds_modelo
FROM veiculo
JOIN modelo ON veiculo.cd_modelo = modelo.cd_modelo
WHERE veiculo.nr_ano_fab >= 2015
  AND veiculo.qt_km_rodado < 50000
  AND veiculo.qt_portas >= 4
  AND (veiculo.ds_observacao IS NULL OR veiculo.ds_observacao = '');
