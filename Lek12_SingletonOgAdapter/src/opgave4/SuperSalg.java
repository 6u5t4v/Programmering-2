package opgave4;

import java.util.ArrayList;
import java.util.List;

public class SuperSalg {
    private static SuperSalg instance;

    private List<Vare> varer = new ArrayList<>();

    public static SuperSalg getInstance() {
        if (instance == null) {
            instance = new SuperSalg();
        }
        return instance;
    }

    private SuperSalg() {
    }

    public void addVare(Vare vare) {
        if (!varer.contains(vare)) {
            varer.add(vare);
        }
    }

    public List<Vare> getVarer() {
        return new ArrayList<>(varer);
    }
}
