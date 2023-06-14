package opg2_2;

import opg2_1.Studerende;

public class App {
    public static void main(String[] args) {
        Skole skole = new Skole("Erhvervs Akademi Aarhus");

        Studerende s1 = new Studerende(1, "Gustav");
        Studerende s2 = new Studerende(2, "Lars");
        Studerende s3 = new Studerende(3, "Lasse");
        Studerende s4 = new Studerende(4, "Anders");
        Studerende s5 = new Studerende(5, "Emil");
        Studerende s6 = new Studerende(6, "Louise");

        s1.addKarakter(2);
        s1.addKarakter(4);
        s1.addKarakter(2);

        s2.addKarakter(12);
        s2.addKarakter(10);

        s3.addKarakter(7);
        s3.addKarakter(10);

        s5.addKarakter(7);
        s5.addKarakter(10);
        s5.addKarakter(12);

        skole.addStuderende(s1);
        skole.addStuderende(s2);
        skole.addStuderende(s3);
        skole.addStuderende(s4);
        skole.addStuderende(s5);
        skole.addStuderende(s6);

        System.out.println(skole);

        System.out.println(skole.gennemsnit());
        System.out.println(skole.findStuderende(4));

    }
}
