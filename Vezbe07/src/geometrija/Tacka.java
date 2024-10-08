package geometrija;

public class Tacka {
    private double x;
    private double y;

    public Tacka() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Tacka(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Tacka(Tacka t) {
        this(t.x, t.y);
    }

    public double getY() {
        return this.y;
    }

    public double getX() {
        return this.x;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
