package poredjenje;

import generici.Tacka;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Tacka> l = new LinkedList<>();  // DVOSTRUKO POVEZANA LISTA KOJA JE PRAZNA

        l.add(new Tacka(2, 4));
        l.add(new Tacka(3, 5));
        l.add(new Tacka(4, 6));
        l.add(new Tacka(5, 7));

        System.out.println(l);

        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        System.out.println();

        l.getFirst();
        l.getLast();
        l.push(new Tacka(2, 4));

        l.remove(1);

        // iteratori:
        Iterator<Tacka> it = l.iterator();

        while (it.hasNext()) {
            Tacka t = it.next(); // vrati trenutni i pomeri iterator

            System.out.println(t);
        }

        // blok memorije
        ArrayList<Tacka> l1 = new ArrayList<>(); // ista kao LinkedList samo sto je efikasnija

        List<Tacka> l2 = new ArrayList<>(); // ovo predstavlja interfejs, ima manje metoda od ovih prethodnih
        // to je zbog toga sto je to apstarakcija njih
    }
}
