//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*Dada a idade de um nadador descreva um algoritmo que o classifique em uma das seguintes categorias:
      	pré-mirim 5 - 7 anos
      	mirim 8 - 10 anos
		infantil 11 - 13 anos
		infanto-juvenil 14 - 17 anos
		juvenil 18 - 20 anos
		adulto maiores de 21 anos*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a idade do nadador: ");
		int idade = input.nextInt();
		
		if (idade >= 5 && idade <= 7) {
			System.out.println("A classificação é Pré-Mirim!");
		} else if (idade >= 8 && idade <=10) {
			System.out.println("A classificação é Mirim!");
		} else if (idade >= 11 && idade <= 13) {
			System.out.println("A classificação é Infantil!");
		} else if (idade >= 14 && idade <=17) {
			System.out.println("A classificação é Infanto-Juvenil!");
		} else if (idade >= 18 && idade <= 20) {
			System.out.println("A classificação é Juvenil!");
		} else {
			System.out.println("Adulto maiores de 21 anos!");
		}
	}

}
