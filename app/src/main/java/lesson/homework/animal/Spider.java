package lesson.homework.animal;

public class Spider extends Animal {

    public Spider() {
        super(8);
    }

    @Override
    public void walk() {
        System.out.println("Spider is walking : Legs : " + legs);
    }

    @Override
    public void eat() {
        System.out.println("Spider is eating : ");
    }
}
