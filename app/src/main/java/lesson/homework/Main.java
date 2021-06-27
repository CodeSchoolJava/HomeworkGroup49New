package lesson.homework;

import lesson.homework.userinfo.Registration;
import lesson.homework.userinfo.UserInfo;

import lesson.classwork.MyRunable;
import lesson.classwork.MyThread;

public class Main {
    public static void main(String[] args) {
        //write your code here
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Hello java group 49");

        MyThread myThread1=new MyThread();
        MyThread myThread2=new MyThread();
        Thread thread1=new Thread(new MyRunable());
        Thread thread2=new Thread(new MyRunable());

        System.out.println("MyThread1");
        myThread1.start();
        try {
            MyThread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("MyThread2");
        myThread2.start();
        try {
            myThread2.wait(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread1");
        thread1.start();
        System.out.println("Thread2");
        thread2.start();
        Registration user=new Registration();
        user.setName("Ester");
        user.setSurName("Mnacakanyan");
        UserInfo userInfo=UserInfo.getInstance();
        try {
            System.out.println(userInfo.getName()+" "+userInfo.getSurName()+" "+userInfo.getBirthDay().intern());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());;
        }
        System.out.println(userInfo.getName());
    }
}
