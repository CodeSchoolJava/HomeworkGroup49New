package lesson.homework.userinfo;

public class Registration {
    private UserInfo userInfo=UserInfo.getInstance();


    public void setName(String name){
        userInfo.setName(name);
    }
    public void setSurname(String surname){
        userInfo.setSurName(surname);
    }
    public void setBirthday(String birthday){
        userInfo.setBirthday(birthday);
    }
}