package lesson.homework;

import java.util.ArrayList;
import java.util.List;

import lesson.homework.collection.MyArrayList;

public class Main {
    public static void main(String[] args) {

        MyArrayList<String> myArrayList = new MyArrayList<String>();
        myArrayList.add("avelaci");
        myArrayList.add("avelaci eli");
        myArrayList.add("avelaci mi hat el");
        myArrayList.add("avelaci es mekn el");
        myArrayList.add("avelaci es el u verj");
        myArrayList.remove(3);
        myArrayList.add("esi avelacra nra texy",2);
        myArrayList.size();
        myArrayList.isEmpty();
        System.out.println(myArrayList);











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
