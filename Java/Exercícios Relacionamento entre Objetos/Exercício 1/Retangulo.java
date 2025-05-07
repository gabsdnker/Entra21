//Autora: Gabrielli Danker

public class Retangulo {
    //Atributos
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea(){
        //A = altura * largura
        double area = altura * largura;
        return area;
    }

    public double calcularPerimetro(){
        //P = 2 * (altura + largura)
        double perimetro = 2 * (altura + largura);
        return perimetro;
    }

    @Override
    public String toString(){
        return "[altura= " + altura + "], [largura= " + largura + "], [Area= " + calcularArea() + "], [Perímetro= " + calcularPerimetro() + "]"; 
    }
}
