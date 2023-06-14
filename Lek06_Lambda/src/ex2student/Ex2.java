package ex2student;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.addAll(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)));
        System.out.println(runners);
        System.out.println();

        System.out.println("Opgave a");
        runners.forEach(r -> System.out.println(r.getName() + " " + r.getLapTime()));

        System.out.println();
        System.out.println("Opgave b");
        runners.forEach(r -> {
            if (r.getLapTime() < 30) {
                System.out.println(r.getName() + " " + r.getLapTime());
            }
        });

        System.out.println();
        System.out.println("Opgave c");
        runners.sort((r1, r2) -> r1.getLapTime() - r2.getLapTime());
        runners.forEach(r -> System.out.println(r.getName() + " " + r.getLapTime()));
    }
}