package opg5;

public class App {
    public static void main(String[] args) {
        Saelger hansen = new Saelger("Hansen");
        Indkoeber jensen = new Indkoeber("Jensen");

        BogTitel andersAnd = new BogTitel("Anders And", 6);
        BogTitel java = new BogTitel("Java", 8);

        Kunde laesehest1 = new Kunde("Læsehest1");
        Kunde laesehest2 = new Kunde("Læsehest2");
        Kunde laesehest3 = new Kunde("Læsehest3");

        andersAnd.addObserver(hansen);
        java.addObserver(jensen);

        andersAnd.etKoeb(laesehest1);
        andersAnd.etKoeb(laesehest2);
        andersAnd.etKoeb(laesehest3);

        java.etKoeb(laesehest1);
        java.etKoeb(laesehest2);
        java.etKoeb(laesehest3);
    }
}
