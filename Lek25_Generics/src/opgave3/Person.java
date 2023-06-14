package opgave3;

public class Person<T extends Comparable<T>> implements Comparable<Person<T>> {
    private T navn;

    public Person(T navn) {
        this.navn = navn;
    }

    public T getNavn() {
        return navn;
    }

    @Override
    public int compareTo(Person<T> o) {
        return this.navn.compareTo(o.navn);
    }

    @Override
    public String toString() {
        return String.valueOf(navn);
    }
}
