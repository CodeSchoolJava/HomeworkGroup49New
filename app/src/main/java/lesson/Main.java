package lesson;

import lesson.homework.arraylist.MyArrayList;

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
        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(1, 6);
        myArrayList.set(2, 5);
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.isEmpty());
        System.out.println(myArrayList.size());
        System.out.println(myArrayList);

    }
}