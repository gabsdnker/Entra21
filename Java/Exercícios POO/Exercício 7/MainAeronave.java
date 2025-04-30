//Autora: Gabrielli Danker

public class MainAeronave {
    public static void main(String[] args) {
        Aeronave aeronave1 = new Aeronave("Aeronave 1", 26, 26.6, 60, 1.25);
        Aeronave aeronave2 = new Aeronave("Aeronave 2", 30, 30.1, 30.6, 3.8);
        Aeronave aeronave3 = new Aeronave("Aeronave 3", 45, 24.5, 10.50, 2.6);
        Aeronave aeronave4 = new Aeronave("Aeronave 4", 15, 27.8, 63.2, 1.6);

        Aeronave[] vetor = {aeronave1, aeronave2, aeronave3, aeronave4};

        //Qual aeronave leva o maior número de passageiros?
        int maiorNumPassageiros = Integer.MIN_VALUE;
        String nomeAeronaveMaisPassageiros = " ";

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i].passageiros > maiorNumPassageiros){
                maiorNumPassageiros = vetor[i].passageiros;
                nomeAeronaveMaisPassageiros = vetor[i].modelo;
            }
        }

        // Qual das aeronaves pode ficar no ar por mais tempo?
        double maiorAutonomia = Double.MIN_VALUE;
        String nomeMaiorAutonomia = " ";

        for (int i = 0; i < vetor.length; i++) {
            
        }

        // Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe?
        double maiorDistancia = Double.MIN_VALUE;
        String nomeMaiorDistancia = " ";
        
        System.out.println("a) Qual aeronave leva o maior número de passageiros? " + nomeAeronaveMaisPassageiros);
        System.out.println("b) Qual das aeronaves pode ficar no ar por mais tempo? " + nomeMaiorAutonomia);
        System.out.println("c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe? " + nomeMaiorAutonomia);

    }
}
