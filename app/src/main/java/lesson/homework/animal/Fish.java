package lesson.homework.animal;

public class Fish extends Animal {

    public Fish() {
        super(0);
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk : Legs :  " + legs);
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating : ");
    }

}
