package nasledjivanje;

public abstract class Oblik {
    private Tacka centar;

    public Oblik() {
        centar = new Tacka();
    }

    public Oblik(Tacka centar) {
        this.centar = new Tacka(centar);
    }

    public Tacka getCentar() {
        return this.centar;
    }

    public void setCentar(Tacka centar) {
        this.centar = centar;
    }

    public abstract double getObim();
    public abstract double getPovrsina();

    @Override
    public String toString() {
        return "Oblik{" +
                "centar=" + centar +
                '}';
    }
}
