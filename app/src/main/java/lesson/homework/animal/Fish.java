package lesson.homework.animal;
public class Fish extends Animal implements Pet {
    public Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("fish is eating now");

    }

    @Override
    public void walk() {
        System.out.println("fish cant walk with " + legs + " legs");
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void play() {
        System.out.println("fish is playing");

    }


}
