//Autora: Gabrielli Danker

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
    public void venderProduto(String nomeMaterial, int unidadesEstoque){
        for (Material material : listaMateriais) {
            //Verifica se o nome do material existe
            if(material.getNome().equalsIgnoreCase(nomeMaterial)){
                //Se material existe, então verifica se a quantidade de estoque é maior ou igual a quantidade de unidades para venda
                //Se sim, remove o tanto que foi vendido
                if(material.getQtdEstoque() >= unidadesEstoque){
                   material.removerUnidades(unidadesEstoque);
                   return;
                } else{
                    //Se a quantidade de vendas for maior que a quantidade que tem no estoque retorna erro:
                    System.out.println("Estoque insuficiente");
                }
            } 
            return;
        }
        //Se, não existe retorna essa mensagem:
        System.out.println("Material não encontrado.");

    }

    //Colocar o produto em promoção, o parâmetro do método deve ser a porcentagem do desconto.
    public void colocarPromocao(String nomeMaterial, double porcentagemDesconto){
        for (Material material : listaMateriais) {
            //Verfica se o nome do material existe
            //Se sim,
            if(material.getNome().equalsIgnoreCase(nomeMaterial)){
                material.aplicarDesconto(porcentagemDesconto);
                return;

            }else{
                //Se, não mensagem de erro
                System.out.println("Material não encontrado");
            }
        }
    }

    //Encontrar o material mais caro
    public Material materialMaisCaro(){
        if(listaMateriais.isEmpty()){
            return null;
        }

        Material maisCaro = listaMateriais.get(0);
        for(Material material : listaMateriais){
            if(material.getPreco() > maisCaro.getPreco()){
                maisCaro = material;
            }
        }
        return maisCaro;
    }

    //Encontrar material mais caro por metro cúbico
    public Material materialCaroCubico(){
        if(listaMateriais.isEmpty()){
            return null;
        }

        Material maisCaroCubico = listaMateriais.get(0);
        for(Material material : listaMateriais){
            double precoMetroCubico = material.getPreco() / material.getVolume();
            double precoMaisCaroCubico = maisCaroCubico.getPreco()/ maisCaroCubico.getVolume();
            if(precoMetroCubico > precoMaisCaroCubico){
                maisCaroCubico = material;
            }
        }
        return maisCaroCubico;
    }

    //Encontrar o material mais denso
    public  Material materialMaisDenso(){
        if(listaMateriais.isEmpty()){
            return null;
        }

        Material maisDenso = listaMateriais.get(0);
        for(Material material : listaMateriais){
            double densidade = material.getPeso() / material.getVolume();
            double maisDensidade = material.getPeso() / material.getVolume();
            if(densidade > maisDensidade){
                maisDenso = material;
            }
        }
        return maisDenso;
    }

    //Encontra material que ocupa mais espaço no estoque
    public Material materialOcupaMaisEspaco(){
        if(listaMateriais.isEmpty()){
            return null;
        }

        Material ocupaMaisEspaco = listaMateriais.get(0);
        for(Material material : listaMateriais){
            double espacoOcupado = material.getVolume() * material.getQtdEstoque();
            double espacoMaisOcupado = material.getVolume() * material.getQtdEstoque();
            if(espacoOcupado > espacoMaisOcupado){
                ocupaMaisEspaco = material;
            }
        }
        return ocupaMaisEspaco;
    }

    public void imprimirLojaConstrucao(){
        for(Material material : listaMateriais){
            System.out.println(material);
        }
    }

}
