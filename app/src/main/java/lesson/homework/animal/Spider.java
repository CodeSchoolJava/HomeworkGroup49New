package lesson.homework.animal;

public class Spider extends Animal{
    public Spider(int legs) {
        super(legs);
    }

    @Override
    void eat() {
        System.out.println("Spider is eating ");

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

