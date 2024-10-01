import java.util.Scanner;

public class Primer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // niz duzine n

        int[] niz = new int[n];

        System.out.println("Unesite " + n + " brojeva:");
        for (int i = 0; i < n; i++) {
            niz[i] = sc.nextInt();
        }

        for (int x : niz)
            System.out.print(x + " ");
        System.out.println();
    }
}
