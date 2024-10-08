package izuzeci;

/*
*   POSTO SMO REKLI DA JE Buva `Clonable`, MORAMO IMPLEMENTIRATI I `Clonable` INTERFEJS I U
*   BAZNOJ KLASI, PA KLASA ZIVOTINJA TREBA DA BUDE PROMENJENA NA SLEDECI NACIN:
*       public class Zivotinja implements Clonable {...}
* */

public class Buva extends Zivotinja implements Cloneable {
   private String ime;
   private String podvrsta;

    public Buva() {
        super();
    }

    public Buva(String ime, String podvrsta) {
        super("buva");
        this.ime = ime;
        this.podvrsta = podvrsta;
    }

    public Buva(Buva b) {
        this(b.ime, b.podvrsta);
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPodvrsta(String podvrsta) {
        this.podvrsta = podvrsta;
    }

    public String getIme() {
        return this.ime;
    }

    public String getPodvrsta() {
        return this.podvrsta;
    }

    public void zvuk() {
        System.out.println("Psst!");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Buva: " + this.ime + " " + this.podvrsta;
    }
}
