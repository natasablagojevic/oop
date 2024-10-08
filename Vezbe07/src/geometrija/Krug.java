package geometrija;

import java.awt.*;

public class Krug extends Oblik implements Povrsina, Obim{
    private double r;

    public Krug(Tacka centar, double r) {
        super(centar);
        this.r = r;
    }

    public Krug(double r) {
        super(new Tacka());
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    @Override
    public String toString() {
        return "Krug: " + this.r;
    }

    @Override
    public double getObim() {
        return 2 * Math.PI * this.r;
    }

    @Override
    public double getPovrsina() {
        return Math.PI * this.r * this.r;
    }
}
