//Autor: Gabrielli Danker
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*Descreva um algoritmo que leia a altura de 5 pessoas e calcule a média de altura delas.*/
		Scanner input = new Scanner(System.in);
		DecimalFormat def = new DecimalFormat("0.00");
		
		double somaAlturas = 0.00;	
		int qtdPessoas = 5;
		
		for (int i = 0; i < qtdPessoas; i ++) {
			System.out.println("Digite a altura:");
			double altura = input.nextDouble();
			
			somaAlturas += altura;
		}
		double media = somaAlturas / qtdPessoas;
		
		System.out.println(def.format("A média de altura entre estas pessoas é: " + media));
		
	}

}
