//Autora: Gabrielli Danker

public class Circulo {
    String cor;
    double raio;

    public Circulo (String cor, double raio){
        this.cor = cor;
        this.raio = raio;
    }

    public String getCor(){
        return cor;
    }

    public double getRaio(){
        return raio;
    }

    public void setCor(String cor){
        if(cor == null && cor.isBlank()){
            throw new IllegalArgumentException("Cor inválida");
        } else{
            this.cor = cor;
        }
    }

    public void setRaio(double raio){
        if(raio <= 0){
            throw new IllegalArgumentException("Raio inválido");
        } else{
            this.raio = raio;
        }
    }

    public double calcularArea(){
        //A = pi * (raio * raio)

        return Math.PI*(Math.pow(raio, 2));
    }
}
