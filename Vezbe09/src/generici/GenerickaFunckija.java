package generici;

public class GenerickaFunckija {

    public static <T> void genFunkcija(T podatak) {
        System.out.println("Podatak je: " + podatak.toString());
    }

    public static void main(String[] args) {
        Tacka tacka = new Tacka(2, 3);

        genFunkcija(tacka);
        genFunkcija(5);
        genFunkcija("Danas je lep dan!");
    }
}
