//Autora: Gabrielli Danker

public class Main {
    public static void main(String[] args) {
        Floricultura floricultura = new Floricultura();

        floricultura.adicionarFlor(new Flor("Tulipa", 25.60, "Antonieta", false));
        floricultura.adicionarFlor(new Flor("Girassol", 30.99, "Valentina", true));
        floricultura.adicionarFlor(new Flor("Margarida", 12.65, "Claúdio", true));
        floricultura.adicionarFlor(new Flor("Violeta", 5.63, "Carlos", true));
        floricultura.adicionarFlor(new Flor("Flor de Liz", 23.62, "Diana", false));

        Flor maisCara = floricultura.florMaisCara();
        System.out.println("Flor mais cara: " + maisCara);

        double paraPresenteSim = floricultura.paraPresenteSim();
        double naoParaPresente = floricultura.naoParaPresente();

        System.out.println("Receita que são para presentes: " + paraPresenteSim);
        System.out.println("Receita que NÃO são para presentes: " + naoParaPresente);
        System.out.println(" ");
        System.out.println("Lista das flores:");
        floricultura.imprimirFlores();

    }
}
