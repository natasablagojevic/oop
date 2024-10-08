package geometrija;

public class Duz extends Oblik{
    private Tacka a;
    private Tacka b;

    public Duz() {
        super(new Tacka());
    }

    public Duz(Tacka a, Tacka b) {
        super(new Tacka((a.getX() + b.getX()) / 2, (a.getY() + b.getY()) / 2));
        this.a = new Tacka(a);
        this.b = new Tacka(b);
    }

    public Tacka getA() {
        return this.a;
    }

    public Tacka getB() {
        return this.b;
    }
}
