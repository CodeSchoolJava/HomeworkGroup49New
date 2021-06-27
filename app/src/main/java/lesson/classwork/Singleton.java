package lesson.classwork;

import androidx.annotation.NonNull;

public class Singleton {
    private static volatile Singleton singleton;
    private Singleton(){

    }

    public static Singleton getInstance() {
       if(singleton==null){ // stegh enk haytararum, vorovhetev metodi depqum aveli erkara ashkhatelu cragiry,
           synchronized (Singleton.class){
               if(singleton==null){
                   singleton=new Singleton();
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

