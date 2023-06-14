package opgave4;

public class Main {
    public static void main(String[] args) {
        SuperSalg superSalg = SuperSalg.getInstance();

        ElVare macbook = new ElVare(9900, "Macbook");
        ElVare iphone = new ElVare(3000, "iPhone");
        FoedeVare aeble = new FoedeVare(2, "Æble");
        FoedeVare banan = new FoedeVare(3, "Banan");
        FoedeVare broed = new FoedeVare(15, "Brød");

        Spiritus vodka = new Spiritus(89, "Vodka");
        Spiritus gin = new Spiritus(159, "Gin");

        SpiritusToVare vodkaVare = new SpiritusToVare(vodka);
        SpiritusToVare ginVare = new SpiritusToVare(gin);

        superSalg.addVare(macbook);
        superSalg.addVare(iphone);
        superSalg.addVare(aeble);
        superSalg.addVare(banan);
        superSalg.addVare(broed);

        superSalg.addVare(vodkaVare);
        superSalg.addVare(ginVare);

        System.out.println(macbook + " moms: " + macbook.beregnMoms());
        System.out.println(ginVare + " moms: " + ginVare.beregnMoms());
        System.out.println(vodkaVare + " moms: " + vodkaVare.beregnMoms());

        System.out.println(superSalg.getVarer());
    }
}
