A partir do exercício 2:

a) Adicione uma coluna ds_cor(VARCHAR(25)) na tabela Veiculo para armazenar a cor do veículo

    ALTER TABLE veiculo
    ADD ds_cor VARCHAR(25);

b) Modifique a coluna nr_telefone da tabela Proprietario para CHAR(11)

    ALTER TABLE proprietario
    MODIFY nr_telefone CHAR(11);

c) Renomeie a coluna ds_email da tabela Proprietario para email_proprietario

    ALTER TABLE proprietario
    CHANGE ds_email email_proprietario VARCHAR(50);

d) Renomeie a tabela Localidade para Cidade

    RENAME TABLE localidade TO cidade;

e) Remova a coluna ds_complemeto da tabela Proprietario

    ALTER TABLE proprietario
    DROP COLUMN ds_complemento;
