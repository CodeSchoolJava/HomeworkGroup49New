package lesson.homework;

import lesson.homework.userinfo.Registration;
import lesson.homework.userinfo.UserInfo;

public class Main {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setName("Razmik");
        registration.setSurname("Vardanyan");

        UserInfo userInfo = UserInfo.getInstance();
        System.out.println(userInfo.getName() + " " + userInfo.getSurName());
        try {
            System.out.println(userInfo.getBirthday().length());
        } catch (NullPointerException n) {
            System.out.println("Register your Birthday" + " ::::: " + n);
        }
    }
}