package composite;

public abstract class GeometriskFigur {
    public abstract double getAreal();

    public abstract void tegn();

    public void addFigur(GeometriskFigur figur) {
        throw new UnsupportedOperationException();
    }

    public void removeFigur(GeometriskFigur figur) {
        throw new UnsupportedOperationException();
    }

    public GeometriskFigur getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
