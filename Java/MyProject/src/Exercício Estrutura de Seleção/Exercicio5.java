//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		/*
		 * Faça um algoritmo que o usuário entre com um char.
			Determine se esse char é uma consoante ou vogal.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma vogal ou consoante: ");
		char letra = input.next().charAt(0);
		letra = Character.toLowerCase(letra);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		}

	}
}