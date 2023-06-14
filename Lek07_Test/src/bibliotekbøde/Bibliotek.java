package bibliotekbøde;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Bibliotek {
    /*
     * Returnerer størrelsen af bøden beregnet i henhold til skemaet
     * ovenfor
     * krav: beregnetDato og faktiskDato indeholder lovlige datoer og
     *       beregnetDato < faktiskDato
     *      (beregnetDato er forventet afleveringsdato og
     *       faktiskDato er den dag bogen blev afleveret; voksen er
     *       sand, hvis det er en voksen og falsk ellers)
     */
    public int beregnBøde(LocalDate beregnetDato,
                          LocalDate faktiskDato, boolean voksen) {

        if (!beregnetDato.isBefore(faktiskDato)) {
            throw new RuntimeException("Beregnet dato skal være mindre end faktisk dato");
        }

        int dageImellem = (int) beregnetDato.until(faktiskDato, ChronoUnit.DAYS);
        int bøde;

        if (dageImellem >= 1 && dageImellem <= 7) {
            bøde = 10;
        } else if (dageImellem >= 8 && dageImellem <= 14) {
            bøde = 30;
        } else {
            bøde = 45;
        }

        return voksen ? bøde *= 2 : bøde;
    }
}
