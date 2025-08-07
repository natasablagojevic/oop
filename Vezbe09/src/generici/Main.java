package generici;

public class Main {

    public static Par<String, Integer> vrati2Vrednosti() {
        return new Par<>("Danas", 3);
    }

    public static void main(String[] args) {
//        Par<String, Integer> par = new Par<>("Danas", 5);

        Par<String, String> par = new Par<>("Danas", "je lep dan!");

        System.out.println(par);

        System.out.println(par.getPrva());
        System.out.println(par.getDruga());

        System.out.println(vrati2Vrednosti());

    }
}
