//Autor: Gabrielli Danker
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/**
		 * Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula:
		 *  V = 3.14159 * R * R * A,
		 *   em que as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
		 *   Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as variáveis de altura e de raio. 
		 *   Agora vamos escrever a fórmula, conforme dita no enunciado e, em seguida, exibir na tela uma mensagem 
		 *   contendo o resultado do volume encontrado.
		 */

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Digite o raio: ");
		double R = input.nextDouble();
		
		System.out.println("Digite a altura: ");
		double A = input.nextDouble();
		
		double V = 3.14159 * R * R * A;
		
		System.out.println("O valor do volume de uma lata de óleo é: " + df.format(V));
	}

}
