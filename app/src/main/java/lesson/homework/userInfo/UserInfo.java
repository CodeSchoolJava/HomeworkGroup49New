package lesson.homework.userInfo;

public class UserInfo {
    private static UserInfo userInfo;
    private String name;
    private String surName;
    private String birthDay;

    private UserInfo() {
    }

    public static UserInfo getInstance() {

        if (userInfo == null) {
            userInfo = new UserInfo();
        }
        return userInfo;
    }

    public String getName() {
        if (name == null)
            return "Name is empty";

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        if (surName == null) {
            return "Surname is empty";
        }
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getBirthDay() throws NullPointerException{

        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}
