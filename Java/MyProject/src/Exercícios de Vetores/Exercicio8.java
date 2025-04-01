//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		/*Descreva um algoritmo que leia 5 valores e os coloque em um vetor de 5 posições
		Imprima quais valores desses informados são maiores que a média dos valores.*/
		
		Scanner input = new Scanner(System.in);
		
		int vetor[] = new int[5];		
		int soma = 0;
		
		for(int i= 0; i < vetor.length; i++) {
			System.out.println("Digite o valor:");
			vetor[i] = input.nextInt();
			soma += vetor[i];
		}	
		int media = soma/vetor.length;
		
		for(int i= 0; i < vetor.length; i++) {
			
			if (vetor[i] > media) {
				System.out.println("Valores maiores que a média " + media + ": " + vetor[i]);
			} 
			
		}
	}

}
