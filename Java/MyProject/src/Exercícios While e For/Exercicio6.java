//Autor: Gabrielli Danker
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar com o número 0
		Calcule a média de altura delas.*/
		
		Scanner input = new Scanner(System.in);
		DecimalFormat def = new DecimalFormat("0.00");
		
		double somaAlturas = 0;
		int contador = 0;
		
		while (true) {
			System.out.println("Digite a altura: ");
			double altura = input.nextDouble();
			
			if (altura == 0) {
				break;
			} else {
				somaAlturas += altura;
				contador += 1;
	
			}
		}
		if (contador > 0) {
			double media = somaAlturas/contador;
			System.out.println("A média: " + def.format(media));
		} else {
			System.out.println("Nenhuma altura foi inserida!");
		}

	}

}
