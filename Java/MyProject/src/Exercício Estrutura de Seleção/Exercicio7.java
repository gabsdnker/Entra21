//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		/*
		 * Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está localizado no plano cartesiano
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite as coordenadas (X e Y) de um Ponto do plano cartesiano!");
		
		System.out.println("Valor de X no plano cartesiano: ");
		double x = input.nextDouble();
		
		System.out.println("Valor de Y no plano cartersiano: ");
		double y = input.nextDouble();
		
		if (x ==0) {
			if (y == 0) {
				System.out.println("Origem");
			}else {
				System.out.println("Eixo Y");
			}	
		}else if(y == 0) {
			if (x != 0) {
				System.out.println("Eixo X");
			}
		}else if (x > 0) {
			if (y > 0) {
				System.out.println("Quadrante 1 (+, +)");
			} else {
				System.out.println("Quadrante 4 (+, –)");
			}
		}else {
			if ( y > 0) {
				System.out.println("Quadrante 2 (–, +)");
			}else {
				System.out.println("Quadrante 3  (– , –)");
			}
		}
		
	}

}
