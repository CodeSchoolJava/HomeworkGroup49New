package lesson.homework.userinfo;

public class UserInfo {
    private static UserInfo userInfo;
    private String name;
    private String surName;
    private String birthday;
    private UserInfo(){

    }
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

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }



    public String getName() {
        if (name==null){
            return "write a name";
        }
        return name;
    }

    public String getSurName() {
        if(surName==null){
            return "write a surname";
        }
        return surName;
    }

    public String getBirthday()throws NullPointerException {
        return birthday;
    }
}
