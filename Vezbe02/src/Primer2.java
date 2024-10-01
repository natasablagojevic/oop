import java.util.Arrays;
import java.util.Scanner;

public class Primer2 {

    public static Scanner sc = new Scanner(System.in);

    public static int[] ucitajNiz() {
        int []niz = new int[5];

        for (int i = 0; i < 5; i++) {
            niz[i] = sc.nextInt();
        }

        return niz;
    }

    public static void ispisi(int []niz) {
        for (int x : niz) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    public static void uvecajZaJedan(int []niz) {
        for (int i = 0; i < niz.length; i++) {
            niz[i]++;
        }
    }

    public static void main(String[] args) {
        int []niz = ucitajNiz();
        ispisi(niz);

        uvecajZaJedan(niz);
        ispisi(niz);

        System.out.println(Arrays.toString(niz));
    }
}
