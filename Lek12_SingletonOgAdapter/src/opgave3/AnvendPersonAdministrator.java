package opgave3;

public class AnvendPersonAdministrator {
    public static void main(String[] args) {

        Person p1 = new Person("Arne", 69);
        Person p2 = new Person("Bjarne", 420);
        Person p3 = new Person("Tjarne", 19);

        PersonAdministrator administrator = PersonAdministrator.getInstance();
        administrator.addPerson(p1);
        administrator.addPerson(p2);
        administrator.addPerson(p3);

        System.out.println(administrator.getPersoner());

        administrator.removePerson(p2);

        System.out.println(administrator.getPersoner());
    }
}
