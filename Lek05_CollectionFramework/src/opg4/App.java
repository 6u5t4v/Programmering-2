package opg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("Lek05_CollectionFramework/src/opg4/filmkarakter.txt"))) {
            int moviesAmount = scanner.nextInt();
            Map<String, Integer> timesRated = new HashMap<>();
            Map<String, Double> movieRated = new HashMap<>();

            scanner.nextLine();
            for (int i = 0; i < moviesAmount; i++) {
                String movie = scanner.nextLine();
                int review = Integer.parseInt(scanner.nextLine());

                timesRated.merge(movie, 1, Integer::sum);
                movieRated.merge(movie, (double) review, Double::sum);
            }

            for (String movie : timesRated.keySet()) {
                int times = timesRated.get(movie);
                double gennemsnit = movieRated.get(movie) / times;
                System.out.printf("%s: %d karakterer, gennemsnit %.1f\n", movie, times, gennemsnit);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
