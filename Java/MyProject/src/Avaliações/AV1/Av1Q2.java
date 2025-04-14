//Aluna: Gabrielli Danker
/*Questão 2: Uma grande loja de departamentos paga aos vendedores um salário variável com base 
nas vendas efetuadas durante o mês, que é igual a 17% de comissão sobre o preço de 
cada produto vendido. Cada vendedor, em um determinado mês, vende n reais em 
produtos.
Deseja-se obter um relatório com: nome, total de vendas (em R$) e salário base de cada 
vendedor. Descreva um algoritmo que gere o relatório desejado.
Para prosseguir com a entrada de um novo vendedor o algoritmo deve apresentar a 
seguinte mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)”*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Av1Q2 {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		DecimalFormat def = new DecimalFormat("0.00");
		
		String nome = " ";
		int i = 1;
		
		
		while(i != 0) {
			System.out.println("Digite o nome do vendedor:");
			nome = input.next();
			
			System.out.println("Digite a quantidade de vendas:");
			double vendas = input.nextDouble();
			
			System.out.println("Digite o salario fixo: ");
			double salarioBase = input.nextDouble();
			
			double totalVendas = vendas * 0.17;
			double salario = salarioBase + totalVendas;
			
			System.out.println("Relatório:\nNome: " + nome + "\nTotal de vendas: R$ " + def.format(totalVendas) + "\nSalario Total: R$ " + def.format(salario));
			
			System.out.println("Deseja digitar os dados de mais um vendedor: s (sim) / n (não) ");
			String desejo = input.next();
			
			if (desejo.equalsIgnoreCase("s")) {
				continue;
			} else {
				break;
			}
			
		}	
	}

}
