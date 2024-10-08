package izuzeci;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pas mojLjubimac = new Pas("Cupko", "mesanac");

        // KAD SMO KLONIRALI PSA, IZVRSILI SMO KLONIRANJE
        Pas vasLjubimac = (Pas) mojLjubimac.clone();

        vasLjubimac.setIme("Pluton");

        Buva vasaBuva = (Buva) vasLjubimac.getBuva().clone();
        vasaBuva.setIme("Nova Buvica");
        vasLjubimac.setBuva(vasaBuva);


        System.out.println(mojLjubimac);
        System.out.println(vasLjubimac);

    }
}
