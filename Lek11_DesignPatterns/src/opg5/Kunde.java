package opg5;

import java.util.HashSet;
import java.util.Set;

public class Kunde {
    private String navn;
    private Set<BogTitel> bogTitelList = new HashSet<>();

    public Kunde(String navn) {
        this.navn = navn;
    }

    public void addBogTitle(BogTitel bogTitel) {
        bogTitelList.add(bogTitel);
    }

    public void removeBogTitle(BogTitel bogTitel) {
        bogTitelList.remove(bogTitel);
    }

    public String getNavn() {
        return navn;
    }

    public Set<BogTitel> getBogTitelList() {
        return new HashSet<>(bogTitelList);
    }
}
