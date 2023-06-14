
public class Main {
    public static void main(String[] args) {
        Dyr[] dyr = new Dyr[3];
        dyr[0] = new Dyr();
        dyr[1] = new Hund();
        dyr[2] = new Kat();

        for (Dyr d : dyr) {
            d.sigNoget();
        }
    }
}