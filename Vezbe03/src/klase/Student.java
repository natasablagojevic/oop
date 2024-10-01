package klase;

public class Student {
    private String name;
    private String lastName;
    private String index;

    // konstruktor
    public Student() {

    }

    public Student(String name, String lastName, String index) {
        this.name = name;
        this.lastName = lastName;
        this.index = index;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Name: " + name + "\n");
        sb.append("Last Name: " + lastName + "\n");
        sb.append("Index: " + index + "\n");

        return sb.toString();
    }
}
