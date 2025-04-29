//Aluna: Gabrielli Danker

/*Faça uma classe chamada Aeronave.
Com os atributos:
• Modelo
• Passageiros
• Velocidade máxima
• Capacidade de combustível
• Queima de combustível por minuto
Crie 4 objetos de sua preferência.
Calcule:
a) Qual aeronave leva o maior número de passageiros?
b) Qual das aeronaves pode ficar no ar por mais tempo?
c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais 
longe?*/

public class Aeronave {
    public String modelo;
    public int passageiros;
    public double velocidadeMax;
    public double capacidadeCombustivel;
    public double queimaCombustivelMin;

    public double tempoVoo(){
        return capacidadeCombustivel / (queimaCombustivelMin * 60);
    }

    public double distanciaMaxima(){
        return tempoVoo() * velocidadeMax;
    }
}
