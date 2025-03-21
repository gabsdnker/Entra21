//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre 
		homens e mulheres sempre serão diferentes).
		Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o 
		produto das idades do homem mais novo com a mulher mais velha.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a idade do Primeiro Homem: ");
		int homem1 = input.nextInt();
		
		System.out.println("Digite a idade do Segundo Homem: ");
		int homem2 = input.nextInt();
		
		System.out.println("Digite a idade da Primeira Mulher: ");
		int mulher1 = input.nextInt();
		
		System.out.println("Digite a idade da Segunda Mulher: ");
		int mulher2 = input.nextInt();
		
		if ( (homem1 > homem2 && mulher1 < mulher2)) { 
			int soma = homem1 + mulher1;
			int soma2 = homem2 + mulher2;
			
			System.out.println("Soma do homem mais velho: " + homem1 + " com a mulher mais nova: " + mulher1 +" é: " + soma);
			System.out.println("Soma do homem mais novo: " + homem2 + " com a mulher mais velha: " + mulher2 + " é: " + soma2);
		
		} else if((homem2 > homem1 && mulher2 < mulher1)) {
			int soma = homem1 + mulher1;
			int soma2 = homem2 + mulher2;
			
			System.out.println("Soma do homem mais velho: " + homem2 + " com a mulher mais nova: " + mulher2 + " é: " + soma2);
			System.out.println("Soma do homem mais novo: " + homem1 + " com a mulher mais velha: " + mulher1 +" é: " + soma);
			
		}
		else {
			int soma = homem2 + mulher1;
			int soma2 = homem1 + mulher2;
			
			System.out.println("Soma do homem mais velho: " + homem2 + " com a mulher mais nova: " + mulher1 +" é: " + soma); 
			System.out.println("Soma do homem mais novo: " + homem1 + " com a mulher mais velha: " + mulher2 + " é: " + soma2);
		}

	}

}
