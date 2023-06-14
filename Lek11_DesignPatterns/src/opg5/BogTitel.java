package opg5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BogTitel implements Subject {
    private Set<Observer> observere = new HashSet<>();
    private List<Kunde> kunder = new ArrayList<>();

    private String titel;
    private int antal;

    public BogTitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
    }

    public void indkoebTilLager(int antal) {
        this.antal += antal;
    }

    public void etKoeb(Kunde k) {
        if (antal > 0) {
            antal--;
            k.addBogTitle(this);
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (Observer o : observere) {
            o.update(this);
        }
    }

    public void addKunde(Kunde k) {
        if(!kunder.contains(k)){
            kunder.add(k);
            k.addBogTitle(this);
        }
    }

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }

    public List<Kunde> getKunder() {
        return new ArrayList<>(kunder);
    }

    public Set<Observer> getObservere() {
        return new HashSet<>(observere);
    }

    @Override
    public void addObserver(Observer o) {
        observere.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observere.remove(o);
    }
}
