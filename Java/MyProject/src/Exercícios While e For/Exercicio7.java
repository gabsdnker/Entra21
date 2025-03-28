//Autor: Gabrielli Danker
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		/*Escreva um algoritmo que leia o número de inscrição e a altura de um atleta e informe: 
		• O número de inscrição e a altura do atleta mais alto; 
		• O número de inscrição e a altura do atleta mais baixo; 
		• A altura média do grupo de atletas.	
		• A quantidade de atletas cadastrados
		A leitura deve ser finalizada ao digitar 0 para o número de inscrição.*/
		
			Scanner input = new Scanner(System.in);
			DecimalFormat def = new DecimalFormat("0.00");
			
			double somaAlturas = 0;
			int contador = 0;
			
			long atletaMaisAlto = 0;
			long atletaMaisBaixo = 0;
			
			double alturaMaisAlto = Double.MIN_VALUE;
			double alturaMaisBaixo = Double.MAX_VALUE;
			
			int i = 0;
			
			while (i == 0) {
				System.out.println("Digite o número inscrição: ");
				long inscricao = input.nextLong();
				
				if (inscricao == 0) {
					break;
				}
				
				System.out.println("Digite a altura: ");
				double altura = input.nextDouble();
				
				somaAlturas += altura;
				contador += 1;
		
				if (altura > alturaMaisAlto) {
					alturaMaisAlto = altura;
					atletaMaisAlto = inscricao;			
					
				}else if (altura < alturaMaisBaixo) {
					alturaMaisBaixo = altura;
					atletaMaisBaixo = inscricao;
				}

			}
			if (contador > 0) {
				double media = somaAlturas / contador;
				System.out.println("Número da inscrição do atleta mais alto: " + atletaMaisAlto + " - " + def.format(alturaMaisAlto));
				System.out.println("Número da inscrição do atleta mais baixo: " + atletaMaisBaixo + " - " + def.format(alturaMaisBaixo));
				
				System.out.println("A altura média dos atletas é: " +  def.format(media));
				
				System.out.println("Quantidade de atletas: " + contador);
				
			}

	}
}
