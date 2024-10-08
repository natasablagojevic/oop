package geometrija;

public abstract class Oblik {
    private Tacka centar;

    public Oblik(Tacka centar) {
        this.centar = new Tacka(centar);
    }

    public Tacka getCentar() {
        return this.centar;
    }
}
