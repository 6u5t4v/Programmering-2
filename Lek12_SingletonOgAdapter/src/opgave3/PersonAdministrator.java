package opgave3;

import java.util.HashSet;
import java.util.Set;

public class PersonAdministrator {
    private static PersonAdministrator instance;

    public static PersonAdministrator getInstance() {
        if (instance == null) {
            instance = new PersonAdministrator();
        }
        return instance;
    }

    private Set<Person> personer = new HashSet<>();

    private PersonAdministrator() {
    }

    public void addPerson(Person person) {
        personer.add(person);
    }

    public Set<Person> getPersoner() {
        return new HashSet<>(personer);
    }

    public void removePerson(Person person) {
        personer.remove(person);
    }
}
