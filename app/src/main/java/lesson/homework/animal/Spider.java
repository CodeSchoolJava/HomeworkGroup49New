package lesson.homework.animal;

public class Spider extends Animal{
    public Spider() {
        super(8);
    }
    @Override
    public void eat() {
        System.out.println("Spiders eat twice a day");
    }

    @Override
    public void walk() {
        System.out.println("spider walks with " +legs+ " legs");
    }
}


