package opg1;

import java.util.HashSet;
import java.util.Set;

public class AnvenMetoderPaaHashSet {

    public static void main(String[] args) {


        Set<Integer> tal = new HashSet<>();
        //34,12,23,45,67,34,98
        tal.add(34);
        tal.add(12);
        tal.add(23);
        tal.add(45);
        tal.add(67);
        tal.add(34);
        tal.add(98);

        System.out.println(tal);
        tal.add(23);
        System.out.println(tal);

        tal.remove(67);

        System.out.println(tal);

        System.out.println(tal.contains(23));
        System.out.println(tal.size());


    }


}
