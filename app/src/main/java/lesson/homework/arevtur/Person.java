package lesson.homework.arevtur;

public abstract class Person {
    private String name;
    private String surName;
    private GenderType gender;
    private int age;

    public Person(String name, String surName, GenderType gender, int age) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public GenderType getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public abstract void working();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}