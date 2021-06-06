package lesson;

import lesson.homework.userinfo.arraylist.MyArrayList;

public class Main {
    public static void main(String[] args) {
//        Registration registration = new Registration();
//        registration.setName("Razmik");
//        registration.setSurname("Vardanyan");
//
//        UserInfo userInfo = UserInfo.getInstance();
//        System.out.println(userInfo.getName() + " " + userInfo.getSurName());
//        try {
//            System.out.println(userInfo.getBirthday().length());
//        } catch (NullPointerException n) {
//            System.out.println("Register your Birthday" + " ::::: " + n);
//        }
        MyArrayList<Integer> myArrayList = new MyArrayList<>(10);
        myArrayList.add(1);
        myArrayList.add(null);
        System.out.println(myArrayList.size());

    }
}