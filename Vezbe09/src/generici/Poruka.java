package generici;

import java.util.Random;

public class Poruka {
    private static Random rand = new Random();

    public static OpcionaVrednost<String> procitajPoruku() {
        double verovatnoca = rand.nextDouble();
        String poruka;

        if (verovatnoca > 0.5) {
            poruka = "Ovo je nasa poruka.";
        } else {
            poruka = null;
        }

        return OpcionaVrednost.odMozdaPostojece(poruka);
    }
}
