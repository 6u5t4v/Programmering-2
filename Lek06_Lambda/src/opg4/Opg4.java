package opg4;

import java.util.ArrayList;
import java.util.List;

public class Opg4 {
    public static void main(String[] args) {
        List<String> navne = new ArrayList<>() {
            {
                add("Jan Jensen");
                add("Jens Hansen");
                add("Leo Hansen");
                add("Jens Jensen");
                add("Jensine Larsen");
                add("Jens");
            }
        };
        int delStrenge = countDelStreng(navne, "Jens");
        System.out.println(delStrenge);

        delStrenge = countDelStrengDelOgLoes(navne, "Jens");
        System.out.println(delStrenge);
    }

    public static int countDelStreng(List<String> list, String sub) {
        int count = 0;

        for (String str : list) {
            String[] split = str.split(" ");

            for (String subStr : split) {
                int jensIndex = subStr.indexOf(sub);

                if (jensIndex != -1) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int countDelStrengDelOgLoes(List<String> list, String sub) {
        return countDelStrengDelOgLoes(list, sub, 0, list.size() - 1);
    }

    private static int countDelStrengDelOgLoes(List<String> list, String sub, int h, int l) {
        if (h == l) {
            return countSubStrenge(list.get(l), sub);
        }

        int m = (l + h) / 2;
        int count1 = countDelStrengDelOgLoes(list, sub, l, m);
        int count2 = countDelStrengDelOgLoes(list, sub, m + 1, h);
        return count1 + count2;
    }

    private static int countSubStrenge(String navn, String sub) {
        return navn.contains(sub) ? 1 : 0;
    }
}
