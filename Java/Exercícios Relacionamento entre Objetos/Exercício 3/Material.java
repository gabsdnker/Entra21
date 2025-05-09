//Autora: Gabrielli Danker

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
    //Adiciona unidades no estoque
    public void adicionarUnidades(int unidadesEstoque){
        //Verifica se a quantidade de estoque adicionada é maior que 0
        //Se sim, adiciona 
        if(unidadesEstoque > 0){
            this.qtdEstoque += unidadesEstoque;
            //Se não, mensagem de erro
        } else{
            throw new IllegalArgumentException("Quantidade de estoque inválida");
        }
    }
    //Remove unidades no estoque
    public void removerUnidades(int unidadesEstoque){
        //Verifica se a quantidade a ser removida é maior que 0 e se a quantidade de unidades a ser removida do estoque é menor ou igual a quantidade que tem no estoque
        //Se sim, removido
        if(unidadesEstoque > 0 && unidadesEstoque <= qtdEstoque){
            this.qtdEstoque -= unidadesEstoque;
            //Se não, mensagem de erro
        } else{
            throw new IllegalArgumentException("Unidades de estoque inválida");
        }
    }
    //Adiciona desconto no preço
    public void aplicarDesconto(double porcentagemDesconto){
        //Verrifica se a porcentagem do desconto é maior que 0 e se a porcentagem de desconto é menor ou igual a 100
        //Se sim, faz a conta de desconto do valor
        if(porcentagemDesconto > 0 && porcentagemDesconto <= 100){
            this.preco -= this.preco * (porcentagemDesconto/ 100);
            //Se não, mensagem de erro
        } else{
            throw new IllegalArgumentException("Desconto inválido");
        }
    }
    
    @Override
    public String toString() {
        return "Material [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", volume=" + volume + ", peso=" + peso + ", qtdEstoque=" + qtdEstoque + "]";
    }
}
