package geometrija;

public class Pravougaonik extends Oblik implements Povrsina, Obim{
    private double sirina;
    private double visina;

    public Pravougaonik(Tacka centar) {
        super(centar);
        this.visina = 5;
        this.sirina = 10;
    }

    public Pravougaonik() {
        super(new Tacka());
        this.sirina = 10;
        this.visina = 5;
    }

    public Pravougaonik(double visina, double sirina) {
        super(new Tacka());
        this.visina = visina;
        this.sirina = sirina;
    }

    public double getSirina() {
        return this.sirina;
    }

    public double getVisina() {
        return this.visina;
    }

    @Override
    public String toString() {
        return "Pravougaonik:" + this.sirina + " " + this.visina;
    }

    @Override
    public double getObim() {
        return 2 * this.visina + 2 * this.sirina;
    }

    @Override
    public double getPovrsina() {
        return this.visina * this.sirina;
    }
}
