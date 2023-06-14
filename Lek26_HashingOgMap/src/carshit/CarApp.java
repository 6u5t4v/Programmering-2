package carshit;

import java.util.HashSet;
import java.util.Set;

public class CarApp {
    public static void main(String[] args) {
        Bil b1 = new Bil("AB12345", "Ford", "Focus", "Rød");
        Bil b2 = new Bil("AC12354", "BMw", "320", "Sort");
        Bil b3 = new Bil("AD12345", "Audi", "A4", "Grøn");
        Bil b4 = new Bil("AD12345", "Audi", "A4", "Grøn");

        Set<Bil> biler = new HashSet<>();
        biler.add(b1);
        biler.add(b2);
        biler.add(b3);
        biler.add(b4);

        System.out.println(biler.size());
    }
}
