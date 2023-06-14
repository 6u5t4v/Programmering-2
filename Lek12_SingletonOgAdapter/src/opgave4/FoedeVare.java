package opgave4;

public class FoedeVare extends Vare {
    private static double MOMS = 0.5;

    public FoedeVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        return (1 + MOMS * getPris());
    }
}
