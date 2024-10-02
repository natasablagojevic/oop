package klase;

public class Student {
    private String name;
    private String lastName;
    private String index;

    // konstruktor
    // defaultni konstruktor (prazan konstruktor)
    // objekat koji ne sadrzi nikakve konkretne podatke
    public Student() {

    }

    public Student(String name, String lastName, String index) {
        this.name = name;
        this.lastName = lastName;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIndex() {
        return index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    // definise ponasanje objekta
    public void predstaviSe() {
        System.out.println("Ja sam " + this.name + " " + this.lastName);
    }

    public String getSmer() {
        String smer = validirajSmer();

        if (smer == null)
            return "Nevalidan smer!";

        return smer;
    }

    private String validirajSmer() {
        // MNVRL mm, mn, mv, ml, mr
        // ai, af

        if (this.index.charAt(0) == 'm') {
            if (this.index.charAt(1) == 'm')
                return "Matematika";
            else if (this.index.charAt(1) == 'n')
                return "Numerika";
            else if (this.index.charAt(1) == 'v')
                return "Statistika";
            else if (this.index.charAt(1) == 'l')
                return "Profesor";
            else if (this.index.charAt(1) == 'r')
                return "Racunarstvo i informatika";
            else if (this.index.charAt(1) == 'i')
                return "Informatika";
            else
                return null;
        } else if (this.index.charAt(0) == 'a') {
            if (this.index.charAt(1) == 'i')
                return "Astroinformatika";
            else if (this.index.charAt(1) == 'f')
                return "Astrofizika";
            else
                return null;
        }

        return null;
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Name: " + name + " ");
        sb.append("Last Name: " + lastName + " ");
        sb.append("Index: " + index);

        return sb.toString();
    }
}
