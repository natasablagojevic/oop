package stek;

import java.util.Arrays;

public class Niz implements Stek{
    private int []niz;
    private int kapacitiet;
    private int index;

    public Niz() {
        this.niz = new int[10];
        this.kapacitiet = 10;
        this.index = 0;
    }

    @Override
    public void push(int x) {
        if (this.index == this.kapacitiet) {
            this.kapacitiet += 10;
            this.niz = Arrays.copyOf(this.niz, this.kapacitiet);
        }

        this.niz[this.index] = x;
        this.index++;

    }

    @Override
    public void pop() {
        if (this.index == 0) {
            System.err.println("Prazan stek!");
            System.exit(1);
        }

        this.index--;
    }

    @Override
    public int top() {
        if (this.index == 0) {
            System.err.println("Prazan stek!");
            System.exit(1);
        }

        return this.niz[this.index - 1];
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public void show() {
        for (int i = this.index - 1; i >= 0; i--) {
            System.out.println(this.niz[i]);
        }
    }
}
