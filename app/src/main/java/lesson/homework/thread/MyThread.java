package lesson.homework.thread;



public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Singleton.getInstance());
    }
}
