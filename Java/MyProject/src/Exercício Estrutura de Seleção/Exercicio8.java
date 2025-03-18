//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma mensagem que 
			indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS.
			Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos 
			demais, e apenas irmãos se todas as idades forem diferentes.
			
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o ano de nascimento do irmão 1:");
		int irmao1 = input.nextInt();
		
		System.out.println("Digite o ano de nascimento do irmão 2:");
		int irmao2 = input.nextInt();
		
		System.out.println("Digite o ano de nascimento do irmão 3:");
		int irmao3 = input.nextInt();
		
		if (irmao1 == irmao2 && irmao1 == irmao3 && irmao2 == irmao3) {
			System.out.println("TRIGÊMEOS");
		}else if (irmao1 == irmao2 && irmao1 != irmao3) {
			System.out.println("Irmão 1 e Irmão 2 são GÊMEOS");
		} else if (irmao1 != irmao2 && irmao1 == irmao3) {
			System.out.println("Irmão 1 e Irmão3 são GÊMEOS");
		} else if (irmao2 == irmao3 && (irmao1 != irmao2 || irmao1 != irmao3) ) {
			System.out.println("Irmão 2 e Irmão 3 são GÊMEOS");
		} else {
			System.out.println("Apenas irmãos");
		}
	}

}
