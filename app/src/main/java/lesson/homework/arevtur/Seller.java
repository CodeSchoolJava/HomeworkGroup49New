package lesson.homework.arevtur;

public class Seller extends Person {

    public Seller(String name, String surName, GenderType gender, int age) {
        super(name, surName, gender, age);
    }

    @Override
    public void working() {
        System.out.println("I am a Seller");
    }

}