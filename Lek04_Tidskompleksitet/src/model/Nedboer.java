package model;

import java.util.Collection;
import java.util.LinkedList;

public class Nedboer {
    private static int[] nedboerPrUge = {20, 10, 12, 12, 13, 14, 15, 10, 8, 7, 13,
            15, 10, 9, 6, 8, 12, 22, 14, 16, 16, 18, 23, 12, 0, 2, 0, 0, 78, 0,
            0, 0, 34, 12, 34, 23, 23, 12, 44, 23, 12, 34, 22, 22, 22, 22, 18,
            19, 21, 32, 24, 13};

    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i de tre uger
     *
     * @return
     */

    public static int bedsteTreFerieUger() {
        int bedsteUge = Integer.MAX_VALUE;
        int mindstNedboer = bedsteUge;

        Collection<String> linked = new LinkedList<>();

        for (int i = 0; i < nedboerPrUge.length - 2; i++) {
            int mængde = nedboerPrUge[i] + nedboerPrUge[i + 1] + nedboerPrUge[i + 2];
            if (mængde < mindstNedboer) {
                bedsteUge = i + 1;
                mindstNedboer = mængde;
            }
        }
        return bedsteUge;
    }

    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i det "antal" uger, der er
     * angivet i paramtereren
     *
     * @return
     */

    public static int bedsteFerieUgerStart(int antal) {
        int bedsteUge = Integer.MAX_VALUE;
        int mindstNedboer = bedsteUge;

        for (int i = 0; i < nedboerPrUge.length - (antal - 1); i++) {
            int mængdeForUge = 0;
            for (int j = 0; j < antal; j++) {
                mængdeForUge += nedboerPrUge[i + j];
            }

            if (mængdeForUge < mindstNedboer) {
                bedsteUge = i + 1;
                mindstNedboer = mængdeForUge;
            }
        }
        return bedsteUge;
    }

    /**
     * Returnerer ugenummeret på den første uge hvor nedbøren har været præcis
     * den samme flest uger i træk
     *
     * @return
     */
    public static int ensNedboer() {
        int førsteUgeNr = 0;
        int bestCount = 0;
        int counter = 0;

        for (int i = 0; i < nedboerPrUge.length - 1; i++) {
            if (nedboerPrUge[i] == nedboerPrUge[i + 1]) {
                counter++;
            } else if (counter > bestCount) {
                bestCount = counter;
                førsteUgeNr = i - counter;
                counter = 0;
            } else {
                counter = 0;
            }
        }

        return førsteUgeNr + 1;
    }
}
