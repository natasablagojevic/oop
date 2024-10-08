package stek;

public interface Stek {
    void push(int x);    // dodaje samo na vrh steka
    void pop();     // skida element sa vrha steka
    int top();      // skida element sa vrha steka i vraca njegovu vrednost
    int size();
    void show();
}
