package bibliotekbøde;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

class BibliotekTest {
    Bibliotek bibliotek = new Bibliotek();
    LocalDate forventet;

    @BeforeEach
    void setUp() {
        forventet = LocalDate.of(2023, Month.APRIL, 3);
    }

    @Test
    void beregnBødeTestCase1() {
        int bøde = bibliotek.beregnBøde(
                forventet,
                forventet.plusDays(5), false);

        Assertions.assertEquals(10, bøde);
    }

    @Test
    void beregnBødeTestCase2() {

        int bøde = bibliotek.beregnBøde(
                forventet,
                forventet.plusDays(5), true);

        Assertions.assertEquals(20, bøde);
    }

    @Test
    void beregnBødeTestCase3() {

        int bøde = bibliotek.beregnBøde(
                forventet,
                forventet.plusDays(10), false);

        Assertions.assertEquals(30, bøde);
    }

    @Test
    void beregnBødeTestCase4() {

        int bøde = bibliotek.beregnBøde(
                forventet,
                forventet.plusDays(10), true);

        Assertions.assertEquals(60, bøde);
    }

    @Test
    void beregnBødeTestCase5() {

        int bøde = bibliotek.beregnBøde(
                forventet,
                forventet.plusDays(16), false);

        Assertions.assertEquals(45, bøde);
    }

    @Test
    void beregnBødeTestCase6() {

        int bøde = bibliotek.beregnBøde(
                forventet,
                forventet.plusDays(16), true);

        Assertions.assertEquals(90, bøde);
    }

    @Test
    void beregnBødeTestCase7() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            bibliotek.beregnBøde(forventet, forventet.plusDays(0), false);
        });
    }
}