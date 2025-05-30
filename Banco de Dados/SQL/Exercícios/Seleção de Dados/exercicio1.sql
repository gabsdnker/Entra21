#CRIANDO TABELA
CREATE TABLE areaProfessor(
cd_area INTEGER AUTO_INCREMENT,
nm_area VARCHAR(50) NOT NULL UNIQUE,
PRIMARY KEY (cd_area));

CREATE TABLE professor(
cd_professor INTEGER AUTO_INCREMENT,
nm_professor VARCHAR(50) NOT NULL,
cd_area INTEGER,
PRIMARY KEY (cd_professor),
FOREIGN KEY (cd_area) REFERENCES areaProfessor(cd_area));

CREATE TABLE aluno(
cd_aluno INTEGER AUTO_INCREMENT,
nm_aluno VARCHAR(50) NOT NULL,
dt_nascimento DATE,
media_aluno DECIMAL (10,2),
cd_professor INTEGER,
PRIMARY KEY (cd_aluno),
FOREIGN KEY (cd_professor) REFERENCES professor(cd_professor));

#INSERINDO VALORES
INSERT INTO areaprofessor(nm_area)
VALUES 
('Matemática'), 
('Ciência'), 
('Geografia'), 
('Português'), 
('Educação Física'), 
('Inglês'), 
('Hitória'),
('Física'), 
('Artes');

INSERT INTO professor(nm_professor, cd_area)
VALUES
('Bianca Rocha',  2),
('Bruno Tavares', 4),
('Caio Ventura', 1),
('Enzo Duarte', 9),
('Ícaro Silveira', 3),
('Isadora Freitas', 7),
('Júlia Cardoso', 5),
('Lara Menezes', 8),
('Rafael Monteiro', 6),
('Tainá Ribeiro', 1);

INSERT INTO aluno(nm_aluno, dt_nascimento, media_aluno, cd_professor)
VALUES
('Davi Lins', '2002-05-23', 8.4, 1),
('Elisa Moura', '2001-08-03', 7.0, 2),
('Miguel Farias', '2003-12-27', 6.5, 3),
('Theo Andrade', '2001-06-01', 8.0, 4),
('Rafaela Luz', '2004-02-24', 10.0, 5),
('Yara Martins', '2002-09-26', 9.2, 6);

# a) Listar todos os alunos
SELECT * 
FROM aluno;

# b) Liste o nome dos alunos que possuem média maior que 7. Ordene do maior para o menor

SELECT nm_aluno, media_aluno
FROM aluno
WHERE media_aluno > 7.0
ORDER BY media_aluno DESC;

# c) Exiba os nomes dos professores que pertencem à área com código 2.

SELECT nm_professor, cd_area
FROM professor
WHERE cd_area = 2;

# d) Mostre o nome dos alunos e suas datas de nascimento, apenas daqueles que nasceram depois de 1º de janeiro de 2002

SELECT nm_aluno, dt_nascimento
FROM aluno 
WHERE dt_nascimento > '2002-01-01';

# e) Mostre os alunos cujo professor tem códido 1

SELECT nm_aluno, cd_professor
FROM aluno
WHERE cd_professor = 1;
