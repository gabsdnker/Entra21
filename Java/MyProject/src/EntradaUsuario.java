//Autor: Gabrielli Danker
import java.util.Scanner;

public class EntradaUsuario {

	public static void main(String[] args) {
		
		System.out.println("Insira sua idade: ");
		Scanner input = new Scanner(System.in);
		int idade = input.nextInt();

		System.out.println("Sua idade é: " + idade + "anos");
	}

}
