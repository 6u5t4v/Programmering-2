package opgave5;

public class App {
    public static void main(String[] args) {
        ObservableBag observableBag = new ObservableBag();

        observableBag.addString("tomat");
        observableBag.addString("tomat");
        observableBag.addString("tomat");
        observableBag.addString("banan");
        observableBag.addString("banan");
        observableBag.addString("banan");

        for (String s : observableBag) {
            System.out.println(s + " " + observableBag.getCount(s));
        }
    }
}
