package telenchenkosergey.homework.homework3.pair;

public class Pair {
    private int a, b;

    public int max() {
        return Math.max(getA(), getB());
    }

    public int sum() {
        return getA() + getB();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
