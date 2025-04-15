
import java.util.Scanner;

public class MetodoComParametro{
    public static void multiplicar(double valor1, double valor2){
        double resultado = valor1 * valor2;
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserir o número 1");
        double numero1 = input.nextDouble();

        System.out.println("Inserir o número 2");
        double numero2 = input.nextDouble();

        multiplicar(numero1, numero2);
    }
}