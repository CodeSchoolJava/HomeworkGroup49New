package lesson.homework;

import lesson.homework.animal.Animal;
import lesson.homework.animal.Cat;
import lesson.homework.animal.Fish;
import lesson.homework.animal.Pet;
import lesson.homework.animal.Spider;

public class Main {
    public static void main(String[] args) {
        //write your code here
        Fish d=new Fish();
        Cat c=new Cat("Fluffy");
        Animal a=new Fish();
        Animal e=new Spider();
        Pet p=new Cat();
        d.eat();
        d.walk();
        d.play();

        a.eat();
        a.walk();


        e.eat();
        e.walk();
        System.out.println("cat`s name is "+c.getName());
        c.eat();
        c.play();

        c.walk();
        p.setName("Dan");
        System.out.println("Another cat's name is "+p.getName());
        p.play();



    }
}
