//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		/*
		 * Faça um algoritmo que leia um caractere.
			Caso seja digitada a letra 'M' escreva “Masculino”.
			Se for digitada a letra 'F' escreva “Feminino”.
			Se for informado 'I' escreva “Não Informado”.
			Qualquer outra letra digitada escreva “Entrada Incorreta
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite 'M' para Masculino ou 'F' para Feminino: ");
		char sexo = input.next().charAt(0);
		
		if (sexo == 'M') {
			System.out.println("Masculino!");
		} else if (sexo == 'F') {
			System.out.println("Feminino!");
		} else if (sexo == 'I') {
			System.out.println("Não Informado!");
		} else {
			System.out.println("Entrada Incorreta!");
		}
	}

}
