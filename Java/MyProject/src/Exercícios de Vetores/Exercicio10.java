import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*DESAFIO: Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça cada um 
		respondeu um questionário com 5 perguntas:
		- Gosta de música sertaneja?
		- Gosta de futebol?
		- Gosta de seriados?
		- Gosta de redes sociais?
		- Gosta da Oktoberfest?
		A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice de afinidade é 
		medido da seguinte maneira:
		- se ambos deram a mesma resposta soma-se 3 pontos ao índice;
		- se um respondeu IND e o outro SIM ou NÃO soma-se 1;
		- se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
		Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as respostas 
		da moça. Por fim, escreva a afinidade considerando os seguintes intervalos:
		| Afinidade | Mensagem |
		|-----------|-----------------------------------|
		| 15 | “Casem! |
		| 10 a 14 | “Vocês têm muita coisa em comum!” |
		| 5 a 9 | “Talvez não dê certo :(” |
		| 0 a 4 | “Vale um encontro.” |
		| -1 a -9 | “Melhor não perder tempo” |
		| -10 | “Vocês se odeiam!” |*/
		
		Scanner input = new Scanner(System.in);
		
        String[] perguntas = {"Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?", "Gosta de redes sociais?", "Gosta da Oktoberfest?"};
        String[] vetorMulher = new String[5];
        String[] vetorHomem = new String[5];
        int afinidade = 0;
        String mensagem = ""; // Inicializando a variável mensagem
        
        System.out.println("----------------------Teste de Afinidade----------------------");
        System.out.println("Responda (SIM, NÃO ou IND (indiferente) nas questões a seguir:");
        
        System.out.println("Respostas do Rapaz:");    
        
        for(int i = 0; i < vetorHomem.length; i++) {
            System.out.println(perguntas[i]);
            vetorHomem[i] = input.next();
        }
        
        System.out.println("Respostas da Moça:");    
        
        for(int i = 0; i < vetorMulher.length; i++) {
            System.out.println(perguntas[i]);
            vetorMulher[i] = input.next();
        }
        
        for(int i = 0; i < vetorHomem.length; i++) {
            if (vetorHomem[i].equalsIgnoreCase(vetorMulher[i])) {
                afinidade += 3;
            } else if (vetorHomem[i].equalsIgnoreCase("IND") || vetorMulher[i].equalsIgnoreCase("IND")) {
                afinidade += 1;
            } else if ((vetorHomem[i].equalsIgnoreCase("NÃO") && vetorMulher[i].equalsIgnoreCase("SIM")) || 
                       (vetorHomem[i].equalsIgnoreCase("SIM") && vetorMulher[i].equalsIgnoreCase("NÃO"))) {
                afinidade -= 2;
            } 
        }
        
        if (afinidade == 15) {
            mensagem = "Casem!";
        } else if (afinidade >= 10 && afinidade <= 14) {
            mensagem = "Vocês têm muita coisa em comum!";
        } else if (afinidade >= 5 && afinidade <= 9) {
            mensagem = "Talvez não dê certo :(";
        } else if (afinidade >= 0 && afinidade <= 4) {
            mensagem = "Vale um encontro.";
        } else if (afinidade >= -9 && afinidade <= -1) {
            mensagem = "Melhor não perder tempo";
        } else {
            mensagem = "Vocês se odeiam!";
        }
        
        System.out.println("Índice de afinidade: " + afinidade + " - " + mensagem);
    }

}
