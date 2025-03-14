//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Faça um algoritmo que imprima "nome correto" caso o nome inserido seja o seu.*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = input.nextLine();
		
		String nome2 = "Gabrielli Danker";
		
		nome2.trim();
		
		if (nome.equals(nome2)) {
			System.out.println("Nome correto.");
		}
		else {
			System.out.println("Nome incorreto!");
		}

	}

}
