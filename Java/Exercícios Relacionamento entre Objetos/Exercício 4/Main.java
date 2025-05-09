//Autora: Gabrielli Danker

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("Gabrielli", 1000);
        Conta c2 = new Conta("Alexandre", 800);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());

        c1.depositarDinheiro(100);
        System.out.println(c1.getSaldo());

        c2.sacarDinheiro(150);
        System.out.println(c2.getSaldo());

        c1.tranferirDinheiro(c2, 50);
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
        
    }
}
