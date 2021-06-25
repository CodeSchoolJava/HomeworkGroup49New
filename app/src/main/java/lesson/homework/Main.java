package lesson.homework;

import lesson.homework.animal.Animal;
import lesson.homework.animal.Cat;
import lesson.homework.animal.Fish;
import lesson.homework.animal.Pet;
import lesson.homework.animal.Spider;

public class Main {
    public static void main(String[] args) {
        //write your code here
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Hello java group 49");

        Fish d=new Fish();
        Cat c=new Cat("Fluffy");
        Animal a=new Fish();
        Animal e=new Spider();
        Pet p=new Cat();

        d.walks();
        d.eat();
        c.eat();
        c.getName();
        c.play();
        a.eat();
        a.walks();
        e.eat();
        e.walks();
        p.setName("Mashka");
        p.getName();
        p.play();

    }
}