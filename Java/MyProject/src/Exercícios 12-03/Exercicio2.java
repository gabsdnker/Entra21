//Autor: Gabrielli Danker
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		
		/**Calcule a área de um círculo a partir do valor do raio
		Fórmula: A = pi * r^2**/
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		double raio = input.nextDouble();

		double areaCirculo = 3.14 * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: " + areaCirculo + " cm²");
	}

}
