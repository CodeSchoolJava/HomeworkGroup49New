package lesson.homework;

import lesson.classwork.thread.MyRunable;
import lesson.classwork.thread.MyThread;
import lesson.homework.animal.Animal;
import lesson.homework.animal.Cat;
import lesson.homework.animal.Fish;
import lesson.homework.animal.Pet;
import lesson.homework.animal.Spider;

public class Main {
    public static void main(String[] args) {//        //write your code here
//        Fish d=new Fish();
//        Cat c=new Cat("Fluffy");
//        Animal a=new Fish();
//        Animal e=new Spider();
//        Pet p=new Cat();
//        d.eat();
//        d.walk();
//        d.play();
//
//        a.eat();
//        a.walk();
//
//
//        e.eat();
//        e.walk();
//        System.out.println("cat`s name is "+c.getName());
//        c.eat();
//        c.play();
//
//        c.walk();
//        p.setName("Dan");
//        System.out.println("Another cat's name is "+p.getName());
//        p.play();

        MyThread myThread1=new MyThread();
        MyThread myThread2=new MyThread();
        Thread thread1=new Thread(new MyRunable());
        Thread thread2=new Thread( new MyRunable());
        System.out.println("My thread1");
        myThread1.start();
        try {


            MyThread.sleep(3000);
        }catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }


        System.out.println("My thread2");
        myThread2.start();
        System.out.println("thread1");
        thread1.start();
        System.out.println("thread2");
                thread2.start();
    }
}
