package lesson.homework.arevtur;

public abstract class Person {

    private String name;
    private String surname;
    private int age;
    private GenderType gender;

    public Person(String name, String surname, int age, GenderType gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public GenderType getGender() {
        return gender;
    }

    public abstract void work();

}
