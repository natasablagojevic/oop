package generici;

import java.util.NoSuchElementException;
import java.util.Objects;

public class OpcionaVrednost <T>{
    private T vrednost;

    // MORA DA SE INSTANCIRA ZA RAZLICITE TIPOVE
    private static final OpcionaVrednost<?> PRAZNO = new OpcionaVrednost<>();

    private OpcionaVrednost (T vrednost) {
        Objects.requireNonNull(vrednost, "Ne smete da prosledite null ovoj metodi!"); // BILO STA STO NASLEDJUJE KLASU OBJEKAT.
        this.vrednost = vrednost;
    }

    private OpcionaVrednost () {

    }

    public static <T> OpcionaVrednost<T> od(T vrednost) {
        return new OpcionaVrednost<>(vrednost);
    }

    public static <T> OpcionaVrednost<T> prazna() {
        return (OpcionaVrednost<T>) PRAZNO;
    }

    public static <T> OpcionaVrednost<T> odMozdaPostojece(T vrednost) {
        if (vrednost == null) {
            return prazna();
        }

        return od(vrednost);
    }

    public boolean postoji() {
        return this.vrednost != null;
    }

    public T getVrednost() {
        if (this.vrednost == null) {
            throw new NoSuchElementException("Ne moze ovo ovako!");
        }

        return this.vrednost;
    }


}
