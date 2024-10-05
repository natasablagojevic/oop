package nasledjivanje;

public class Tacka {
    private double x;
    private double y;

    private static int brojTacaka;

    public Tacka() {
        this.x = 0.0;
        this.y = 0.0;
        brojTacaka++;
    }

    public Tacka(double x, double y) {
        this.x = x;
        this.y = y;
        brojTacaka++;
    }

    public Tacka(Tacka t) {
//        this.x = t.x;
//        this.y = t.y;
        this(t.x, t.y);
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public static int getBrojTacaka() {
        return brojTacaka;
    }

    void translacija(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public static double distance(Tacka t1, Tacka t2) {
        return Math.sqrt(Math.pow(t1.x - t2.x, 2) + Math.pow(t1.y - t2.y, 2));
    }

    public double distance(Tacka other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
