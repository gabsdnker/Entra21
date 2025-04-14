//Aluna: Gabrielli Danker
/*Faça um programa em que o usuário entre com um número de 1 a 4
		Com o número 1 sendo verão, 2 sendo outono...
		Dependendo de o que o usuário informa, imprima:
		É verão
		E o tempo está quente
		Ou
		É inverno
		E está frio
		Faça um método para cada estação do ano*/

import java.util.Scanner;

public class Exercicio1 {
	public static void verao() {
			System.out.println("É verão!\nE o tempo está quente!");
	}
	public static void outono() {
			System.out.println("É outono!\nO tempo esta fresco!");
	}
	public static void inverno() {
			System.out.println("É inverno!\nEstá frio!");
	}
	public static void primavera() {
		System.out.println("É primavera!\nAs flores estão nascendo!");		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 4:");
		int estacao = input.nextInt();
		
		if (estacao == 1) {
			verao();
		} else if (estacao == 2) {
			outono();
		} else if(estacao == 3) {
			inverno();
		} else if (estacao == 4) {
			primavera();
		} else {
			System.out.println("Inválido");
		}
	}

}
