import java.util.Arrays;

public class Primer3 {
    public static void main(String[] args) {
        int [][]matrica = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };


        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }

        int []tmp = matrica[0];
        matrica[0] = matrica[1];
        matrica[1] = tmp;

        System.out.println();

        for (int []vrsta : matrica) {
            for (int x : vrsta) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        String s = Arrays.deepToString(matrica);
        System.out.println(s);

    }
}
