package lesson.homework;

import lesson.homework.animal.Animal;
import lesson.homework.animal.Cat;
import lesson.homework.animal.Fish;
import lesson.homework.animal.Pet;
import lesson.homework.animal.Spider;
import lesson.homework.userinfo.Registration;
import lesson.homework.userinfo.UserInfo;

public class Main {
    public static void main(String[] args) {
//        Registration user = new Registration();
//        user.setName("Walod");
//        user.setSurName("Hamazaszpyan");
//
//        UserInfo userInfo = UserInfo.getInstance();
//
//        try {
//            System.out.println(userInfo.getBirthDay().intern());
//            System.out.println(userInfo.getName());
//            System.out.println(userInfo.getSurName());
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(userInfo.getName());

        Cat a=new Cat("Markkisio");
        Animal b=new Fish();
        Animal c=new Spider();
        Pet p=new Cat();
        System.out.println(a.getName());
        a.walk();


    }
}
