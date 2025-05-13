public class GatosSelvagens extends Animais{
    //Atributos
    String corPelagem;
    String tipoDeManchas;

    //Getter
    public String getTipoDeManchas() {
        return tipoDeManchas;
    }
    public String getCorPelagem() {
        return corPelagem;
    }

    //Setter
    public void setCorPelagem(String corPelagem) {
        //Validação se é pardo ou preto
        if(corPelagem == null || (!corPelagem.equalsIgnoreCase("pardo") && !corPelagem.equalsIgnoreCase("preto"))){
            throw new IllegalArgumentException("Cor da pelagem inválida");
        } else{
            this.corPelagem = corPelagem;
        }
    }
    public void setTipoDeManchas(String tipoDeManchas) {
        //Validação se é ausente de manchas, pinta, listrado
        if(tipoDeManchas == null || (!tipoDeManchas.equalsIgnoreCase("ausente de manchas") && !tipoDeManchas.equalsIgnoreCase("pinta") && !tipoDeManchas.equalsIgnoreCase("listrado"))){
            throw new IllegalArgumentException("Tipos de manchas inválido");
        } else{
            this.tipoDeManchas = tipoDeManchas;
        }
    }

    //Construtor
    public GatosSelvagens(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem,String corPelagem, String tipoDeManchas) {
        super(raca, nomeIdentificacao, porte, habitat, paisOrigem);
        setCorPelagem(corPelagem);
        setTipoDeManchas(tipoDeManchas);
    }

    @Override
    public String toString(){
        return super.toString() + ", GatoSelvagem {" +
        "cor da pelagem=" + corPelagem + '\'' +
        ", tipo de manchas= " + tipoDeManchas +
        '}';

    }
}