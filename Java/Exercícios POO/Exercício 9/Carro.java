//Autora: Gabrielli Danker

/*Deseja-se criar uma classe para controlar a velocidade do carro.
Implemente os métodos:
Acelerar: que deve somar a velocidade atual com a atual do carro (usar setVelocidade).
Desde que o valor do parâmetro seja maior ou igual a zero e menor que 20.
Senão, lance uma exceção
Reduzir: que deve reduzir a velocidade atual com a atual do carro (usar setVelocidade).
Desde que o valor do parâmetro seja maior ou igual a zero e menor que 30.
Senão, lance uma exceção */

public class Carro {
    private double velocidade;

    public Carro(){
        this.velocidade = 0;
    }

    public double getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }

    public double acelerar(){

    }
    public double reduzir(){

    }
}
