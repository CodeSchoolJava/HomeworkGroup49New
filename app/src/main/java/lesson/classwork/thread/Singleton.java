package lesson.classwork.thread;

import androidx.annotation.NonNull;

public class Singleton {
    private static volatile Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }

        }
        return singleton;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
