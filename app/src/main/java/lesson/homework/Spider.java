package lesson.homework;

public class Spider extends Animal {
    protected Spider(int legs) {
        super(8);
    }

    @Override
    public void walk() {
        System.out.println("Spider walks with " + legs + " legs");
    }


    public void eat() {
        System.out.println("Spider eats");
    }
}
