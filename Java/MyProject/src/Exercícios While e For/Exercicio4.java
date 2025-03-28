//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Escreva um algoritmo em que o usuário entre 5 valores de 0 a 1000
		Começando com o laço (while ou for) em 0
		Escreva os números que o usuário entrou*/
		
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			int numero = input.nextInt();
			
			if(numero >= 0 && numero <= 1000) {
				System.out.println("Número digitado: " + numero +"\n");
			} else {
				System.out.println("Número inválido\n");
			}
		}
	}

}
