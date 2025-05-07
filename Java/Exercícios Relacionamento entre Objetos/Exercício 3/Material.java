
public class Material {
    private String nome;
    private String descricao;
    private double preco;
    private double volume;
    private double peso;
    private int qtdEstoque;

    public Material(String nome, String descricao, double preco, double volume, double peso, int qtdEstoque){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.volume = volume;
        this.peso = peso;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public double getPreco(){
        return preco;
    }

    public double getVolume(){
        return volume;
    }

    public double getPeso(){
        return peso;
    }

    public int getQtdEstoque(){
        return qtdEstoque;
    }

    public void adicionarUnidades(int unidadesEstoque){
        if(unidadesEstoque > 0){
            this.qtdEstoque += unidadesEstoque;
        } else{
            throw new IllegalArgumentException("Quantidade de estoque inválida");
        }
    }

    public void removerUnidades(int unidadesEstoque){
        if(unidadesEstoque > 0 && unidadesEstoque <= qtdEstoque){
            this.qtdEstoque -= unidadesEstoque;
        } else{
            throw new IllegalArgumentException("Unidades de estoque inválida");
        }
    }
    
    public void aplicarDesconto(double porcentagemDesconto){
        if(porcentagemDesconto > 0 && porcentagemDesconto <= 100){
            this.preco -= this.preco * (porcentagemDesconto/ 100);
        } else{
            throw new IllegalArgumentException("Unidades de estoque inválida");
        }
    }

            @Override
            public String toString() {
                return "Material [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + 
                       ", volume=" + volume + ", peso=" + peso + ", qtdEstoque=" + qtdEstoque + "]";
            }
        

}
