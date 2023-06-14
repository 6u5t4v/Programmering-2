package forsikring;

import forsikring.BilForsikring;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BilForsikringTest {
    BilForsikring bilForsikring = new BilForsikring();

    @BeforeEach
    void setUp() {
        bilForsikring.setGrundpaemie(1000);
    }

    @Test
    void setGrundpaemieZero() {
        assertThrows(RuntimeException.class, () -> {
            bilForsikring.setGrundpaemie(0);
        });
    }

    @Test
    void setGrundpraemieNegative() {
        assertThrows(RuntimeException.class, () -> {
            bilForsikring.setGrundpaemie(-100);
        });
    }

    @Test
    void beregnPraemieTestCase1() {
        double praemie = bilForsikring.beregnPraemie(24, true, 0);
        assertEquals(1187.5, praemie);
    }

    @Test
    void beregnPraemieTestCase2() {
        double praemie = bilForsikring.beregnPraemie(25, true, 0);
        assertEquals(950, praemie);
    }

    @Test
    void beregnPraemieTestCase3() {
        double praemie = bilForsikring.beregnPraemie(24, true, 3);
        assertEquals(1009.375, praemie);
    }

    @Test
    void beregnPraemieTestCase4() {
        double praemie = bilForsikring.beregnPraemie(25, true, 3);
        assertEquals(807.5, praemie);
    }

    @Test
    void beregnPraemieTestCase5() {
        double praemie = bilForsikring.beregnPraemie(24, true, 6);
        assertEquals(890.625, praemie);
    }

    @Test
    void beregnPraemieTestCase6() {
        double praemie = bilForsikring.beregnPraemie(25, true, 6);
        assertEquals(712.5, praemie);
    }

    @Test
    void beregnPraemieTestCase7() {
        double praemie = bilForsikring.beregnPraemie(27, true, 9);
        assertEquals(617.5, praemie);
    }

    @Test
    void beregnPraemieTestCase8() {
        double praemie = bilForsikring.beregnPraemie(24, false, 0);
        assertEquals(1250.0, praemie);
    }

    @Test
    void beregnPraemieTestCase9() {
        double praemie = bilForsikring.beregnPraemie(25, false, 0);
        assertEquals(1000.0, praemie);
    }

    @Test
    void beregnPraemieTestCase10() {
        double praemie = bilForsikring.beregnPraemie(24, false, 3);
        assertEquals(1062.5, praemie);
    }

    @Test
    void beregnPraemieTestCase11() {
        double praemie = bilForsikring.beregnPraemie(25, false, 3);
        assertEquals(850.0, praemie);
    }

    @Test
    void beregnPraemieTestCase12() {
        double praemie = bilForsikring.beregnPraemie(24, false, 6);
        assertEquals(937.5, praemie);
    }

    @Test
    void beregnPraemieTestCase13() {
        double praemie = bilForsikring.beregnPraemie(25, false, 6);
        assertEquals(750.0, praemie);
    }

    @Test
    void beregnPraemieTestCase14() {
        double praemie = bilForsikring.beregnPraemie(27, false, 9);
        assertEquals(650.0, praemie);
    }

    @Test
    void beregnPraemieTestCase15() {
        assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(18, false, 6);
        });
    }

    @Test
    void beregnPraemieTestCase16() {
        assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(15, false, 0);
        });
    }

    @Test
    void beregnPraemieTestCase17() {
        assertThrows(RuntimeException.class, () -> {
            bilForsikring.beregnPraemie(25, false, -1);
        });
    }
}