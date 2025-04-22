//Autora: Gabrielli Danker
/*Faça um método que calcule o perímetro e outro que calcule a área de um retângulo
passando a altura e largura como parâmetros
Retornar os valores calculados*/
//areaRetangulo = largura x altura
//areaPerimetro = 2 x (largura + altura)
import java.util.Scanner;

public class Exercicio13{
    public static double  calcularAreaRetangulo(double altura , double largura){
            double areaRetangulo = largura * altura;
            return areaRetangulo;
    }
    public static double calcularAreaPerimetro(double altura, double largura){
            double areaPerimetro = 2 * (largura + altura);
            return areaPerimetro;
    }
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("Digite a altura:");
        double a = input.nextDouble();

        System.out.println("Digite a largura:");
        double l = input.nextDouble();

        System.out.println("Area do retângulo: " + calcularAreaRetangulo(a, l));
        System.out.println("Area do perimetro: " + calcularAreaPerimetro(a, l));

    }
}