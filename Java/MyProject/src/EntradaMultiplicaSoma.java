//Autor: Gabrielli Danker
import java.util.Scanner;

public class EntradaMultiplicaSoma {

	public static void main(String[] args) {
		
		System.out.println("Digite o primeiro número: ");
		Scanner input = new Scanner(System.in);
		int numeroUm = input.nextInt();
		
		System.out.println("Digete o segundo número para a soma: ");
		Scanner input2 = new Scanner(System.in);
		int numeroDois = input2.nextInt();
		
		int soma = numeroUm + numeroDois;
		
		System.out.println("A soma desses dois número é: " + soma);
		
		System.out.println("Digite o terceiro número para multiplicar pela soma: ");
		Scanner input3 = new Scanner(System.in);
		int numeroTres = input3.nextInt();
		
		int multiplica = soma * numeroTres;
		
		System.out.println("A multiplicação da soma é: " + multiplica);

	}

}
