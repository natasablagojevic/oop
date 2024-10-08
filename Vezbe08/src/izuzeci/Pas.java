package izuzeci;

public class Pas implements Cloneable{
    private Buva buva;
    private String ime;
    private String rasa;

    public Pas() {
//        super();
    }

    public Pas(Buva buva, String ime, String rasa) {
        this.ime = ime;
        this.rasa = rasa;
        this.buva = new Buva("Buvica", "Neka vrsta buvice");
    }

    public String getIme() {
        return this.ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getRasa() {
        return this.rasa;
    }

    public void setBuva(Buva buva) {
        this.buva = new Buva(buva);
    }

    @Override
    public String toString() {
        return "Pas: " + this.ime + " " + this.rasa + " " + this.buva;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
