package lesson.homework.thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Singleton.getInstance());
    }
}
