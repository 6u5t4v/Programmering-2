package opg1til4;

import fletning.FletteSorteringHul;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() {{
            add(0);
            add(10);
            add(7);
            add(5);
            add(3);
            add(0);
            add(9);
            add(0);
            add(3);
            add(6);
        }};

        System.out.println("Sum: " + sum(list));
        System.out.println("Count Zeros: " + countZeros(list));

        ArrayList<Integer> array = new ArrayList<>() {{
            add(56);
            add(45);
            add(34);
            add(15);
            add(12);
            add(34);
            add(44);
        }};

        FletteSorteringHul.fletteSort(array);
        System.out.println(array);
    }

    // OPGAVE 1
    public static int sum(List<Integer> list) {
        return sum(list, 0, list.size() - 1);
    }

    private static int sum(List<Integer> list, int left, int right) {
        if (left == right) {
            return list.get(left);
        } else {
            int m = (left + right) / 2;
            int sum1 = sum(list, left, m);
            int sum2 = sum(list, m + 1, right);

            return sum1 + sum2;
        }
    }

    // OPGAVE 2
    public static int countZeros(List<Integer> list) {
        return countZeros(list, 0, list.size() - 1);
    }

    private static int countZeros(List<Integer> list, int left, int right) {
        int result = 0;

        if (left == right) {
            if (list.get(left) == 0) {
                result++;
            }
            return result;
        } else {
            int middle = (left + right) / 2;

            int zeroesLeft = countZeros(list, left, middle);
            int zeroesRight = countZeros(list, middle + 1, right);

            result = zeroesRight + zeroesLeft;
        }

        return result;
    }


}