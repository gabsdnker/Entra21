#Utilizando o diagrama dos alunos, professores e áreas:

# a) Listar o nome dos alunos, junto com o nome dos seus professores

SELECT aluno.nm_aluno, professor.nm_professor
FROM aluno
JOIN professor
ON aluno.cd_professor = professor.cd_professor;

# b) Continuando a última questão, adicione também a área do professor

SELECT aluno.nm_aluno, professor.nm_professor, areaprofessor.nm_area
FROM aluno
JOIN professor
ON aluno.cd_professor = professor.cd_professor
JOIN areaprofessor
ON professor.cd_area = areaprofessor.cd_area;


# c) Listar os professores que são da área de “Engenharia”

SELECT professor.nm_professor
FROM professor
JOIN areaprofessor
ON professor.cd_area = areaprofessor.cd_area
WHERE areaprofessor.nm_area = 'Matemática';

# d) Listar o nome dos alunos que têm média acima de 8 e estão com professores da área de “Desenvolvimento de Software” (ou outra área que você preferir)

SELECT aluno.nm_aluno
FROM aluno
JOIN professor
ON aluno.cd_professor = professor.cd_professor
JOIN areaprofessor
ON professor.cd_area = areaprofessor.cd_area
WHERE aluno.media_aluno > 8
AND areaprofessor.nm_area = 'Geografia';
