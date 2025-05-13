

public class Primatas extends Animais {

    public Primatas(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem) {
        super(raca, nomeIdentificacao, porte, habitat, paisOrigem);
    }

    @Override
    public String toString() {
        return super.toString() + ", Primatas";
    }
}
