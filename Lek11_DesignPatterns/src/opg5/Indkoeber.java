package opg5;

public class Indkoeber implements Observer {
    private String navn;

    public Indkoeber(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public void update(Subject s) {
        BogTitel bogTitel = (BogTitel) s;
        if (bogTitel.getAntal() < 6) {
            System.out.println("Bestil 10 mere bøger: " + bogTitel.getTitel());
            System.out.println("10 bøger er bestilt");
            bogTitel.indkoebTilLager(10);
        }
    }
}
