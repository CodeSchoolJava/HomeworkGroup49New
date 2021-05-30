package lesson.homework.userinfo;

public class Registration {
    private UserInfo user=UserInfo.getInstance();

    public void setName(String name){
        user.setName(name);
    }
    public void setSurName(String surName){
        user.setSurName(surName);
    }
    public void serBirthDay(String birthDay){
        user.setBirthDay(birthDay);
    }
}
