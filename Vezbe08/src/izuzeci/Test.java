package izuzeci;

public class Test {
    public static void main(String[] args) {
        int x = 10;

        try {
            int y = x / 0;

            System.out.println("Nece da se desi....");
        } catch (ArithmeticException e) {
            System.err.println("Doslo je do greske.");
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace(); // najcesce ponasanje koje nam govori kako je doslo do izuzetka
        }

        // nastavljam sa daljim izvrsavanjem programa
        System.out.println("Ovde sam...");

    }
}
