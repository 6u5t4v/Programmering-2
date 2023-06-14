package opgave3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StuderendeTest {

    Studerende studerende;

    @BeforeEach
    void setUp() {
        studerende = new Studerende(1, "Gustav");
    }

    @Test
    void gennemsnit() {
        studerende.addKarakter(5);
        studerende.addKarakter(7);
        studerende.addKarakter(12);

        double gennemsnit = studerende.gennemsnit();
        Assertions.assertEquals(8, gennemsnit, 0.0001);
    }

    @Test
    void gennemsnitWithZero() {
        studerende.addKarakter(5);
        studerende.addKarakter(7);
        studerende.addKarakter(0);

        double gennemsnit = studerende.gennemsnit();
        Assertions.assertEquals(4, gennemsnit, 0.0001);
    }
}