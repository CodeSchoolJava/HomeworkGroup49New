package lesson.homework.sportTypes;

public class Cat extends Animal implements Pet {
    String name;
    public Cat(int legs,String name){
        super(legs=4);
        this.name=name;
    }
    //public Cat(){
    //}

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {
        this.name=name;

    }

    @Override
    public void play() {
        System.out.println("The cat "+name+" plays with ball.");
    }

    @Override
    public void eat() {
        System.out.println("The cat "+name+" loves to eat salmon.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
