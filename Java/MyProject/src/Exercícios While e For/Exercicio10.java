//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*Uma turma tem n alunos.
		Dado n, o nome (somente o primeiro nome) e idade de cada aluno descreva:
		a) os nomes dos alunos que tem 18 anos
		b) a quantidade de alunos que tem idade acima de 20 anos.*/
		
		Scanner input = new Scanner(System.in);
		
		int contador = 0;
		
		System.out.println("Digite a quantidade de alunos:");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o nome do aluno:");
			String nome = input.next();
			
			System.out.println("Digite a idade do aluno:");
			int idade = input.nextInt();
			
			if(idade > 20) {
				contador += 1;
			} 
			if (idade == 18) {
				System.out.println(nome);
			} 
				
		}	

		System.out.println("Quantidade de alunos maiores de 20 anos: " + contador);
	}

}

