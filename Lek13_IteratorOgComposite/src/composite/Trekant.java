package composite;

public class Trekant extends GeometriskFigur {
    private int grundLinje;
    private int højde;

    public Trekant(int grundLinje, int højde) {
        this.grundLinje = grundLinje;
        this.højde = højde;
    }

    @Override
    public double getAreal() {
        return (float) ((grundLinje * højde) / 2);
    }

    @Override
    public void tegn() {
        System.out.println("Trekant");
    }
}
