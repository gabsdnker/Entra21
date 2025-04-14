//Aluna: Gabrielli Danker
/*Faça um método para seus colegas mais próximos
O método deve imprimir:
O nome dele(a) é [nome]
Ele(a) tem [idade] anos
Ele(a) é estudante do Entra21
(Em prints separados)
Faça com que o método seja o nome do seu colega.
O usuário deve entrar com o nome da pessoa para escolher um dos métodos a ser 
executado.*/

import java.util.Scanner;

public class Exercicio2 {
	public static void daniela() {
		System.out.println("O nome dela é Daniela");
		System.out.println("Ela tem 35 anos");
		System.out.println("Ela é estudante do Entra21");
	}
	public static void beatriz() {
		System.out.println("O nome dela é Beatriz");
		System.out.println("Ela tem 21 anos");
		System.out.println("Ela é estudante do Entra21");
	}
	public static void gabriel() {
		System.out.println("O nome dele é Gabriel");
		System.out.println("Ele tem 28 anos");
		System.out.println("Ele é estudante do Entra21");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um nome: ");
		String nome = input.next();
		
		if (nome.equalsIgnoreCase("daniela")) {
			daniela();
		} else if(nome.equalsIgnoreCase("beatriz")) {
			beatriz();
		} else if (nome.equalsIgnoreCase("gabriel")) {
			gabriel();
		} else {
			System.out.println("Inválido");
		}

	}

}
