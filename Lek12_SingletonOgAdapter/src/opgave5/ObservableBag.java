package opgave5;

import java.util.*;

public class ObservableBag implements Bag, Iterable<String> {
    private Map<String, Integer> indhold = new HashMap<>();

    private Set<Observer> observere = new HashSet<>();

    public ObservableBag() {
    }

    private void notifyObservers(String item, int antal) {
        for (Observer o : observere) {
            o.update(item, antal);
        }
    }

    @Override
    public void addString(String s) {
        int amount = indhold.merge(s, 1, Integer::sum);

        notifyObservers(s, amount);
    }

    @Override
    public void removeString(String s) {
        if (indhold.containsKey(s)) {
            int amount = indhold.get(s);
            amount--;
            if (amount < 1) {
                indhold.remove(s);
            } else {
                indhold.put(s, amount);
            }

            notifyObservers(s, amount);
        }
    }

    @Override
    public int getCount(String s) {
        return indhold.getOrDefault(s, 0);
    }

    @Override
    public void registerObserver(Observer o) {
        observere.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observere.remove(o);
    }

    @Override
    public Iterator<String> iterator() {


        return indhold.keySet().iterator();
    }
}
