package lesson.homework.animal;

public abstract class Animal implements Pet {

    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void walk() {
        System.out.println("Animal is walking ");
    }

    abstract void eat();
}


