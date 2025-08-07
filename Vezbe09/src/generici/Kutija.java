package generici;

public class Kutija<T> {
    private T predmet;
    private boolean sadrziPredmet;

    public Kutija() {
        this.sadrziPredmet = false;
    }

    public Kutija(T predmet) {
        this.predmet = predmet;
        this.sadrziPredmet = true;
    }

    public T uzmiPredmet() {
        if (!this.sadrziPredmet) {
            System.err.println("Kutija je prazna!");
            return null;
        }

        this.sadrziPredmet = false;
        return this.predmet;
    }

    public void dodajPredmet(T predmet) {
        if (this.sadrziPredmet) {
            System.err.println("Kutija vec sadrzi predmet!");
            return ;
        }

        this.predmet = predmet;
        this.sadrziPredmet = true;
    }

    @Override
    public String toString() {
        return "Kutija{" +
                "predmet=" + predmet +
                ", sadrziPredmet=" + sadrziPredmet +
                '}';
    }
}
