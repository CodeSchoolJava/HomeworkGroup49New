package lesson.homework.userinfo;

public class Registration {
    private UserInfo userInfo = UserInfo.getInstance();


    public void setName(String name) {
        userInfo.setName(name);
    }

    public void setSurname(String surName) {
        userInfo.setSurName(surName);
    }

    public void setBirthday(String birthday) {
        userInfo.setBirthday(birthday);
    }

}
