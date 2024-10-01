package prvi_cas;

public class Primer3 {
    static int saberi(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int x = 6;
        int y = 5;

        int zbir = saberi(x, y);

        System.out.println(zbir);
        System.out.println(saberi(x, y));
        System.out.printf("%d + %d = %d\n", x, y, zbir);
    }
}
