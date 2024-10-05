package nasledjivanje;

// sve sto ima Oblik ima i Pravougaonik
public class Pravougaonik extends Oblik{
    private Tacka A;
    private Tacka B;
    private Tacka C;
    private Tacka D;

    private double sirina;
    private double visina;

    public Pravougaonik() {
        super();
    }

    public Pravougaonik(Tacka t) {
        super(t);
    }

    public Pravougaonik(Tacka A, Tacka B, Tacka C, Tacka D) {
        this.A = new Tacka(A);
        this.B = new Tacka(B);
        this.C = new Tacka(C);
        this.D = new Tacka(D);
    }

    public Pravougaonik(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.A = new Tacka(x1, y1);
        this.B = new Tacka(x2, y2);
        this.C = new Tacka(x3, y3);
        this.D = new Tacka(x4, y4);
    }

    public Pravougaonik(double sirina, double visina) {
        this.sirina = sirina;
        this.visina = visina;
    }

    public double getSirina() {
        return this.sirina;
    }

    public double getVisina() {
        return this.visina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public Tacka getA() {
        return this.A;
    }

    public Tacka getB() {
        return this.B;
    }

    public Tacka getC() {
        return this.C;
    }

    public Tacka getD() {
        return this.D;
    }

    public void setA(Tacka a) {
        this.A = a;
    }

    public void setB(Tacka b) {
        this.B = b;
    }

    public void setC(Tacka c) {
        this.C = c;
    }

    public void setD(Tacka d) {
        this.D = d;
    }

    // iz natklase uzmi i pozovi getCentar
    @Override
    public Tacka getCentar() {
        return super.getCentar();
    }

    @Override
    public double getObim() {
        return 2.0*(this.sirina + this.visina);
    }

    @Override
    public double getPovrsina() {
        return 1.0 * this.visina * this.sirina;
    }

    @Override
    public String toString() {
        return "Pravougaonik";
    }
}
