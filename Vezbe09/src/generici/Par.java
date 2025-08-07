package generici;

public class Par<T1, T2> {
    private T1 prva;
    private T2 druga;

    public Par(T1 prva, T2 druga) {
        this.prva = prva;
        this.druga = druga;
    }

    public T1 getPrva() {
        return this.prva;
    }

    public T2 getDruga() {
        return this.druga;
    }

    @Override
    public String toString() {
        return "Par{" +
                "prva=" + prva +
                ", druga=" + druga +
                '}';
    }
}
