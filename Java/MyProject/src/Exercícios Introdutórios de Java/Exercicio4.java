//Autor: Gabrielli Danker
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/**
		 * Escreva um programa que leia o número de um funcionário, seu nome, sua quantidade de 
		horas trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário.
		A seguir, mostre o número, nome e o salário do funcionário, com duas casas decimais

		 */
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Digite o número do funcionário: ");
		String numeroFuncionario = input.next();
		
		System.out.println("Digite o nome do funcionário: ");
		String nome = input.next();
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		double horasTrabalhadas = input2.nextDouble();
		
		System.out.println("Digite o valor que o funcionário recebe por hora: ");
		double valorHora = input2.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		
	
		System.out.println("Número do funcionário: " + numeroFuncionario);
		System.out.println("Nome: " + nome);
		System.out.println("Salário: " + df.format(salario));

	}

}
