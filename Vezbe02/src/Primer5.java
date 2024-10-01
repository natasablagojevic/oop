public class Primer5 {
    public static void main(String[] args) {
        String s1 = "Danas je sreda.";
        String s2 = "Danas je sreda.";

        // s3 nije konstana, ona je nastala konkatanacijom dve niske.
        // pravi se na novoj memoriji
        String s3 = "Danas";
        s3 += " je sreda.";

//        System.out.println(s1 == s2);

        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));

        int ind = s1.compareTo(s2);

        if (ind == 0)
            System.out.println("s1 == s2");
        else if (ind < 0)
            System.out.println("s1 > s2");
        else
            System.out.println("s1 < s2");

        String s = "Danas je sReDa i lEp je dAn";

        int n = s.length();
        int brojMalihSlova = 0;
        int brojVelikihSlova = 0;
        int brojCifara = 0;

        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(s.charAt(i)))
                brojVelikihSlova++;
            else if (Character.isLowerCase(s.charAt(i)))
                brojMalihSlova++;
            else if (Character.isDigit(s.charAt(i)))
                brojCifara++;
        }

        System.out.println("Broj velikih slova: " + brojVelikihSlova);
        System.out.println("Broj malih slova: " + brojMalihSlova);
        System.out.println("Broj cifara: " + brojCifara);


        String s4 = s.toLowerCase();
        System.out.println(s4);

        System.out.println(toLowerCaseOurs(s));

    }

    public static String toLowerCaseOurs(String s) {
        int n = s.length();
        char []chars = new char[n];

        for (int i = 0; i < n; i++) {
            chars[i] = Character.toLowerCase(s.charAt(i));
        }

        //        return new String(chars);
        return String.valueOf(chars); // pravi novu nisku
    }
}
