//Autora: Gabrielli Danker
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
    	/*Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes.
		Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), uma 
		nota para o cinema (zero até dez, valor inteiro) e a idade.
		Baseado nisto faça um programa que informe:
		- qual a nota média recebida pelo cinema;
		- qual a nota média atribuída pelos homens;
		- qual a nota atribuída pela mulher mais jovem;
		- quantas das mulheres com mais de 50 anos deram nota superior à média recebida pelo 
		cinema.
		Não utilize vetores!!*/
    	
        int matriz[][] = new int[30][3];
        Scanner input = new Scanner(System.in);

        System.out.println("----Pesquisa de satisfação do cinema!----");            
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Cliente " + (i + 1) + ":");
            
            //Gênero
            System.out.print("Informe seu gênero (1- Feminino ou 2- Masculino): ");
            matriz[i][0] = input.nextInt();
            
            //Nota do cinema
            System.out.print("Nota para o cinema (0 até 10): ");
            matriz[i][1] = input.nextInt();
            
            //Idade
            System.out.print("Qual a sua idade? ");
            matriz[i][2] = input.nextInt();
            
            //Validação
            if ((matriz[i][0] == 1 || matriz[i][0] == 2) && (matriz[i][1] >= 0 && matriz[i][1] <= 10) && (matriz[i][2] > 0)) {
                continue;
            } else {
                System.out.println("Inválido");
                break;
            }
        }
        
        int somaNotas = 0;
        int somaNotasHomens = 0;
        int qtdHomens = 0;
        int qtdMulheresMaisDe50 = 0;
        int notaMulherMaisJovem = Integer.MAX_VALUE;
        int idadeMulherMaisJovem = Integer.MAX_VALUE;
        
        for (int i = 0; i < matriz.length; i++) { 
        	//Soma das notas totais
            somaNotas += matriz[i][1];
            
            //Verificando se é homem
            if (matriz[i][0] == 2) {
            	//Quantidade de homens
                qtdHomens++;
                
                //Somando as notas do homens
                somaNotasHomens += matriz[i][1];
            } 
            //Verificando se é mulher
            if (matriz[i][0] == 1) {
            	
            	//Verficando quem é a mulher mais jovem
                if (matriz[i][2] < idadeMulherMaisJovem) {
                    idadeMulherMaisJovem = matriz[i][2];
                    //Verificando a nota da mulher mais jovem
                    notaMulherMaisJovem = matriz[i][1];
                }
                //Verificando quem é a mulher mais velha e a média 
                if (matriz[i][2] > 50 && matriz[i][1] > (double) somaNotas / matriz.length) {
                    qtdMulheresMaisDe50++;
                }
            }
        }
        
        double mediaNotasTotal = (double) somaNotas / matriz.length;
        double mediaNotasHomens = (qtdHomens > 0) ? (double) somaNotasHomens / qtdHomens : 0;
        
        System.out.println("Nota média total recebida pelo cinema: " + mediaNotasTotal);
        System.out.println("Nota média recebida pelos homens: " + mediaNotasHomens);
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Quantidade de mulheres com idade superior a 50 anos que votaram acima da média da nota total: " + qtdMulheresMaisDe50);
        
    }
}
