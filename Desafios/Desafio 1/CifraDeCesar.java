import java.util.Scanner;

public class CifraDeCesar {

    public static String cifraCesar(String texto, int deslocamento, boolean cifrar) {
        StringBuilder resultado = new StringBuilder();

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                int deslocamentoReal = cifrar ? deslocamento : -deslocamento;
                char novoChar = (char) ((c - base + deslocamentoReal + 26) % 26 + base);
                resultado.append(novoChar);
            } else {
                resultado.append(c);
            }
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o texto:");
        String texto = input.nextLine();

        System.out.println("Escolha a opção: 1 - Cifrar | 2 - Decifrar");
        int opcao = input.nextInt();
        input.nextLine(); 

        String resultado;
        
        if (opcao == 1) {
            resultado = cifraCesar(texto, 3, true);
            System.out.println("Texto cifrado: " + resultado);
        } else if (opcao == 2) {
            resultado = cifraCesar(texto, 3, false);
            System.out.println("Texto decifrado: " + resultado);
        } else {
            System.out.println("Opção inválida.");
        }

    }
}
