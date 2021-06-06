package lesson.homework;

public abstract class Person {
    private String name;
    private String surName;
    private int age;
    private GenderType gender;

    public Person(String name, String surName, int age, GenderType gender) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public GenderType getGender() {
        return gender;
    }
    public abstract void working();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
