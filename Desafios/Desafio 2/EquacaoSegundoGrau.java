
import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Resolvendo equação do segundo grau: ax² + bx + c = 0");
        System.out.print("Digite o valor de a: ");
        int a = input.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = input.nextInt();
        System.out.print("Digite o valor de c: ");
        int c = input.nextInt();
        
        if (a == 0) {
            System.out.println("Isso não é uma equação do segundo grau.");
            return;
        }

        double soma = -1.0 * b / a;
        double produto = 1.0 * c / a;

        boolean encontrou = false;

        for (int x = -100; x <= 100; x++) {
            for (int y = -100; y <= 100; y++) {
                if (x + y == soma && x * y == produto) {
                    System.out.println("As raízes da equação são: " + x + " e " + y);
                    encontrou = true;
                    break;
                }
            }
            if (encontrou) break;
        }
        if (!encontrou) {
            System.out.println("A equação não possui raízes reais inteiras.");
        }
    }
}
