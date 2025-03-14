//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*Criar um programa que calcule a média de salários de uma empresa, 
		 * pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
		 * */
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o salário de funcionário 1: ");
		double funcionario1 = input.nextDouble();
		
		System.out.println("Digite o salário de funcionário 2: ");
		double funcionario2 = input.nextDouble();
		
		System.out.println("Digite o salário de funcionário 3: ");
		double funcionario3 = input.nextDouble();
		
		System.out.println("Digite o salário de funcionário 4: ");
		double funcionario4 = input.nextDouble();
		
		double media = (funcionario1 + funcionario2 + funcionario3 + funcionario4)/4;
		
		System.out.println("A média salarial da empresa é: " + media);
		

	}

}
