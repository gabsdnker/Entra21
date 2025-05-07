
import java.util.ArrayList;
import java.util.List;

public class LojaContrucao {
   private List<Material> listaMateriais;

   public LojaContrucao(){
        listaMateriais = new ArrayList<>();
   }
   
   public void adicionarMateriais(Material material){
        listaMateriais.add(material);
    }

    public List<Material> listaMateriais(){
        return listaMateriais;
    }

    //Adicionar mais unidades da peça no estoque
    public void adicionarUnidadeEstoque(String nomeMaterial, int unidadesEstoque){
        for(Material material : listaMateriais){
            if(material.getNome().equalsIgnoreCase(nomeMaterial)){
                material.adicionarUnidades(unidadesEstoque);
                return;
            }
        }
    }

    //Vender um produto, podendo ser vendido até o mesmo número de peças que tem no estoque.

    //Colocar o produto em promoção, o parâmetro do método deve ser a porcentagem do desconto.

    public void imprimirLojaConstrucao(){
        for(Material material : listaMateriais){
            System.out.println(material);
        }
    }

}
