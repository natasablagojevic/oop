package nasledjivanje;

public class Kvadrat extends Pravougaonik{

    public Kvadrat() {
        super();
    }

    public Kvadrat(Tacka t) {
        super(t);
//        setA(new Tacka(t));
    }

    public Kvadrat(Tacka A, Tacka B, Tacka C, Tacka D) {
        super(A, B, C, D);
    }

    public Kvadrat(double duzina) {
        super(duzina, duzina);
    }

    @Override
    public String toString() {
        return "Kvadrat";
    }
}
