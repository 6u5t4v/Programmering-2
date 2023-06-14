public class Main {
    public static void main(String[] args) {
        System.out.println("1234");
//        int out = factorial(1234);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Den rekursive fak " + i + "  er  " + factorial(i));
        }

        System.out.println("power 4^5: " + power(4, 5));
        System.out.println("power2 4^5: " + power2(4, 5));

        System.out.println("produkt(19, 3): " + product(19, 3));
        System.out.println("produktRus(19, 3): " + productRus(19, 3));

        System.out.println("reverse(\"RANSLIRPA\")): " + reverse("RANSLIRPA"));

        System.out.println("sfd(816, 2260): " + sfd(816, 2260));
    }

    public static int factorial(int n) {
        int result;
        if (n == 0) {
            result = 1;
        } else {
            result = n * factorial(n - 1);
        }
        return result;
    }

    public static int power(int n, int p) {
        int result;

        if (p == 0) {
            result = 1;
        } else {
            result = power(n, p - 1) * n;
        }
        return result;
    }

    public static int power2(int n, int p) {
        int result;

        if (p == 0) {
            result = 1;
        } else {
            if (p % 2 == 0) {
                result = power2((n * n), p / 2);
            } else {
                result = power2(n, p - 1) * n;
            }
        }

        return result;
    }

    public static int product(int a, int b) {
        int result = 0;

        // Det her skal faktisk være "a >= 1", men der står det skal være "a > 1" i rekurrensregel
        if (a > 1) {
            result = product(a - 1, b) + b;
        }

        return result;
    }

    public static int productRus(int a, int b) {
        int result = 0;

        if (a >= 1) {
            if (a % 2 == 0) {
                result = productRus(a / 2, b + b);
            } else {
                result = productRus(a - 1, b) + b;
            }
        }

        return result;
    }

    public static String reverse(String s) {
        if (s.length() == 1) {
            return s;
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static int sfd(int a, int b) {
        int result;

        if (b <= a && a % b == 0) {
            return b;
        }

        if (a < b) {
            result = sfd(b, a);
        } else {
            result = sfd(b, a % b);
        }

        return result;
    }
}