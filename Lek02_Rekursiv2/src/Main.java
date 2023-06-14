import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(9);
        list.add(6);

        System.out.println("opgave 1: " + ligeTal(list));
        System.out.println("opgave 1.2: " + ligeTal2(list));
        System.out.println("opgave 1.2: " + ligeTal2(list));

        System.out.println("opgave 2: " + palindrom("racecar"));

        int[] array = {5, 7, 8, 10, 45, 67, 69};

        System.out.println("opgave 3: " + talIArray(array, 66));
        System.out.println("opgave 4: " + ackermannFunktion(1, 3));
        System.out.println("opgave 5: binomial");
        binomial();

        System.out.println("opgave 7.1: ");
        System.out.println("tal_3: " + talN(3));
        System.out.println("tal_4: " + talN(4));
        System.out.println("tal_5: " + talN(5));
        System.out.println("tal_6: " + talN(6));
    }

    public static int ligeTal(ArrayList<Integer> list) {
        return ligeTal(list, 0);
    }

    private static int ligeTal(ArrayList<Integer> list, int index) {
        if (index == list.size()) {
            return 0;
        } else {
            if (list.get(index) % 2 == 0) {
                return 1 + ligeTal(list, index + 1);
            } else {
                return ligeTal(list, index + 1);
            }
        }
    }


    public static int ligeTal2(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>(list);

        int result;
        if (list.size() == 0) {
            result = 0;
        } else {
            result = list.get(0);
            list1.remove(0);
            if (result % 2 == 0) {
                result = 1 + ligeTal2(list1);
            } else {
                result = ligeTal2(list1);
            }
        }

        return result;
    }

    public static boolean palindrom(String tekst) {
        return palindrom(tekst, 0, tekst.length() - 1);
    }

    private static boolean palindrom(String tekst, int left, int right) {
        if (left > right) {
            return true;
        }

        if (tekst.charAt(left) == tekst.charAt(right)) {
            return palindrom(tekst, left + 1, right - 1);
        }

        return false;
    }

    public static boolean talIArray(int[] array, int target) {
        return talIArray(array, target, 0, array.length - 1);
    }

    private static boolean talIArray(int[] array, int target, int left, int right) {
        if (left > right) return false;
        int middle = (left + right) / 2;

        int k = array[middle];
        if (k == target) {
            return true;
        } else if (k > target) {
            return talIArray(array, target, left, middle - 1);
        } else {
            return talIArray(array, target, middle + 1, right);
        }
    }

    private static int ackermannFunktion(int x, int y) {
        if (x == 0) {
            return y + 1;
        }

        if (y == 0) {
            return ackermannFunktion(x - 1, 1);
        } else {
            return ackermannFunktion(x - 1, ackermannFunktion(x, y - 1));
        }
    }

    public static void binomial() {
        int size = 8;

        int length = 0;
        System.out.print("  m ");
        length += 1;
        for (int m = 0; m < size; m++) {
            System.out.printf("%-8s", m);
            length += 8;
        }

        System.out.println();
        System.out.print("n ");
        System.out.println("-".repeat(length));

        for (int n = 0; n < size; n++) {
            System.out.print(n + " | ");
            for (int m = 0; m < size; m++) {
                int result = binomial(n, m);
                if (result == 0) {
                    System.out.print("");
                } else {
                    System.out.printf("%-8s", result);
                }
            }
            System.out.println();
        }
    }

    private static int binomial(int n, int m) {
        if (m == 0 || m == n) {
            return 1;
        }

        if (m > 0 && m < n) {
            return binomial(n - 1, m) + binomial(n - 1, m - 1);
        }

        return 0;
    }

    private static int talN(int n) {
        if (n == 0) return 2;
        if (n == 1) return 1;
        if (n == 2) return 5;

        if (n > 2) {
            if (n % 2 == 0) {
                return 2 * talN(n - 3) - talN(n - 1);
            } else {
                return talN(n - 1) + talN(n - 2) + (3 * talN(n - 3));
            }
        }

        return -1;
    }
}