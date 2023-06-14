package opg3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>() {{
            add(15);
            add(76);
            add(10);
            add(45);
            add(75);
            add(27);
            add(58);
            add(32);
        }};

        Iterator<Integer> iterable = numbers.iterator();
        while (iterable.hasNext()) {
            System.out.println(iterable.next());
        }

        Map<Integer, Integer> map = new HashMap<>() {{
            put(2, 4);
            put(3, 9);
            put(4, 16);
            put(5, 25);
            put(6, 36);
        }};

        Iterator<Integer> iterable2 = map.keySet().iterator();
        while (iterable2.hasNext()) {
            int key = iterable2.next();
            int value = map.get(key);
            System.out.println(key + ", " + value);
        }
    }
}
