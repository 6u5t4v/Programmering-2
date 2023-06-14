abstract class Blomst {
    public abstract void gørSomEnBlomst();
}

abstract class Yeet {
    public abstract void gørSomEnBlomst();
}

class Solsikke extends Blomst {
    @Override
    public void gørSomEnBlomst() {
        System.out.println("Jeg er en solsikke");
    }
}

class Rose extends Blomst {
    @Override
    public void gørSomEnBlomst() {
        System.out.println("Jeg er en rose");
    }
}