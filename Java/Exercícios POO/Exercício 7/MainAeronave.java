//Autora: Gabrielli Danker
/*Crie 4 objetos de sua preferência.
Calcule:
a) Qual aeronave leva o maior número de passageiros?
b) Qual das aeronaves pode ficar no ar por mais tempo?
c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais 
longe?*/

public class MainAeronave {
    public static void main(String[] args) {
        Aeronave aeronave1 = new Aeronave();
        aeronave1.modelo = "Aeronave 1";
        aeronave1.passageiros = 32;
        aeronave1.velocidadeMax = 326.20;
        aeronave1.capacidadeCombustivel = 45.6;
        aeronave1.queimaCombustivelMin = 1.5;

        Aeronave aeronave2 = new Aeronave();
        aeronave2.modelo = "Aeronave 2";
        aeronave2.passageiros = 40;
        aeronave2.velocidadeMax = 50.6;
        aeronave2.capacidadeCombustivel = 51.0;
        aeronave2.queimaCombustivelMin = 2.1;

        Aeronave aeronave3 = new Aeronave();
        aeronave3.modelo = "Aeronave 3";
        aeronave3.passageiros = 36;
        aeronave3.velocidadeMax = 45;
        aeronave3.capacidadeCombustivel = 36.7;
        aeronave3.queimaCombustivelMin = 0.98;   


        Aeronave aeronave4 = new Aeronave();
        aeronave4.modelo = "Aeronave 4";
        aeronave4.passageiros = 26;
        aeronave4.velocidadeMax = 26.6;
        aeronave4.capacidadeCombustivel = 60;
        aeronave4.queimaCombustivelMin = 1.25;

        
        Aeronave maiorCapacidade = aeronave1.passageiros > aeronave2.passageiros && aeronave1.passageiros > aeronave3.passageiros && aeronave1.passageiros > aeronave4.passageiros ? aeronave1 : aeronave2.passageiros > aeronave3.passageiros && aeronave2.passageiros > aeronave4.passageiros ? aeronave2 :
        aeronave3.passageiros > aeronave4.passageiros ? aeronave3 : aeronave4;

        Aeronave maiorAutonomia = aeronave1.tempoVoo() > aeronave2.tempoVoo() && aeronave1.tempoVoo() > aeronave3.tempoVoo() && aeronave1.tempoVoo() > aeronave4.tempoVoo() ? aeronave1 :
        aeronave2.tempoVoo() > aeronave3.tempoVoo() && aeronave2.tempoVoo() > aeronave4.tempoVoo() ? aeronave2 : aeronave3.tempoVoo() > aeronave4.tempoVoo() ? aeronave3 : aeronave4;

        
        Aeronave maiorDistancia = aeronave1.distanciaMaxima() > aeronave2.distanciaMaxima() && aeronave1.distanciaMaxima() > aeronave3.distanciaMaxima() && aeronave1.distanciaMaxima() > aeronave4.distanciaMaxima() ? aeronave1 :
        aeronave2.distanciaMaxima() > aeronave3.distanciaMaxima() && aeronave2.distanciaMaxima() > aeronave4.distanciaMaxima() ? aeronave2 :
        aeronave3.distanciaMaxima() > aeronave4.distanciaMaxima() ? aeronave3 : aeronave4;
        
        System.out.println("Qual aeronave leva o maior número de passageiros? " + maiorCapacidade.modelo);
        System.out.println("Qual das aeronaves pode ficar no ar por mais tempo? " + maiorAutonomia.modelo);
        System.out.println("Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe? " + maiorDistancia.modelo);

    }
}
