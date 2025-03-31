//Autor: Gabrielli Danker
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		/*Crie uma array de 5 elementos e descubra:
		a) Qual o maior elemento
		b) Qual o menor elemento
		c) A média dos elementos*/
		
		Scanner input = new Scanner(System.in);
		int elemento[] = new int[5];
		double numMax = Double.MIN_VALUE;
		double numMin = Double.MAX_VALUE;
		double soma = 0;
		double media = 0;
		
		
		for (int i = 0; i < elemento.length; i++) {
			System.out.println("Digite o elemento: ");
			elemento[i] = input.nextInt();
		}
		for (int i = 0 ; i < elemento.length; i++) {
			if (elemento[i] > numMax) {
				numMax = elemento[i];
			} if (elemento[i] < numMin) {
				numMin = elemento[i];
			} 
			 soma += elemento[i];
			 media = soma/5; 
		}
		System.out.println("Número máximo: " + numMax);
		System.out.println("Número minímo: " + numMin);
		System.out.println("Média: " + media);
	}

}


