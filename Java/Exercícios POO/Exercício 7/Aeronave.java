

public class Aeronave {
    public String modelo;
    public int passageiros;
    public int velocidadeMax;
    public double capacidadeCombustivel;
    public double queimaCombustivelMin;

    public Aeronave(String modelo, int passageiros, int  velocidadeMax, double capacidadeCombustivel, double queimaCombustivelMin){
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

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        if(modelo == null || modelo.isBlank()){
            System.out.println("Erro, modelo inválido");
        } else{
            this.modelo = modelo;
        }
    }

    public int getPassageiros(){
        return passageiros;
    }

    public void setPassageiros(int passageiros){
        if(passageiros < 0){
            System.out.println("Quantidade de passageiros inválidos");
        } else{
            this.passageiros = passageiros;
        }
    }

    public int getVelocidadeMax(){
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax){
        if (velocidadeMax <= 0){
            System.out.println("Erro, velocidade máxima inválida");
        } else{
            this.velocidadeMax = velocidadeMax;
        }
    }

    public double getCapCombustivel(){
        return capacidadeCombustivel;
    }

    public void setCapCombustivel(double  capacidadeCombustivel){
        if(capacidadeCombustivel <= 0){
            System.out.println("Erro, capacidade de combustível inválida");
        } else{
            this.capacidadeCombustivel = capacidadeCombustivel;
        }
    }

    public double getQueimaCombustivel(){
        return queimaCombustivelMin;
    }

    public void setQueimaCombustivel(){
        if(queimaCombustivelMin <= 0){
            System.out.println("Erro, queima combustível inválida");
        } else{
            this.queimaCombustivelMin = queimaCombustivelMin;
        }
    }

    @Override
    public String toString(){
        return "Aeronave [modelo= " + modelo + ", passageiros= " + passageiros + ", velocidadeMax= " + velocidadeMax + ", capacidadeCombustivel= " + capacidadeCombustivel + ", queimaCombustivelMin= " + queimaCombustivelMin + "]";
    }

}
