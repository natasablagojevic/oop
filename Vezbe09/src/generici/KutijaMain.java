package generici;

public class KutijaMain {
    public static void main(String[] args) {
        Kutija<Integer> kutija = new Kutija<>();

        System.out.println(kutija.toString());

        kutija.dodajPredmet(5);

        System.out.println(kutija.toString());

        int x = kutija.uzmiPredmet();

        System.out.println(x);

        System.out.println(kutija.toString());

//        x = kutija.uzmiPredmet();
    }
}
