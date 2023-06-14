package opg2_2;

import opg2_1.Studerende;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Skole {
    private String navn;

    private final Set<Studerende> studerendeList = new HashSet<>();

    public Skole(String navn) {
        this.navn = navn;
    }

    public void addStuderende(Studerende studerende) {
        studerendeList.add(studerende);
    }

    public void removeStuderende(Studerende studerende) {
        studerendeList.remove(studerende.getStudieNr());
    }

    public double gennemsnit() {
        double skoleSnit = 0;

        for (Studerende studerende : studerendeList) {
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
        Studerende found = null;
        Iterator<Studerende> studerendeIterator = studerendeList.iterator();

        while (found == null && studerendeIterator.hasNext()) {
            Studerende studerende = studerendeIterator.next();
            if (studerende.getStudieNr() == studieNr) found = studerende;
        }

        return found;
    }

    public String getNavn() {
        return navn;
    }

    public Set<Studerende> getStuderendeList() {
        return new HashSet<>(studerendeList);
    }

    @Override
    public String toString() {
        return navn + ", " + studerendeList;
    }
}
