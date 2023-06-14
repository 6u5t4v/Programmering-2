package opgave3;

import java.util.ArrayList;
import java.util.List;

public class Studerende {
    private int studieNr;
    private String navn;
    private List<Integer> karaktere = new ArrayList<>();

    public Studerende(int studieNr, String navn) {
        this.studieNr = studieNr;
        this.navn = navn;
    }

    public double gennemsnit() {
        if (karaktere.isEmpty()) return 0.0;

        double elevSnit = 0;
        for (int karakter : karaktere) {
            elevSnit += karakter;
        }

        return elevSnit / karaktere.size();
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
}
