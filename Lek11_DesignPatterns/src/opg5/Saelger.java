package opg5;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Saelger implements Observer {
    private String navn;

    public Saelger(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subject s) {
        BogTitel bogTitel = (BogTitel) s;

        List<Kunde> kunder = bogTitel.getKunder();
        Set<BogTitel> anbefaledBoeger = new HashSet<>();

        for (Kunde k : kunder) {
            if (k.getBogTitelList().contains(bogTitel)) {
                Set<BogTitel> bogTitelSet = k.getBogTitelList();
                anbefaledBoeger.addAll(bogTitelSet);
            }
        }

        anbefaledBoeger.remove(bogTitel);

        System.out.println("Tjek disse bøger ud");
        for (BogTitel bt : anbefaledBoeger) {
            System.out.println(bt.getTitel());
        }
    }
}
