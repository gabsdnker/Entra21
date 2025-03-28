//Autor: Gabrielli Danker
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		/*Dada uma turma de alunos, contendo seu nome e nota de duas provas.
		Descreva um algoritmo para informar a média de cada aluno.
		Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”*/
		
		Scanner input = new Scanner(System.in);
		DecimalFormat def = new DecimalFormat("0.00");
		
		int i = 0;
		
		while (i != 0) {
			System.out.println("Digite o nome do aluno (ou 'fim' para sair): ");
			String nomeAluno = input.next();
			
			if (nomeAluno.equalsIgnoreCase("Fim")) {
				break;
			} else {
				System.out.println("Digite a primeira nota: ");
				double nota1 = input.nextDouble();
				
				System.out.println("Digite a segunda nota: ");
				double nota2 = input.nextDouble();
				
				double media = (nota1 + nota2)/2;
				
				System.out.println("Média do aluno " +  nomeAluno + " é: " + media);
			}
			
		}		
	}

}
