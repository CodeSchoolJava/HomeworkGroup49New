package lesson.homework;

public class Fish extends Animal {


    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk due to legs absence; Legs: " + legs);
    }
}
