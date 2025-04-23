//Autora: Gabrielli Danker
//Classe Main da classe Produto
/*produto1: Produto
nome = “Caderno”
descricao = “Caderno em espiral tamanho médio”
precoUnitario = 4.50
desconto = 15
produto2: Produto
nome = “Caneta ESF”
descricao = “Caneta esferográfica 5mm”
precoUnitario = 1.20
desconto = 2
produto3: Produto 
nome = “Esquadro”
descricao = “Esquadro de acrílico 20 cm”
precoUnitario = 2.35
desconto = 10 */

public class MainProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Caderno";
        produto1.descricao = "Caderno em espiral tamanho médio";
        produto1.precoUnitario = 4.50;
        produto1.desconto = 15;

        Produto produto2 = new Produto();
        produto2.nome = "Caneta ESF";
        produto2.descricao = "Caneta esferográfica 5mm";
        produto2.precoUnitario = 1.20;
        produto2.desconto = 2;

        Produto produto3 = new  Produto();
        produto3.nome = "Esquadro";
        produto3.descricao = "Esquadro de acrílico 20 cm";
        produto3.precoUnitario = 2.35;
        produto3.desconto = 10;

        System.out.println("Nome do Produto: " + produto1.nome + "\nDescrição: " + produto1.descricao + "\nPreço Unitário: " + produto1.precoUnitario + "\nDesconto: " + produto1.desconto);
        System.out.println("Nome do Produto: " + produto2.nome + "\nDescrição: " + produto2.descricao + "\nPreço Unitário: " + produto2.precoUnitario + "\nDesconto: " + produto2.desconto);
        System.out.println("Nome do Produto: " + produto3.nome + "\nDescrição: " + produto3.descricao + "\nPreço Unitário: " + produto3.precoUnitario + "\nDesconto: " + produto3.desconto);
    }
}
