package lesson.homework.arevtur;

public class Seller extends Person{
    public Seller(String name, String surname, int age, GenderType gender) {
        super(name, surname, age, gender);
    }

    @Override
    public void work() {
        System.out.println("I am seller");
    }


}
