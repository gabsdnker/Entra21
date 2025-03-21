//Autor: Gabrielli Danker
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		/*
		 * Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, descreva 
		um algoritmo que calcule a média de aproveitamento e o conceito do aluno.
		Usando a fórmula: média de aproveitamento = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + 
		notaExercicios) / 7
		A atribuição dos conceitos obedece à tabela abaixo:
		média de aproveitamento conceito
		>= 9.0 A
		>= 7.5 e < 9.0 B
		>= 6.0 e < 7.5 C
		>= 4.0 e < 6.0 D
		< 4.0 E
		O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e 
		a mensagem ‘aprovado’ caso o conceito seja A, B ou C, e ‘reprovado’ caso o conceito 
		seja D ou E
		 */
		
		Scanner input = new  Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Digite a nota da primeira prova: ");
		double nota1 = input.nextDouble();
		
		System.out.println("Digite a nota da segunda prova: ");
		double nota2 = input.nextDouble();
		
		System.out.println("Digite a nota da terceira prova: ");
		double nota3 = input.nextDouble();
		
		System.out.println("Digite a média dos exercícios: ");
		double notaExercicio = input.nextDouble();
		
		double mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + notaExercicio)/7;
		
		if (mediaAproveitamento >= 9) {
			System.out.println(df.format(mediaAproveitamento) +" A- Aprovado");
			
		} else if (mediaAproveitamento >= 7.5 && mediaAproveitamento <= 9.0) {
			System.out.println(df.format(mediaAproveitamento) + " B- Aprovado");
			
		} else if (mediaAproveitamento >= 6.0 && mediaAproveitamento <= 7.5) {
			System.out.println(df.format(mediaAproveitamento) +" C- Aprovado");
			
		} else if (mediaAproveitamento >= 4.0 && mediaAproveitamento <= 6.0) {
			System.out.println(df.format(mediaAproveitamento) + " D- Reprovado");
			
		} else {
			System.out.println(df.format(mediaAproveitamento) +" E- Reprovado");
			
		}

	}

}
