package opgave4;

public class ElVare extends Vare {
    private static double MOMS = 0.3, MIN_PRIS = 3;

    public ElVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        if (getPris() >= MIN_PRIS) {
            return (1 + MOMS) * getPris();
        }

        return MIN_PRIS +getPris();
    }
}
