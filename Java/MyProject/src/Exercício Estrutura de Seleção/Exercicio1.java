//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*Dados dois números inteiros distintos descreva um algoritmo para informar qual deles tem o maior valor*/

		Scanner input = new Scanner(System.in);
		
		System.out.println("Números inteiros distintos qual deles é o maior valor?");
		
		//Pedir números interiros para o usuário 
		System.out.println("Digite um número inteiro: ");
		int num1 = input.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		int num2 = input.nextInt();
		
		//Comparação dos números dados pelo usuário
		if (num1 > num2) {
			System.out.println("O número maior é: " + num1 );
		}
		else if(num2 > num1){
			System.out.println("O número maior é: " + num2);
		}
		else {
			System.out.println("Os números não podem ser iguais!");
		}
	}

}
