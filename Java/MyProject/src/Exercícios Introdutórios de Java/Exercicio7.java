//Autor: Gabrielli Danker

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		/**
		 * Uma pessoa foi até uma casa de câmbio trocar dólares por reais.
		Para isto ela entregou um valor em dólares para o atendente.
		Calcule quantos reais o atendente deve devolver para a pessoa.
		 */
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Valor em dólares: ");
		double dolares = input.nextDouble();
		
		double reais = dolares * 5.16;
		
		System.out.println("Valor em reais: " + df.format(reais));
	}

}
