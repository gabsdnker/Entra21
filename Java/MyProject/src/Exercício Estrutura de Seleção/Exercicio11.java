//Autor: Gabrielli Danker
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo em que o usuário entra com um número.
		Depois ele escolhe a operação que vai ser feita com esse número
		Caso ele escolha a operação 1
		Modifique a variável do número entrado e some 10 ao número original
		Caso ele escolha a operação 2
		Modifique a variável do número entrado e subtraia 10 do número original
		Caso ele escolha a operação 3
		Modifique a variável do número entrado e multiplique 10 ao número original
		Caso ele escolha a operação 4
		Modifique a variável do número entrado e divida 10 do número origina
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Valor: ");
		int valor = input.nextInt();
		
		System.out.println("Escolha uma operação: \n 1- Operação 1 \n 2- Operação 2 \n 3- Operação 3 \n 4- Operação 4" );
		int operacao = input.nextInt();
		
		if (operacao == 1) {
			int op1 = valor + 10;
			System.out.println(op1);
			
		} else if (operacao == 2) {
			int op2 = valor - 10;
			System.out.println(op2);
			
		}else if (operacao == 3) {
			int op3 = valor * 10;
			System.out.println(op3);
			
		}else if (operacao == 4) {
			int op4 = valor /10;
			System.out.println(op4);
			
		} else {
			System.out.println("Operação inválida!");
		}

	}

}
