package composite;

import java.util.ArrayList;
import java.util.List;

public class SammensatFigure extends GeometriskFigur {
    private List<GeometriskFigur> figure = new ArrayList<>();

    @Override
    public double getAreal() {
        double areal = 0;
        for (GeometriskFigur figur : figure) {
            areal += figur.getAreal();
        }
        return areal;
    }

    @Override
    public void tegn() {
        for (GeometriskFigur figur : figure) {
            figur.tegn();
        }
    }

    @Override
    public void addFigur(GeometriskFigur figur) {
        figure.add(figur);
    }

    @Override
    public void removeFigur(GeometriskFigur figur) {
        figure.remove(figur);
    }

    @Override
    public GeometriskFigur getChild(int index) {
        return figure.get(index);
    }
}
