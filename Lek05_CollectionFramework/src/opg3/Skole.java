package opg3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Skole {
    private String navn;

    private final List<Studerende> studerendeList = new ArrayList<>();

    public Skole(String navn) {
        this.navn = navn;
    }

    public void addStuderende(Studerende studerende) {
        if (!studerendeList.contains(studerende)) {
            studerendeList.add(studerende);
        }
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

    public List<Studerende> getStuderendeList() {
        return new ArrayList<>(studerendeList);
    }

    @Override
    public String toString() {
        return navn + ", " + studerendeList;
    }
}
