

public class Aves extends Animais {
    String corDasPenas;
    String tipoDeAlimentacao;

    public String getCorDasPenas() {
        return corDasPenas;
    }

    public String getTipoDeAlimentacao() {
        return tipoDeAlimentacao;
    }

    public void setCorDasPenas(String corDasPenas) {
        if(corDasPenas == null){

        } else{
            this.corDasPenas = corDasPenas;
        }
    }

    public void setTipoDeAlimentacao(String tipoDeAlimentacao) {
        if(tipoDeAlimentacao == null){
            
        } else{
            this.tipoDeAlimentacao = tipoDeAlimentacao;
        }
    }

    public Aves(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem, String corPenas, String tipoDeAlimentacao) {
        super(raca, nomeIdentificacao, porte, habitat, paisOrigem);
        setCorDasPenas(corDasPenas);
        setTipoDeAlimentacao(tipoDeAlimentacao);
    }

    @Override
    public String toString() {
        return super.toString() + ", Ave {" +
                "cor das penas= " + corDasPenas +
                ", tipo de alimentação= " + tipoDeAlimentacao +
                '}'
;
    }


}
