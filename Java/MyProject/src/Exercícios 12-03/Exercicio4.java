//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/**
		 * Escreva um programa que leia o número de um funcionário, seu nome, sua quantidade de 
		horas trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário.
		A seguir, mostre o número, nome e o salário do funcionário, com duas casas decimais

		 */
		
		System.out.println("Digite o número do funcionário: ");
		Scanner input = new Scanner(System.in);
		int numeroFuncionario = input.nextInt();
		
		System.out.println("Digite o nome do funcionário: ");
		Scanner input2 = new Scanner(System.in);
		String nome = input2.nextLine();
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		Scanner input3 = new Scanner(System.in);
		double horasTrabalhadas = input3.nextDouble();
		
		System.out.println("Digite o valor que o funcionário recebe por hora: ");
		Scanner input4 = new Scanner(System.in);
		double valorHora = input4.nextDouble();
		
		double salario = (horasTrabalhadas * valorHora);
		
	
		System.out.println("Número do funcionário: " + numeroFuncionario);
		System.out.println("Nome: " + nome);
		System.out.println("Salário: " + (String.format("%.2f", salario)));

	}

}
