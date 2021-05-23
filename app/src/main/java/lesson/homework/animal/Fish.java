package lesson.homework.animal;

public class Fish extends Animal {

    public Fish(int legs) {
        super(legs);
    }

    @Override
    void eat() {

    }

    @Override
    public void walk() {
        System.out.println("The fish can not walk ");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void play() {

    }
}
