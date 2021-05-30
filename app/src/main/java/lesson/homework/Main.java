package lesson.homework;

import lesson.homework.userinfo.Registration;
import lesson.homework.userinfo.UserInfo;

public class Main {
    public static void main(String[] args) {
        Registration user = new Registration();
        user.setName("Walod");
        user.setSurName("Hamazaszpyan");

        UserInfo userInfo = UserInfo.getInstance();

        try {
            System.out.println(userInfo.getBirthDay().intern());
            System.out.println(userInfo.getName());
            System.out.println(userInfo.getSurName());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(userInfo.getName());
    }
}
