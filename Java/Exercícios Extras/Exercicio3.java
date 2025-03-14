//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/**
		 * Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) precisa ser coberta por 
		 * azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo). 
		 * Escreva um programa que leia as quatro medidas hp, lp, ha e la, 
		 * calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.
		 * qtd = (hp * lp) / (ha * la)*/

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a altura da parede: ");
		double hp = input.nextDouble();
		
		System.out.println("Digite a largura da parede: ");
		double lp = input.nextDouble();
		
		System.out.println("Digite a altura do azulejo: ");
		double ha = input.nextDouble();
		
		System.out.println("Digite a largura do azulejo: ");
		double la = input.nextDouble();
		
		int quantidade =(int) ((hp * lp) / (ha * la));
		
		System.out.println("Você vai precisar de " + quantidade + " azulejos");
		
	}

}
