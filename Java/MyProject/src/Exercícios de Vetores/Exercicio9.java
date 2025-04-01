//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/*Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 
		elementos.
		Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições 
		respectivas dos vetores originais.
		Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9].
		Exiba, ao final, os três vetores na tela.*/
		
		Scanner input = new Scanner(System.in);
		
		int vetor1[]= new int[10];
		int vetor2[] = new int[10];
		int vetor3[] = new int[10];
		
		System.out.println("Digite os valores do primeiro vetor:");
		for (int i =0; i < vetor1.length; i++) {
			System.out.print("Posição " + i + ": ");
			vetor1[i] = input.nextInt();
		}
		
		System.out.println("Digite os valores do segundo vetor:");
		for (int i =0; i < vetor2.length; i++) {
			System.out.print("Posição " + i + ": ");
			vetor2[i] = input.nextInt();
		}
		
		for(int i = 0; i < vetor3.length; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
		}
		
		System.out.print("Vetor 1: ");
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print(vetor1[i] + " ");
		}
		System.out.println(" ");
		
		System.out.print("Vetor 2: ");
		for (int i = 0; i < vetor2.length; i++) {
			System.out.print(vetor2[i] + " ");
		}
		System.out.println(" ");
		
		System.out.print("Vetor 3: ");
		for (int i = 0; i < vetor3.length; i++) {
			System.out.print(vetor3[i] + " ");
		}
		
	}

}
