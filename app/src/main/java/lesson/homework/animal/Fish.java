package lesson.homework.animal;

public class Fish extends Animal {

    public Fish() {
        super(0);

    }

    @Override
    public void walks() {
        System.out.println("Fish can't walk, because they don't have legs.");
    }

    @Override
    public void eat()
    {
        System.out.println("Fish prefer to eat worms.");
    }

    @Override
    public String toString() {

        return super.toString();
    }
}











