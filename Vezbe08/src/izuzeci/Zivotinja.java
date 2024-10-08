package izuzeci;

public class Zivotinja implements Cloneable {
    private String vrsta;

    public Zivotinja() {

    }

    public Zivotinja(String vrsita) {
        this.vrsta = vrsta;
    }

    public void zvuk() {

    }

    @Override
    public String toString() {
        return "Zivotinja: " + this.vrsta;
    }
}
