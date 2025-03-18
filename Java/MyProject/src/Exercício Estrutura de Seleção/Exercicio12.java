import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que funciona como um conversor universal.
		Primeiro o usuário escolhe se ele quer converter: temperatura, peso, comprimento ou volume.
		Depois, ele escolhe qual a unidade do valor que ele deseja converter
		Após isso, o usuário entra com o valor desejado
		Depois, ele escolhe para qual ele quer converter.
		As opções de temperatura, são: celsius, fahrenheit e kelvin.
		As opções de peso são: quilos, libras e onças
		As opções de comprimento são: metros, pés e polegadas
		As opções de volume são: litros, galão líquido e onças líquidas
		 */
		
		System.out.println("Conversor Universal:");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Você que converter o que? \n 1- Temperatura \n 2- Peso \n 3- Comprimento \n 4- Volume");
		int conversor = input.nextInt();
		
		if (conversor == 1) {
			
			
		} else if (conversor == 2) {
			
		} else if (conversor == 3) {
			
		} else if (conversor == 4) {
			
		} else {
			System.out.println("Inválido!");
		}

	}

}
