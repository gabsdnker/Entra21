//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*Escreva um programa para calcular o fatorial de um número*/
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite o numero para calcular o fatorial:");
		int numero = input.nextInt();
		
		long fatorial = 1;
		
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}
		System.out.println("Fatorial do numero: " + numero + " é " + fatorial);

	}

}
