package opgave3;

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
        int karaktereTalt = 0;
        int sum = 0;

        for (Studerende studerende : studerendeList) {
            List<Integer> karaktere = studerende.getKaraktere();

            for (int karakter : karaktere) {
                sum += karakter;
                karaktereTalt++;
            }

        }

        return (double) sum / karaktereTalt;
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

    @Override
    public String toString() {
        return navn + ", " + studerendeList;
    }
}
