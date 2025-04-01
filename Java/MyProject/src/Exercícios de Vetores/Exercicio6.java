//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*Faça um algoritmo que inverta a ordem de uma array
		(o primeiro elemento vai se tornar o último elemento*/
		
		Scanner input= new Scanner(System.in);
		
		int array[] = new int[5];
		int numero = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite o número:");
			numero = input.nextInt();
			
			array[i] = numero;
		} 
		for (int i = array.length -1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

	}

}
