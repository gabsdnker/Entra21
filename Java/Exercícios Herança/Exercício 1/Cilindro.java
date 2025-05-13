//Autora: Gabrielli Danker

public class Cilindro extends Circulo {
    double altura;

    public Cilindro(String cor, double raio, double altura){
        super(cor, raio);
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        if (altura <= 0){
            throw new IllegalArgumentException("Altura inválida");
        } else{
            this.altura = altura;
        }
    }


    public double calcularVolume(){
        // V = pi * (raio * raio) * altura
        return calcularArea() * altura;
    }

}
