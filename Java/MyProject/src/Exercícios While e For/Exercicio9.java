//Autor: Gabrielli Danker
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/*Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do
	sexo (sexo = 'M' ou 'm' para masculino e sexo = 'F' ou 'f' para feminino) de cada pessoa informe 
	a média da altura das mulheres e a média de altura do grupo.
	A leitura deve ser finalizada ao digitar 0 para a altura*/
		
		Scanner input = new Scanner(System.in);
		DecimalFormat def = new DecimalFormat("0.00");
		
		double somaMulheres = 0;
		double somaTodos = 0;
		
		int contadorTodos = 0;
		int contadorMulheres = 0;
		int i = 0;
		
		while (i == 0) {
			System.out.println("Digite a altura (ou 0 para sair): ");
			double altura = input.nextDouble();
			
			if (altura == 0) {
				break;
			} 
			System.out.println("Digite o gênero: ");
			String genero = input.next();
			
			somaTodos += altura;
			contadorTodos += 1;
			
			if (genero.equalsIgnoreCase("f")) {
				somaMulheres += altura;
				contadorMulheres += 1;
			}
		}
		if (contadorTodos > 0 && contadorMulheres > 0) {
			double mediaMulheres = somaMulheres / contadorMulheres;
			double mediaTodos = somaTodos / contadorTodos;
			
			System.out.println("A média de altura as mulheres é: " + def.format(mediaMulheres));
			System.out.println("A média de altura de todos é: " + def.format(mediaTodos));
		}

	}

}
