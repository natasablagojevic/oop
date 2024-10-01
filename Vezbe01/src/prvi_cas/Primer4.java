package prvi_cas;

import java.util.Scanner;

public class Primer4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println("Ucitan broj je: " + x);

        String s = sc.next();
        System.out.println(s);

        double d = sc.nextDouble();
        System.out.println(d);

        float f = sc.nextFloat();
        System.out.println(f);

        char c = sc.next().charAt(0);
        System.out.println(c);
    }
}
