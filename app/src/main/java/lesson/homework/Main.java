package lesson.homework;

import lesson.classwork.thread.MyRunnable;
import lesson.classwork.thread.MyThread;
import lesson.homework.userinfo.Registration;
import lesson.homework.userinfo.UserInfo;

public class Main {
    public static void main(String[] args){
//        Registration registration = new Registration();
//        registration.setName("Razmik");
//        registration.setSurname("Vardanyan");
//
//        UserInfo userInfo = UserInfo.getInstance();
//        System.out.println(userInfo.getName() + " " + userInfo.getSurName());
//        try {
//            System.out.println(userInfo.getBirthday().length());
//        } catch (NullPointerException n) {
//            System.out.println("Register your Birthday" + " ::::: " + n);
//        }
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        System.out.println("MyThread1");
        myThread1.start();
        System.out.println("MyThread2");
        try {
            synchronized (myThread2){
                myThread2.wait();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread2.notifyAll();
        myThread2.start();
        System.out.println("Thread1");
        thread1.start();
        System.out.println("Thread2");
        thread2.start();
    }
}