class Dyr {
    public void sigNoget() {
        System.out.println("Jeg er et dyr");
    }
}

class Hund extends Dyr {
    @Override
    public void sigNoget() {
        System.out.println("Jeg er en hund");
    }
}

class Kat extends Dyr {
    @Override
    public void sigNoget() {
        System.out.println("Jeg er en kat");
    }
}