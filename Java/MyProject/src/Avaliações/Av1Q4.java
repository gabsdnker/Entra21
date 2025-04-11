import java.util.Scanner;

public class Av1Q4 {

	public static void main(String[] args) {
		/*Você foi atarefado de desenvolver um programa que realiza uma análise de dados em uma 
		array bidimensional que representa a informação da temperatura de uma determinada 
		semana. Cada linha corresponde a um dia da semana e cada coluna corresponde a uma 
		hora do dia.
		Calcule:*/
		Scanner input = new Scanner(System.in);
		
		double matriz[][] = {{22.1, 23.5, 24.0, 23.8, 22.6, 21.9, 21.7, 22.2, 23.0, 24.1, 24.5, 24.0, 24.3, 24.4, 24.0, 24.5, 24.1, 24.4, 24.8, 24.5, 24.3, 24.7, 24.9, 23.8}, 
							{21.8, 22.7, 23.2, 23.9, 23.7, 22.8, 22.5, 22.1, 22.9, 24.0, 24.6, 25.1, 26.2, 27.5, 28.1, 28.6, 29.2, 29.5, 28.9, 27.6, 26.4, 25.8, 25.1, 24.0}, 
							{20.7, 21.0, 21.5, 22.1, 22.5, 22.7, 22.9, 23.1, 23.5, 23.9, 24.2, 24.6, 25.0, 25.3, 25.6, 25.9, 26.2, 26.5, 26.8, 27.1, 27.4, 27.7, 27.9, 27.8}, 
							{20.2, 20.5, 21.0, 21.4, 21.8, 22.2, 22.5, 22.8, 23.1, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8, 25.1, 25.4, 25.7, 26.0, 26.3, 26.6, 26.9, 27.1, 27.2}, 
							{19.8, 20.0, 20.3, 20.7, 21.1, 21.4, 21.8, 22.1, 22.4, 22.7, 23.0, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8, 25.1, 25.4, 25.7, 26.0, 26.2, 26.3, 26.5}, 
							{19.5, 19.8, 20.1, 23.5, 23.9, 24.3, 24.7, 25.1, 25.5, 26.8, 27.1, 28.4, 28.7, 29.0, 28.3, 28.6, 28.9, 29.2, 28.5, 28.8, 28.1, 27.3, 27.5, 26.7}, 
							{19.2, 19.5, 19.9, 20.3, 20.7, 21.1, 21.5, 21.9, 22.3, 22.7, 23.1, 23.4, 23.7, 24.0, 24.3, 24.6, 24.9, 25.2, 25.5, 25.8, 26.1, 26.3, 26.5, 26.7}};
		
		/*a) A média diária de um dia da semana específico. O usuário entrará com o dia da semana 
		por extenso, por exemplo “domingo”, então você deve pesquisar na linha correspondente.*/
		
		//Cada linha corresponde a um dia da semana
		//Cada coluna corresponde a uma hora do dia
		
		
		for(int i = 0; i < 1; i ++) {
			for(int j = 0; j < 1; j ++) {
				System.out.println("Digite o dia da semana:");
				String diaSemana = input.next();
				
				if(diaSemana.equalsIgnoreCase("Domingo")) {
					double mediaDiaria = matriz[i][0]/matriz[j].length;
					
					System.out.println("Média diaria de " + diaSemana + " é: " + mediaDiaria);
					
					
				} else if(diaSemana.equalsIgnoreCase("Segunda")) {
					double mediaDiaria = matriz[i][1]/matriz[j].length;
					
					System.out.println("Média diaria de " + diaSemana + " é: " + mediaDiaria);
					
					
				} else if(diaSemana.equalsIgnoreCase("Terça")) {
					double mediaDiaria = matriz[i][2]/matriz[j].length;
					
					System.out.println("Média diaria de " + diaSemana + " é: " + mediaDiaria);
				
					
				} else if (diaSemana.equalsIgnoreCase("Quarta")) {
					double mediaDiaria = matriz[i][3]/matriz[j].length;
					
					System.out.println("Média diaria de " + diaSemana + " é: " + mediaDiaria);
				
					
				} else if (diaSemana.equalsIgnoreCase("Quinta")) {
					double mediaDiaria = matriz[i][4]/matriz[j].length;
					
					System.out.println("Média diaria de " + diaSemana + " é: " + mediaDiaria);
			
					
				} else if(diaSemana.equalsIgnoreCase("Sexta")) {
					double mediaDiaria = matriz[i][5]/matriz[j].length;
					
					System.out.println("Média diaria de " + diaSemana + " é: " + mediaDiaria);
			
					
				} else if(diaSemana.equalsIgnoreCase("Sábado")) {
					double mediaDiaria = matriz[i][6]/matriz[j].length;
					
					System.out.println("Média diaria de " + diaSemana + " é: " + mediaDiaria);
			
					
				} else {
					System.out.println("Inválido");
				}
				
			}
		}
		
	}

}
