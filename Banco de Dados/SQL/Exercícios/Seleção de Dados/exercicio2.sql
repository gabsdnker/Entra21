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

SELECT nr_placa
FROM veiculo
WHERE nr_ano_fab > 2015 
ORDER BY nr_ano_fab ASC;
