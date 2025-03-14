//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/** Escreva um programa que, com base em uma temperatura em graus celsius, 
		*a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
		seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a temperatura em graus Celsius: ");
		double temperatura = input.nextDouble();
		
		double K = temperatura + 273.15;
		double Re = temperatura * 0.8;
		double Ra = temperatura * 1.8 + 32 +459.67;
		double F = temperatura * 1.8 + 32;
		
		
		System.out.println("Kelvin (K): " + K + " K");
		System.out.println("Réaumur (Re): " + Re + " Re");
		System.out.println("Rankine (Ra): " + Ra + " Ra");
		System.out.println("Fahrenheit (F): " + F + " F");

	}

}
