//Autor: Gabrielli Danker
import java.util.Scanner;

public class EntradaSomaNumero {

	public static void main(String[] args) {
		
		System.out.println("Digite um número: ");
		Scanner input = new Scanner(System.in);
		int numeroUm = input.nextInt();
		
		System.out.println("Digite outro número: ");
		Scanner input2 = new Scanner(System.in);
		int numeroDois = input2.nextInt();
		
		int soma = numeroUm + numeroDois;
		
		System.out.println("A soma desses números é: " + soma);
		

	}

}
