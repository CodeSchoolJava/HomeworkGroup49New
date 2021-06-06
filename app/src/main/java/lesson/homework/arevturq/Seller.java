package lesson.homework.arevturq;

public class Seller extends Person{

    public Seller(String name, String surName, int age, GenderType gender) {
        super(name, surName, age, gender);
    }

    @Override
    public void working() {
        System.out.println("i am Saller ");
    }

    @Override
    public String toString() {
        return "Seller{}";
    }
}
