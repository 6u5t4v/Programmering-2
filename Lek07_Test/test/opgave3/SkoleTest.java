package opgave3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SkoleTest {
    private Skole skole;
    private Studerende studerende;

    @BeforeEach
    void setUp() {
        skole = new Skole("EAAA");

        Studerende s1 = new Studerende(1, "Gustav");
        Studerende s2 = new Studerende(2, "Lars");
        studerende = new Studerende(3, "Lasse");
        Studerende s4 = new Studerende(4, "Anders");
        Studerende s5 = new Studerende(5, "Emil");
        Studerende s6 = new Studerende(6, "Louise");

        s1.addKarakter(2);
        s1.addKarakter(4);
        s1.addKarakter(7);

        s2.addKarakter(12);
        s2.addKarakter(10);

        studerende.addKarakter(7);
        studerende.addKarakter(10);

        s5.addKarakter(7);
        s5.addKarakter(10);
        s5.addKarakter(12);

        skole.addStuderende(s1);
        skole.addStuderende(s2);
        skole.addStuderende(studerende);
        skole.addStuderende(s4);
        skole.addStuderende(s5);
        skole.addStuderende(s6);
    }

    @Test
    void gennemsnit() {
        double gennemsnit = skole.gennemsnit();
        assertEquals(8.1, gennemsnit, 0.01);
    }

    @Test
    void findStuderende() {
        Studerende find = skole.findStuderende(3);
        assertEquals(studerende, find);
    }
}