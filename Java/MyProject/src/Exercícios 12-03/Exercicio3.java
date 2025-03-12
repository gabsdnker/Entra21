//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/**Leia quatro valores inteiros A, B, C e D
        A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D **/
		
		System.out.println("Digite o valor de A: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		System.out.println("Digite o valor de B: ");
		Scanner input2 = new Scanner(System.in);
		int b = input2.nextInt();
		
		System.out.println("Digite o valor de C: ");
		Scanner input3 = new Scanner(System.in);
		int c = input3.nextInt();
		
		System.out.println("Digite o valor de D: ");
		Scanner input4 = new Scanner(System.in);
		int d = input4.nextInt();
		
		int diferencaProduto = a * b;
		int diferencaProduto2 = c * d;
		
		System.out.println("O valor do produto de A e B é: " + diferencaProduto);
		System.out.println("O valor do produto de C e D é: " + diferencaProduto2);
		
		int diferenca = diferencaProduto - diferencaProduto2;

		System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + diferenca);
		

	}

}
