package lesson.homework.userinfo;

public class UserInfo {
    private static UserInfo userInfo;
    private String name;
    private String surName;
    private String birthDay;

    private UserInfo(){ }

    public static UserInfo getInstance(){
        if(userInfo==null){
            userInfo=new UserInfo();
        }
        return userInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getName() {
        if(name==null){
            return "name empty";
        }
        return name;
    }

    public String getSurName() {
        if(surName==null){
            return "surname empty";
        }
        return surName;
    }

    public String getBirthDay()throws NullPointerException {
       // if(birthDay==null){
         //   return "birthday empty";
       // }
        return birthDay;
    }
}
