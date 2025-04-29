//Autora: Gabrielli Danker

public class Mercado {
    public String nomeMercado;
    public int numMacaVendidas;
    public double precoMaca;
    public int numLaranjaVendidas;
    public double precoLaranja;

    public double receitaMaca(){
        return numMacaVendidas * precoMaca;
    }

    public double receitaLaranja(){
        return numLaranjaVendidas * precoLaranja;
    }

    public double receitaTotal(){
        return receitaMaca() + receitaLaranja();
    }

}


