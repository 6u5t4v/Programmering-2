package opgave2;

public class Counter {
    private static Counter instance;
    private int value = 0;

    private Counter() {

    }

    public void count() {
        value++;
    }

    public void times2() {
        value *= 2;
    }

    public void zero() {
        value = 0;
    }

    public int getValue() {
        return value;
    }

    public static Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }

        return instance;
    }
}
