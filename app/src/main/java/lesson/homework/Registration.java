package lesson.homework;

public class Registration {
    private UserInfo user = UserInfo.getInstance();

    public void setName(String name){
        user.setName(name);
    }
    public void setSurname(String surname){
        user.setSurName(surname);
    }
    public void setBirthDay(String birthDay){
        user.setBirthDay(birthDay);
    }

}
