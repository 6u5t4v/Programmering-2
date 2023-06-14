package opgave5;

import java.util.HashMap;
import java.util.Map;

public class Bag implements IBag {
    private Map<String, Integer> indhold = new HashMap<>();

    @Override
    public void add(String s) {
//        int amount = 1;
//        if (indhold.containsKey(s)) {
//            amount = indhold.get(s);
//            amount++;
//        }
//        indhold.put(s, amount);

        indhold.merge(s, 1, Integer::sum);
    }

    @Override
    public void remove(String s) {
        if (indhold.containsKey(s)) {
            int amount = indhold.get(s);
            amount--;
            if (amount < 1) {
                indhold.remove(s);
            } else {
                indhold.put(s, amount);
            }
        }
    }

    @Override
    public int getCount(String s) {
        return indhold.getOrDefault(s, 0);
    }
}
