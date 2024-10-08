package stek;

import java.util.Scanner;

public class Main {

    static void prikaziOpcije() {
        System.out.println("0: PUSH");
        System.out.println("1: POP");
        System.out.println("2: TOP");
        System.out.println("3: SIZE");
        System.out.println("4: EXIT");
    }

    public static void main(String[] args) {
        Stek stek = new Niz();
        Scanner sc = new Scanner(System.in);

        prikaziOpcije();
        int x = sc.nextInt();
        Operacija opcija = Operacija.values()[x];

        while (opcija != Operacija.EXIT_OPERACIJA) {
            if (opcija == Operacija.PUSH_OPERACIJA) {
                System.out.println("Unesite vrednost:");
                int y = sc.nextInt();
                stek.push(y);
            } else if (opcija == Operacija.POP_OPERACIJA) {
                stek.pop();
            } else if (opcija == Operacija.TOP_OPERACIJA) {
                System.out.println("Element na vrhu steka: " + stek.top());
            } else if (opcija == Operacija.SIZE_OPERACIJA) {
                System.out.println("Broj elemenata u steku: " + stek.size());
            }

            prikaziOpcije();
            x = sc.nextInt();
            opcija = Operacija.values()[x];
        }


    }
}
