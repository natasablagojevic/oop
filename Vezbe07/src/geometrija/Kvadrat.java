package geometrija;

public class Kvadrat extends Pravougaonik{
    public Kvadrat(double a) {
        super(a, a);
    }

    public double getStranica() {
        return super.getSirina();
   }

    @Override
    public String toString() {
        return  "Kvadrat: " + getSirina();
    }
}
