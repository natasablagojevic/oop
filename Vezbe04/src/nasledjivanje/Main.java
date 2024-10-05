package nasledjivanje;

public class Main {
    public static void main(String[] args) {
//        Tacka t = new Tacka(1, 3);
//
//        Kvadrat k = new Kvadrat(new Tacka(1, 3));
//
//        System.out.println(k);

        Oblik []niz = new Oblik[5];

        niz[0] = new Pravougaonik(2, 3);
        niz[1] = new Trougao(new Tacka(2, 3), new Tacka(6,5), new Tacka(9, 5));
        niz[2] = new Pravougaonik(5, 1);
        niz[3] = new Kvadrat(9);
        niz[4] = new Kvadrat(12);

        int broj = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] instanceof Pravougaonik)
                broj++;
        }
    }
}
