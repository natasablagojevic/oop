package jezici;

public class Covek implements Engleski, Srpski{
    private String ime;
    private String prezime;
    private int godine;

    public Covek(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    @Override
    public void hello() {
        System.out.println("Hello!");
    }

    @Override
    public void goodbye() {
        System.out.println("Goodbye!");
    }

    @Override
    public void thanks() {
        System.out.println("Thanks!");
    }

    @Override
    public String toString() {
        return this.ime + " " + this.prezime + " godina: " + this.godine;
    }

    @Override
    public void zdravo() {
        System.out.println("Zdravo!");
    }

    @Override
    public void dovidjenja() {
        System.out.println("Dovidjenja!");
    }

    @Override
    public void hvala() {
        System.out.println("Hvala!");
    }
}
