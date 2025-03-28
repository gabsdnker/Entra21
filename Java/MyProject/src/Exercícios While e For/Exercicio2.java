//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos 
		números ímpares entre 1 e 100. */
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor inicial: ");
		int valorInicial = input.nextInt();
		
		System.out.println("Digite o valor final: ");
		int valorFinal = input.nextInt();
		
		int somaPares = 0;
		int somaImpares = 0;
		
		for (int i= valorInicial; i <= valorFinal; i++) {
			if (i % 2 ==0) {
				somaPares += i;
			}else {
				somaImpares += i;
			}
		}
		System.out.println("Soma dos pares: " + somaPares);
		System.out.println("Soma dos ímpares: " + somaImpares);
		
	}

}
