

public class Zoologico {
        public static void main(String[] args) {
            GatosSelvagens gato = new GatosSelvagens("Leopardo", "Leo", "Grande", "Floresta", "Brasil", "Pardo", "Listrado");
            Aves ave = new Aves("Papagaio", "Loro", "Médio", "Floresta", "Brasil", "Verde", "Frutas");
            Primatas primata = new Primatas("Macaco", "Chico", "Pequeno", "Floresta", "Brasil");

            System.out.println(gato);
            System.out.println("");
            System.out.println(ave);
            System.out.println("");
            System.out.println(primata);
        }    
}
