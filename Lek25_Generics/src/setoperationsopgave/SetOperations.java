package setoperationsopgave;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
        Set<T> unionSet = new HashSet<>(s1);
        unionSet.addAll(s2);
        return unionSet;
    }

    public static <T> Set<T> differens(Set<T> s1, Set<T> s2) {
        Set<T> differensSet = new HashSet<>(s1);
        differensSet.removeAll(s2);
        return differensSet;
    }

    public static <T> Set<T> intesection(Set<T> s1, Set<T> s2) {
        Set<T> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);

        return intersection;
    }
}
