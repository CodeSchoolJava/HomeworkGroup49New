package lesson.homework.animal;

public class Spider extends Animal{
    public Spider(){

        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spider eats worms,snails and small vertarates like frogs anf bats.");
    }

    @Override
    public String toString() {
        return "Spider{}";
    }
}
