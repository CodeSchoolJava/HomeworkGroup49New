package lesson.homework.userInfo;

public class Registration {

    private UserInfo user = UserInfo.getInstance();

    public void setName(String name) {
        user.setName(name);
    }

    public void setSurname(String surName) {
        user.setSurName(surName);

    }

    public void setBirthday(String birthDay) {
        user.setBirthDay(birthDay);

    }
}
