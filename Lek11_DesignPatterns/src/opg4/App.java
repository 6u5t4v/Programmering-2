package opg4;

public class App {
    public static void main(String[] args) {
        Kunde k1 = new Kunde("Barne", 123456789, new CompareKundeNavn());
        Kunde k2 = new Kunde("Arne", 1323456789, new CompareKundeNummer());

        System.out.println(k1.compareTo(k2));
        System.out.println(k2.compareTo(k1));
    }
}
