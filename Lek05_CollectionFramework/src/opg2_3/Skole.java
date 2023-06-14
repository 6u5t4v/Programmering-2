package opg2_3;

import opg2_1.Studerende;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Skole {
    private String navn;

    private final Map<Integer, Studerende> studerendeList = new HashMap<>();

    public Skole(String navn) {
        this.navn = navn;
    }

    public void addStuderende(Studerende studerende) {
        studerendeList.put(studerende.getStudieNr(), studerende);
    }

    public void removeStuderende(Studerende studerende) {
        studerendeList.remove(studerende.getStudieNr());
    }

    public double gennemsnit() {
        double skoleSnit = 0;

        for (Studerende studerende : studerendeList.values()) {
            List<Integer> karaktere = studerende.getKaraktere();
            if (karaktere.isEmpty()) continue;

            double elevSnit = 0;
            for (int karakter : karaktere) {
                elevSnit += karakter;
            }

            skoleSnit += (elevSnit / karaktere.size());
        }

        return skoleSnit / studerendeList.size();
    }

    public Studerende findStuderende(int studieNr) {
        return studerendeList.get(studieNr);
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return navn + ", " + studerendeList;
    }
}
