//Autor: Gabrielli Danker
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * Faça uma calculadora.
		O usuário entra com dois números e depois com a operação desejada.
		Caso o número da operação seja 1: some os dois números.
		Caso seja 2: subtraia os dois números.
		Caso seja 3: multiplique os dois números.
		Caso seja 4: divida os dois números.
		 */
		
		System.out.println("Calculadora: ");
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double n1 = input.nextDouble();
		
		System.out.println("Digite um número: ");
		double n2 = input.nextDouble();
		
		System.out.println("Escolha a operação: \n 1- Adição \n 2- Subtração \n 3- Multiplique \n 4- Divisão");	
		int operacao = input.nextInt();
		
		if (operacao == 1) {
			double adicao = n1 + n2;
			System.out.println(adicao);
			
		} else if (operacao == 2){
			double subtracao = n1 - n2;
			System.out.println(subtracao);
			
		} else if (operacao == 3) {
			double multiplicacao = n1 * n2;
			System.out.println(multiplicacao);
			
		} else if (operacao == 4) {
			double divisao = n1 / n2;
			System.out.println(df.format(divisao));
			
		}else {
			System.out.println("Não existe essa opção de operação!");
		}
		
		
	}

}
