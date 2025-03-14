//Autor: Gabrielli Danker
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/**
		 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
		efetuadas por ele no mês (em valor).
		Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o 
		total a receber no final do mês, com duas casas decimais.
		 */
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
				

		System.out.println("Digite o nome do vendedor: ");
		String nome = input.nextLine();
		
		System.out.println("Digite o salário fixo: ");
		double salarioFixo = input.nextDouble();
		
		System.out.println("Digite o total de vendas efetuadas no mês: ");
		double vendas = input.nextDouble();

		double porcentagemComissao = 0.15;
		
		double comissao = (vendas * porcentagemComissao)/100 ;
		double salarioFinal = comissao + salarioFixo;
		
		System.out.println("Salário total: " + df.format(salarioFinal));	

	}

}
