package lesson.classwork.thread;

public class Singleton {
    private static volatile Singleton singleton;
    private Singleton(){
    }

    @Override
    public String toString() {
        return "Singleton{}";
    }

    public static Singleton getInstance() {
        if(singleton==null){
            synchronized (Singleton.class){
               if(singleton==null) {
                   singleton=new Singleton();
               }
            }
        }
        return singleton;

    }
}
