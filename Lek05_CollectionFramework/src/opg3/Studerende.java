package opg3;

import java.util.ArrayList;
import java.util.List;

public class Studerende implements Comparable<Studerende> {
    private final int studieNr;
    private String navn;
    private final List<Integer> karaktere = new ArrayList<>();

    public Studerende(int studieNr, String navn) {
        this.studieNr = studieNr;
        this.navn = navn;
    }

    public void addKarakter(int karakter) {
        karaktere.add(karakter);
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public List<Integer> getKaraktere() {
        return new ArrayList<>(karaktere);
    }

    @Override
    public String toString() {
        return studieNr + " " + navn + " " + karaktere;
    }

    @Override
    public int compareTo(Studerende o) {
        if (studieNr == o.getStudieNr()) {
            return 0;
        } else if (studieNr < o.getStudieNr()) {
            return 1;
        } else {
            return -1;
        }
    }
}
