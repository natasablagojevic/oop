package nasledjivanje;

public class Main {
    public static void main(String[] args) {
        Tacka t = new Tacka();
        Tacka t1 = new Tacka(4.1, 1.1);

        System.out.println(t);
        System.out.println(t1);

        System.out.println(Tacka.brojTacaka);
    }
}
