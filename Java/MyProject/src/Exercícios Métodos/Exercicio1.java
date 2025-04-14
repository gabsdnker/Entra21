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
	public static void imprimirVerao() {
			System.out.println("É verão!\nE o tempo está quente!");
	}
	public static void imprimirOutono() {
			System.out.println("É outono!\nO tempo esta fresco!");
	}
	public static void imprimirInverno() {
			System.out.println("É inverno!\nEstá frio!");
	}
	public static void imprimirPrimavera() {
		System.out.println("É primavera!\nAs flores estão nascendo!");		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a estação:\n1- Verão\n2- Outono\n3- Inverno\n4- Primavera");
		int estacao = input.nextInt();
		
		if (estacao == 1) {
			 imprimirVerao();
		} else if (estacao == 2) {
			imprimirOutono();
		} else if(estacao == 3) {
			imprimirInverno();
		} else if (estacao == 4) {
			 imprimirPrimavera();
		} else {
			System.out.println("Inválido");
		}
	}

}
