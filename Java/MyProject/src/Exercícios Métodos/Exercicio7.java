//Aluna: Gabrielli Danker
/*George Lucas utiliza uma fórmula para criar os nomes dos personagens em suas 
histórias (Jar Jar Binks, ObiWan Kenobi, etc).
A fórmula, supostamente, é:
Seu primeiro nome na série Star Wars:
i.Pegue as três primeiras letras de seu sobrenome
ii.Adicione a ele as duas primeiras letras de seu nome
Seu sobrenome na série Star Wars:
i.Pegue as duas primeiras letras do sobrenome de solteira de sua mãe
ii.Adicione a ele as três primeiras letras do nome da cidade onde você nasceu
Crie um método chamado generateStarWarsName que gera um nome completo Star 
Wars conforme descrito.
Imprima o seu nome Star Wars
As entradas serão os nomes completos.
Para separar, por exemplo as três primeiras letras do seu sobrenome, use o atributo
.charAt() das Strings */
import java.util.Scanner;

public class Exercicio7{
    public static void generateStarWarsName(String nome, String nomeMae, String cidade){
        //Pegar as 3 primeiras letras do sobrenome e adicionar essas 3 letras mais as 2 primeiras letra do seu nome
        String[] nomePartes = nome.split(" ");
        String sobrenome = nomePartes[nomePartes.length - 1];
        String nomeCompleto = nomePartes[0];

        String primeiroNome = "" + sobrenome.charAt(0) + sobrenome.charAt(1) + sobrenome.charAt(2) + nomeCompleto.charAt(0) + nomeCompleto.charAt(1);
        //Pegar as 2 primeiras letras do sobrenome de solteira da sua mãe e adiconar com ele as 3 primeiras letras do nome da cidade aonde você nasceu
        String[] nomePartesMae = nomeMae.split(" ");
        String sobrenomeMae = nomePartesMae[nomePartesMae.length - 1];
        String sobrenomeSW = "" + sobrenomeMae.charAt(0) + sobrenomeMae.charAt(1) + cidade.charAt(0) + cidade.charAt(1) + cidade.charAt(2);

        System.out.println("Seu nome Star Wars é: " + primeiroNome + " " + sobrenomeSW);   
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = input.nextLine();

        System.out.println("Digite o nome completo de solteira da sua mãe:");
        String nomeCompletoMae = input.nextLine();

        System.out.println("Digite a cidade onde você nasceu:");
        String cidadeNasceu = input.nextLine();

        generateStarWarsName(nomeCompleto, nomeCompletoMae, cidadeNasceu);
    }
}