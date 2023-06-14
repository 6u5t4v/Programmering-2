package fletning;

import java.util.ArrayList;
import java.util.Collections;

public class FletteSorteringHul {

    // den metode der saetter fletningen i gang
    public static void fletteSort(ArrayList<Integer> list) {
        mergesort(list, 0, list.size() - 1);
    }

    // den rekursive metode der implementere del-loes og kombiner skabelonen
    private static void mergesort(ArrayList<Integer> list, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergesort(list, l, m);
            mergesort(list, m + 1, h);
            merge(list, l, m, h);
        }
    }

    // kombiner er realiseret ved fletteskabelonen
    private static void merge(ArrayList<Integer> list, int low, int middle, int high) {
        ArrayList<Integer> tempList = new ArrayList<Integer>(list);

//        int target = -1;
//        int i = 0;
//
//        while (target == -1 && i < list.size()) {
//            int k = list.get(i);
//
//            if (k == n && i != 0) {
////                Collections.swap(list, i, i - 1);
//                int temp = list.get(i - 1);
//                list.set(i - 1, k);
//                list.set(i, temp);
//                target = i;
//            }
//
//            i++;
//        }
    }

    private static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, j);
        list.set(j, temp);
    }
}
