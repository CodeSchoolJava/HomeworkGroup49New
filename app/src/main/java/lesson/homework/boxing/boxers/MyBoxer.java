package lesson.homework.boxing.boxers;

import androidx.annotation.NonNull;

public class MyBoxer extends Boxer  {


    @NonNull
    @Override
    public String toString() {
        return "--------------MY Boxer--------------" +
                super.toString();
    }



}
