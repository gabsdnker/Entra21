//Autora: Gabrielli Danker

public class Main {
    public static void main(String[] args) {
        Material m1 = new Material("Cimento", "Cimento Portland", 25.0, 0.03, 50.0, 100);
        Material m2 = new Material("Areia", "Areia fina para construção", 15.0, 0.05, 100.0, 200);
        Material m3 = new Material("Tijolo", "Tijolo de barro", 0.5, 0.001, 2.0, 1000);
        Material m4 = new Material("Cal", "Cal hidratada", 10.0, 0.02, 20.0, 150);
        Material m5 = new Material("Brita", "Brita para concreto", 20.0, 0.04, 80.0, 300);

        //Adiconando materiais
        LojaContrucao l1 = new LojaContrucao();
        l1.adicionarMateriais(m1);
        l1.adicionarMateriais(m2);
        l1.adicionarMateriais(m3);
        l1.adicionarMateriais(m4);
        l1.adicionarMateriais(m5);

        //Adicionando unidades ao estoque 
        l1.adicionarUnidadeEstoque("Areia", 100);

        //Vendendo produtos
        l1.venderProduto("Brita", 35);

        //Colocando em promoção
        l1.colocarPromocao("Cimento", 20);

        //Imprimindo materiais
        l1.imprimirLojaConstrucao();
        System.out.println(" ");

        // a) Qual o material mais caro?
        System.out.println("Material mais caro: " + l1.materialMaisCaro());

        // b) Qual o material mais caro por metro cúbico?
        System.out.println("Material mais caro por metro cúbico: " + l1.materialCaroCubico());

        // c) Qual o material mais denso?
        System.out.println("Material mais denso: " + l1.materialMaisDenso());

        // d) Qual o material que mais ocupa espaço no estoque? 
        System.out.println("Material que ocupa mais espaço: " + l1.materialOcupaMaisEspaco());

    }
}
