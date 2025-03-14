//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*Dados dois valores inteiros, escreva um algoritmo que informe se o primeiro número é múltiplo do segundo*/

		Scanner input = new Scanner(System.in);
		
		//Pedindo os valores inteiros
		System.out.println("Digite o primeiro número: ");
		int primeiroNum = input.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int segundoNum = input.nextInt();
		
		//Verificar se o primeiro numero é multiplo do segundo numero
		if (primeiroNum % segundoNum == 0) {
			System.out.println("O" + " " + primeiroNum + " " + "é múltiplo do" + " " + segundoNum + "!");
		}
		else {
			System.out.println("O primero número não é múltiplo do segundo número!");
		}
		
	}

}
