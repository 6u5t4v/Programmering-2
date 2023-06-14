interface Animal {
    public void animalSound();

    public void sleep();
}

interface Mammal {
    public void feedBabyWithMilk();
}

class Cat implements Animal, Mammal {
    public void animalSound() {
        System.out.println("The cat says: miau miau");
    }

    public void sleep() {
        System.out.println("Zzz");
    }

    public void feedBabyWithMilk() {
        System.out.println("The cat feeds its babies with milk");
    }
}