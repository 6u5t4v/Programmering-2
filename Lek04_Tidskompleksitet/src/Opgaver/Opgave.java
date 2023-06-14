package Opgaver;

import model.Nedboer;

import java.util.Arrays;

public class Opgave {

    public static void main(String[] args) {
        int[] array = {5, 10, 5, 6, 4, 9, 8};
        System.out.println(Arrays.toString(prefixAverage(array)));

        System.out.println(Nedboer.bedsteTreFerieUger());
        System.out.println(Nedboer.bedsteFerieUgerStart(50));
        System.out.println(Nedboer.ensNedboer());
    }

    // Opgave 3
    public static double[] prefixAverage(int[] array) {
        double[] average = new double[array.length];

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            average[i] = sum / (i + 1);
        }
        return average;
    }

    // Opgave 4
    // Lavet i model pakken, nedbør

}
