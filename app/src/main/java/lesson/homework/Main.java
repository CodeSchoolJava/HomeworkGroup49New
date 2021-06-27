package lesson.homework;

import java.util.List;

import lesson.homework.thread.MyRunnable;
import lesson.homework.thread.MyThread;

public class Main {
    public static void main(String[] args){
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        System.out.println("MyThread1");
        myThread1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("MyThread2");
        myThread2.start();
        try {
            myThread2.wait(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread1");
        thread1.start();
        System.out.println("Thread2");
        thread2.start();


    }
}
