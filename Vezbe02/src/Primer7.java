public class Primer7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        sb.append("Danas").append(" je lep").append(" dan");

        System.out.println(sb.indexOf("je"));

        sb.insert(3, 'P');
        System.out.println(sb);

        sb.deleteCharAt(3);
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb);

        String s = "anavolimilovana";
        StringBuilder sb2 = new StringBuilder(s).reverse();
        System.out.println(sb2.toString().equalsIgnoreCase(s));

    }
}
