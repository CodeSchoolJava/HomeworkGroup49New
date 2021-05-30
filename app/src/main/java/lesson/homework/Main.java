package lesson.homework;

import lesson.homework.userinfo.Registration;
import lesson.homework.userinfo.UserInfo;

public class Main {
    public static void main(String[] args) {
        //write your code here
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Hello java group 49");

        Registration user=new Registration();
        user.setName("Ester");
        user.setSurName("Mnacakanyan");
        UserInfo userInfo=UserInfo.getInstance();
        try {
            System.out.println(userInfo.getName()+" "+userInfo.getSurName()+" "+userInfo.getBirthDay().intern());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());;
        }
        System.out.println(userInfo.getName());
    }
}
