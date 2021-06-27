package lesson.classwork;

public class MyRunable implements Runnable {
    @Override
    public void run() {
        System.out.println(Singleton.getInstance());
    }
}
