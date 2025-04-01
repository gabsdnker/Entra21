//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*Faça um algoritmo em que o usuário insere um número em um índice específico que ele 
mesmo informou*/
		
		Scanner input = new Scanner(System.in);
			
		int lista[] = new int[5];
		int numero = 0;
		int indice = 0;

			for(int i = 0; i < lista.length; i++) {
				System.out.println("Digite o índice (0 a 4):");
				indice = input.nextInt();
				
				System.out.println("Digite o número:");
				numero = input.nextInt();
				
				lista[indice] = numero;
			} 
			System.out.print("Lista: ");
			
			for (int i = 0; i < lista.length; i ++) {
				System.out.print( lista[i] + " ");
			}
	}

}
