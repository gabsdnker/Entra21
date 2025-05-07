//Autora: Gabrielli Danker

public class Flor {
    private String nomeFlor;
    private double preco;
    private String nomeCliente;
    private boolean presente;

    public Flor(String nomeFlor, double preco, String nomeCliente, boolean presente){
        this.nomeFlor = nomeFlor;
        this.preco = preco;
        this.nomeCliente = nomeCliente;
        this.presente = presente;
    }

    public double getPreco(){
        return preco;
    }

    public boolean paraPresente(){
        return presente;
    }

    @Override
    public String toString(){
        return  nomeFlor + " [preço= " + getPreco() + "], [paraPresente= " + paraPresente() + "]";
    }

}
