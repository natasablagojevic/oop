package nasledjivanje;

public class Tacka {
    private double x;
    private double y;

    public static int brojTacaka;

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

    public static int getBrojTacaka() {
        return brojTacaka;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
