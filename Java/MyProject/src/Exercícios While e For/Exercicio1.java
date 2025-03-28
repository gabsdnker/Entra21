//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*Descreva um algoritmo que leia 5 números inteiros e escreva, para cada número lido, se ele é 
		par ou ímpar.*/
		
		Scanner input = new Scanner(System.in);

		for (int i = 1; i <=5; i ++ ) {
			System.out.println("Digite um número:");
			int numero = input.nextInt();
			
			if (numero % 2== 0) {
				System.out.println("É par\n");
			} else {
				System.out.println("É ímpar\n");
			}
		}

	}

}
