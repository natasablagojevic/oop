package nasledjivanje;

public class Trougao extends Oblik{
    private Tacka A;
    private Tacka B;
    private Tacka C;

    public Trougao() {
        super();
    }

    public Trougao(Tacka A, Tacka B, Tacka C) {
        this.A = new Tacka(A);
        this.B = new Tacka(B);
        this.C = new Tacka(C);
    }

    public double getAB() {
        return this.A.distance(this.B);
    }

    public double getAC() {
        return this.A.distance(this.C);
    }

    public double getBC() {
        return this.B.distance(this.C);
    }

    private double poluObim() {
        return this.getObim() / 2.0;
    }

    @Override
    public double getObim() {
        return this.getAB() + this.getAC() + this.getBC();
    }

    @Override
    public double getPovrsina() {
        return Math.sqrt(this.poluObim()) * (this.poluObim() - this.getAB()) * (this.poluObim() - this.getAC()) * (this.poluObim() - this.getBC());
    }

    @Override
    public String toString() {
        return "Trougao";
    }
}
