//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		//Leia 2 valores inteiros e imprima sua soma e produto
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Digite um número: ");
		int numeroUm = input.nextInt();
		
		System.out.println("Digite outro número: ");
		int numeroDois = input.nextInt();
		
		int soma = numeroUm + numeroDois;
		int produto = numeroUm * numeroDois;
		
		System.out.println("A soma desses números é " + soma + " " + "e o produto é " + produto);
	}

}
