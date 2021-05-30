package lesson.homework;

import lesson.homework.marks.A;
import lesson.homework.marks.B;

public class Main {
    public static void main(String[] args) {

//        Fish d = new Fish();
//        Cat c = new Cat("Fluffy");
//        Animal a = new Fish();
//        Animal e = new Spider(8);
//        Pet p = new Cat("Jina");
//        d.eat();
//        d.walk();
//
//        c.eat();
//        c.play();
//        c.walk();
//        e.walk();
//        e.eat();
//        System.out.println("Pet's name is " + p.getName());
//        p.play();
//        a.walk();

        A a = new A("Tigran","Melkonyan", 77, 87,97);
        a.getPercentage();
        
        B b = new B("Vitya","Ayvazyan",54.5d, 89,64.5,90);
        b.getPercentage();


    }
}
