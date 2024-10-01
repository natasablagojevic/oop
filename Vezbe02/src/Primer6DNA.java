import java.util.Arrays;

public class Primer6DNA {
    public static void main(String[] args) {
        String sequenceDnca = "ggcgatatgcagtagcgcttctatgccataccgtatgctacacaacgtgatgcggccacttaggggcttctgtaagcgagt";
        String dna = "    atgc          ";

        System.out.println(countChuckieInSequence(sequenceDnca, dna));

        System.out.println(sequenceDnca.substring(5, 15));

        System.out.println(sequenceDnca.startsWith(dna));
        System.out.println(sequenceDnca.endsWith(dna));

        System.out.println("[" + dna.trim() + "]");

        String s = "Danas je lep dan!";
//        String s = "Strahinja, Stanojevic, 65465465, 6574654265";

        System.out.println(Arrays.toString(s.split(" ")));

        char []chars = s.toCharArray();
        Arrays.sort(chars);

        s = String.valueOf(chars);

        System.out.println(s);
    }

    public static int countChuckieInSequence(String sequence, String dna) {
        int index = sequence.indexOf(dna);
        int counter = 0;

        while (index != -1) {
            counter++;
            index = sequence.indexOf(dna, index + dna.length());
        }

        return counter;
    }
}
