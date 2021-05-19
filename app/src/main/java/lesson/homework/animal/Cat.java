package lesson.homework.animal;

public class Cat extends Animal implements Pet {
    private String nameCat;

    public Cat(String nameCat) {
        super(4);
        this.nameCat = nameCat;
    }

    public Cat() {
        this(" ");
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking : Legs : " + legs);
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating : ");
    }

    @Override
    public String getName() {
        return nameCat;
    }

    @Override
    public void setName(String name) {
        nameCat = name;
    }

    @Override
    public void play() {
        System.out.println("Cat is playing : ");
    }
}
