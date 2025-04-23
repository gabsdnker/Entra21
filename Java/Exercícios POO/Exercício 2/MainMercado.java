//Autora: Gabrielli Danker

//Classe Main da Classe Mercado

public class MainMercado {
    public static void main(String[] args) {
        Mercado unidadeBlumenau = new Mercado();
        unidadeBlumenau.nomeMercado = "Komprão Blumenau";
        unidadeBlumenau.numMacaVendidas = 300;
        unidadeBlumenau.precoMaca = 2.50;
        unidadeBlumenau.numLaranjaVendidas = 250;
        unidadeBlumenau.precoLaranja = 3.29;

        Mercado unidadeJoinville = new  Mercado();
        unidadeJoinville.nomeMercado = "Komprão Joinville";
        unidadeJoinville.numMacaVendidas = 268;
        unidadeJoinville.precoMaca = 2.36;
        unidadeJoinville.numLaranjaVendidas = 352;
        unidadeJoinville.precoLaranja = 3.25;

        Mercado unidadeFlorianopolis = new Mercado();
        unidadeFlorianopolis.nomeMercado = "Komprão Florianopolis";
        unidadeFlorianopolis.numMacaVendidas = 245;
        unidadeFlorianopolis.precoMaca = 3.58;
        unidadeFlorianopolis.numLaranjaVendidas = 256;
        unidadeFlorianopolis.precoLaranja = 2.56;

        System.out.println("Unidade de Blumenau: " + unidadeBlumenau.nomeMercado + "\nNúmero de maças vendidas: " + unidadeBlumenau.numMacaVendidas + " Preço: " + unidadeBlumenau.precoMaca
        + "\nNúmero de laranjas vendidas: " + unidadeBlumenau.numLaranjaVendidas + " Preço: " + unidadeBlumenau.precoLaranja);

        System.out.println("Unidade de Joinville: " + unidadeJoinville.nomeMercado + "\nNúmero de maças vendidas: " + unidadeJoinville.numMacaVendidas + " Preço: " + unidadeJoinville.precoMaca
        + "\nNúmero de laranjas vendidas: " + unidadeJoinville.numLaranjaVendidas + " Preço: " + unidadeJoinville.precoLaranja);

        System.out.println("Unidade de Florianópolis: " + unidadeFlorianopolis.nomeMercado + "\nNúmero de maças vendidas: " + unidadeFlorianopolis.numMacaVendidas + " Preço: " +
        unidadeFlorianopolis.precoMaca + "\nNúmero de laranjas vendidas: " + unidadeFlorianopolis.numLaranjaVendidas + " Preço: " + unidadeFlorianopolis.precoLaranja);
    }
}
