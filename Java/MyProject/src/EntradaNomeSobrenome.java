//Autor: Gabrielli Danker
import java.util.Scanner;

public class EntradaNomeSobrenome {
		public static void main(String[] args) {
			
			System.out.println("Digite o seu primeiro nome: ");
			Scanner input = new Scanner(System.in);
			String nome = input.next();
			
			System.out.println("Digite seu sobrenome: ");
			Scanner input2 = new Scanner(System.in);
			String sobrenome = input.next();
			
			System.out.println("Seu nome completo é: " + nome + " " + sobrenome);
			
		}
}
