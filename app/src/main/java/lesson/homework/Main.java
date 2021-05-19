package lesson.homework;

import lesson.homework.animal.*;


public class Main {
    public static void main(String[] args) {

        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        d.eat();
        d.walk();

        c.eat();
        c.play();
        System.out.println("Cat name : " + c.getName());
        c.walk();

        a.eat();
        a.walk();

        e.eat();
        e.walk();

        p.play();
        p.setName("Luna");
        System.out.println("Cat name : " + p.getName());

    }
}