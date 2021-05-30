package lesson.homework;

public class Cat extends Animal implements Pet {
    private String catName;

    public Cat(String catName) {
        super(4);
        this.catName = catName;
    }

    public Cat() {
        this(" ");
    }

    protected Cat(int legs) {
        super(legs);
    }

    @Override
    public void walk() {
        System.out.println("Cat walks with " + legs + " legs");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    @Override
    public String getName() {
        return catName;
    }

    @Override
    public void setName(String name) {
        this.catName = catName;
    }

    @Override
    public void play() {
        System.out.println("Cat plays");
    }

}
