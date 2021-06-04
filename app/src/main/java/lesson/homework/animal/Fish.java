package lesson.homework.animal;

public class Fish extends Animal {

    public Fish(int legs) {
        super(legs=0);

    }

    @Override
    public void walks(int legs) {
        System.out.println("Fish can't walk, because they don't have legs.");
    }

    @Override
    public void eat() {
        System.out.println("Fish prefer to eat worms.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}











