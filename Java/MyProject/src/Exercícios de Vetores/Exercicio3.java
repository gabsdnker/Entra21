//Autor: Gabrielli Danker
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		/*Faça um algoritmo que descubra se uma array de 5 elementos possui o número que o usuário 
entrou. Imprima também o seu índice*/
		
		Scanner input = new Scanner(System.in);
		int array[]= {1, 36, 24, 27, 2};
		int numero = 0;
		boolean numArray = false;


		System.out.println("Digite um número inteiro:");
		 numero = input.nextInt();				
	
		for (int i = 0; i < array.length; i++) {
			if (numero == array[i]) {
				System.out.println("Número " + numero + " está no array no indice: " + i );
				numArray = true;
				break;
			} 
		} if (!numArray) {
			System.out.println("Número " + numero + " não está no array!");
		}
	}

}
