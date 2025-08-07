package generici;

public class MainOpcioni {
    public static void main(String[] args) {
        OpcionaVrednost<String> poruka = Poruka.procitajPoruku();

        if (poruka.postoji()) {
            System.out.println("Poruka postoji i ona je: " + poruka.getVrednost());
        } else {
            System.out.println("Poruka ne postoji! Zadatak je konacno gotov!");
        }
    }
}
