//Autora: Gabrielli Danker

public class Aeronave {
    public String modelo;
    public int passageiros;
    public double velocidadeMax;
    public double capacidadeCombustivel;
    public double queimaCombustivelMin;

    public Aeronave(String modelo, int passageiros, double  velocidadeMax, double capacidadeCombustivel, double queimaCombustivelMin){
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMax = velocidadeMax;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivelMin = queimaCombustivelMin;
    }

    public double tempoVoo(){
        return capacidadeCombustivel / (queimaCombustivelMin * 60);
    }

    public double distanciaMaxima(){
        return tempoVoo() * velocidadeMax;
    }
}
