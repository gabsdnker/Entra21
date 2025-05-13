

public class Animais {
    //Atributos
    String raca;
    String nomeIdentificacao;
    String porte;
    String habitat;
    String paisOrigem;

    //Getter
    public String getHabitat() {
        return habitat;
    }
    public String getNomeIdentificacao() {
        return nomeIdentificacao;
    }
    public String getPaisOrigem() {
        return paisOrigem;
    }
    public String getRaca() {
        return raca;
    }
    public String getPorte() {
        return porte;
    }

    //Setter
    public void setHabitat(String habitat) {
        if (habitat == null || habitat.isBlank()){
            throw new IllegalArgumentException("Habitat inválido");
        } else{
            this.habitat = habitat;
        }
    }
    public void setNomeIdentificacao(String nomeIdentificacao) {
         if (nomeIdentificacao == null ||  nomeIdentificacao.isBlank()){
            throw new IllegalArgumentException("Nome de identificação inválido");
        } else{
            this.nomeIdentificacao = nomeIdentificacao;
        }
    }
    public void setPaisOrigem(String paisOrigem) {
       if(paisOrigem == null || paisOrigem.isBlank()){
            throw new IllegalArgumentException("País de origem inválido");
       }else{
            this.paisOrigem = paisOrigem;
       }
    }
    public void setPorte(String porte) {
        //Validação se é pequeno, médio ou grande
        if(porte == null || (!porte.equalsIgnoreCase("pequeno") && !porte.equalsIgnoreCase("médio") && !porte.equalsIgnoreCase("grande"))){
            throw new IllegalArgumentException("Porte inválido");
       }else{
            this.porte = porte;
       }
    }
    public void setRaca(String raca) {
        if(raca == null || raca.isBlank()){
            throw new IllegalArgumentException("Raça inválida");
       }else{
            this.raca = raca;
       }
    }

    //Contrutor
    public Animais(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem) {
        setRaca(raca);
        setNomeIdentificacao(nomeIdentificacao);
        setPorte(porte);
        setHabitat(habitat);
        setPaisOrigem(paisOrigem);
    }

    //Lista dos animais
    @Override
    public String toString() {
        return "Animal{" + "raça= " + raca + 
        ", nome de identificação= " + nomeIdentificacao + 
        ", porte= " + porte +
        ", habitat=" + habitat + 
        ", país de origem= " + paisOrigem + 
        "}";

    }
    
}
