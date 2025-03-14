//Autor: Gabrielli Danker
import java.util.Scanner;

public class EntradaNomeIdade {

	public static void main(String[] args) {
		System.out.println("Digete seu nome completo: ");
		Scanner input = new Scanner(System.in);
		String nome = input.next();
		
		System.out.println("Digite sua idade: ");
		Scanner input2 = new Scanner(System.in);
		int idade = input2.nextInt();
		
		System.out.println("Digite sua altura: ");
		Scanner input3 = new Scanner(System.in);
		double altura = input3.nextDouble();
		
		System.out.println("Digite seu peso: ");
		Scanner input4 = new Scanner(System.in);
		double peso = input4.nextDouble();
		
		System.out.println("Olá, " + nome);
		System.out.println("Sua idade é: " + idade);
		System.out.println("Sua altura: " + altura);
		System.out.println("Seu peso é: " + peso);

	}

}
