//Autor: Gabrielli Danker
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		/* Escreva um programa para determinar a quantidade de cavalos necessários para se levantar
		 *  uma massa de m quilogramas a uma altura de h metros em t segundos. 
		 *  Considere cavalos = (m * h / t) / 745,6999*/
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Digite o valor da massa em quilogramas: ");
		double massa = input.nextDouble();
		
		System.out.println("Digite o valor da altura em metros: ");
		double altura = input.nextDouble();
		
		System.out.println("Digite o valor do tempo em segundos: ");
		double tempo = input.nextDouble();
		
		double cavalos = ((massa * altura) / tempo)/745.6999;
		
		System.out.println("Quantidade de cavalos: " + df.format(cavalos));
	}

}
