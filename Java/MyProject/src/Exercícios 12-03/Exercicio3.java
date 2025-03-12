//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/**Leia quatro valores inteiros A, B, C e D
        A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D **/
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int a = input.nextInt();
		
		System.out.println("Digite o valor de B: ");
		int b = input.nextInt();
		
		System.out.println("Digite o valor de C: ");
		int c = input.nextInt();
		
		System.out.println("Digite o valor de D: ");
		int d = input.nextInt();
		
		int diferencaProduto = a * b;
		int diferencaProduto2 = c * d;
		
		System.out.println("O valor do produto de A e B é: " + diferencaProduto);
		System.out.println("O valor do produto de C e D é: " + diferencaProduto2);
		
		int diferenca = diferencaProduto - diferencaProduto2;

		System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + diferenca);
		

	}

}
