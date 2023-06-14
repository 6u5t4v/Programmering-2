package personcollection;

import java.util.Iterator;

public class PersonApp {
    public static void main(String[] args) {
        PersonCollection personer = new PersonCollection(16);

        Person p1 = new Person("Gostav");
        Person p2 = new Person("Arne");
        Person p3 = new Person("Bjarne");

        personer.add(p1);
        personer.add(p1);
        personer.add(p2);
        personer.add(p2);
        personer.add(p3);
        personer.add(p3);

        Person p4 = new Person("Tjarne");

        personer.add(3, p4);

        Iterator<Person> personIterable = personer.iterator();
        while (personIterable.hasNext()) {
            Person person = personIterable.next();
            System.out.println(person);
        }
    }
}
