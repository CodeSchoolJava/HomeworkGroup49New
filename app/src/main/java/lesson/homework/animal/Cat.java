package lesson.homework.animal;

public class Cat extends Animal implements Pet{
    private String catName;

    public Cat(String catName){
        super(4);
        this.catName=catName;


    }
    public Cat(){
        this(" ");
    }
    @Override
    public void eat() {
        System.out.println("cat eats mouse");
    }

    @Override
    public void setName(String name) {
        catName=name;

    }
    @Override
    public String getName() {
        return catName;
    }

    @Override
    public void play() {
        System.out.println("cat is playing now");

    }

    @Override
    public void walk() {
        System.out.println("cat walks with "+legs+" legs");
    }
}


