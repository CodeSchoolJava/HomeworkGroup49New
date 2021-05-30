package lesson.homework;

import lesson.homework.userInfo.Registration;
import lesson.homework.userInfo.UserInfo;

public class Main {
    public static void main(String[] args) {
        Registration user = new Registration();
        user.setName("Aram");
        user.setSurname("Davidyan");


        UserInfo userInfo = UserInfo.getInstance();
        try {
            System.out.println(userInfo.getBirthDay().intern());
            System.out.println(userInfo.getName());
            System.out.println(userInfo.getSurName());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }
}
