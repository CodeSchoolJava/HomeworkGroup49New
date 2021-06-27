package lesson.homework;

import lesson.homework.thread.MyRunnable;
import lesson.homework.thread.MyThread;
import lesson.homework.userInfo.Registration;
import lesson.homework.userInfo.UserInfo;

public class Main {
    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        System.out.println("MyThread");
        myThread1.start();
        try {
            MyThread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException" + e.getMessage());
        }
        System.out.println("MyThread");
        myThread2.start();
        System.out.println("Thread");
        thread1.start();
        System.out.println("Thread");
        thread2.start();












//        Registration user = new Registration();
//        user.setName("Aram");
//        user.setSurname("Davidyan");
//
//
//        UserInfo userInfo = UserInfo.getInstance();
//        try {
//            System.out.println(userInfo.getBirthDay().intern());
//            System.out.println(userInfo.getName());
//            System.out.println(userInfo.getSurName());
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }

    }
}
