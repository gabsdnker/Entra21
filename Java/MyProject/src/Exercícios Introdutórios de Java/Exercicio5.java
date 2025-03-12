//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/**
		 * Leia dois valores decimais (double) e calcule a média ponderada sabendo que a nota A tem 
			peso 3.5 e nota B 6.5.
		 */
		Scanner input = new Scanner(System.in);		
		System.out.println("Digite o primero valor: ");
		double valor1 = input.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double valor2 = input.nextDouble();
		
		double a = 3.5;
		double b = 6.5;
		
		double mediaPonderada = ((valor1 * a) + (valor2 * b))/(a + b);
		
		System.out.println("A média ponderada é: " + mediaPonderada);
	}

}
