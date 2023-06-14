package opgave4;

public class SpiritusToVare extends Vare {
    private Spiritus spiritus;

    public SpiritusToVare(Spiritus spiritus) {
        super(spiritus.getPrisen(), spiritus.getBetgenelse());
        this.spiritus = spiritus;
    }

    @Override
    public double beregnMoms() {
        double moms = spiritus.hentMoms();
        return moms + getPris();
    }

    @Override
    public void setPris(int pris) {
        spiritus.setPrisen(pris);
    }

    @Override
    public int getPris() {
        return spiritus.getPrisen();
    }

    @Override
    public String getNavn() {
        return spiritus.getBetgenelse();
    }

    @Override
    public void setNavn(String navn) {
        spiritus.setBetgenelse(navn);
    }
}
