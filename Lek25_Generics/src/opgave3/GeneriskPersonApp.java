package opgave3;

import java.util.ArrayList;
import java.util.Collections;

public class GeneriskPersonApp {
    public static void main(String[] args) {
        Person<String> personStr = new Person<>("Hans");
        Person<Navn> personNavn = new Person<>(new Navn("Hans", "Hansen"));

        System.out.println(personStr.getNavn());
        System.out.println(personNavn.getNavn().getForNavn());

        ArrayList<Person<Navn>> list = new ArrayList<>();
        list.add(new Person<>(new Navn("Hans", "Hansen")));
        list.add(new Person<>(new Navn("Jens", "Jensen")));
        list.add(new Person<>(new Navn("Peter", "Petersen")));
        list.add(new Person<>(new Navn("Bent", "Bentsen")));
        list.add(new Person<>(new Navn("Jørgen", "Jørgensen")));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
