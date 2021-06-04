package lesson.homework.animal;

public class Cat extends Animal implements Pet {
    String name;
    public Cat(String name){
        super(4);
        this.name=name;
    }
   public Cat(){
    this(" ")  ;
    }

    @Override
    public String getName() {
        return name;
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
