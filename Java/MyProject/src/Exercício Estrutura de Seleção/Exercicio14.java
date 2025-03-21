//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/*
		 * Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo para ler as 
		idades dos filhos e exibir quem é o mais velho, o irmão do meio e o caçula da família. Suponha 
		que não haja empates.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a idade do Marquinhos: ");
		int idadeM = input.nextInt();
		
		System.out.println("Digite a idade do Zezinho: ");
		int idadeZ = input.nextInt();
		
		System.out.println("Digite a idade do Luluzinha: ");
		int idadeL = input.nextInt();
		
		if (idadeZ > idadeM && idadeZ > idadeL) {
			System.out.println("Zezinho mais velho");
			if (idadeM > idadeL) {
				System.out.println("Marquinhos irmão do meio\n Luluzinha irmã caçula");
			} else {
				System.out.println("Luluzinha irmã do meio\n Marquinhos irmão caçula");
			}
		}else if(idadeM > idadeZ && idadeM > idadeL) {
			System.out.println("Marquinhos irmão mais velho");
			if(idadeZ > idadeL){
				System.out.println("Zezinho irmão do meio\n Luluzinha irmã caçula");
			} else {
				System.out.println("Luluzinha irmã do meio\n Zezinho irmão caçula");
			}
		}else {
			System.out.println("Luluzinha irmã mais velha");
			if (idadeM > idadeZ) {
				System.out.println("Marquinhos irmão do meio\n Zezinho irmão caçula");
			}else {
				System.out.println("Zezinho irmão do meio\n Marquinhos irmão caçula");
			}
		}

	}

}
