package lesson.homework;

public class Main {
    public static void main(String[] args) {
        Registration user = new Registration();
        user.setName("Tigran");
        user.setSurname("Melkonyan");

        UserInfo userInfo = UserInfo.getInstance();

        try {
            System.out.println(userInfo.getName() + " " + userInfo.getSurName() + " "
                    + userInfo.getBirthDay().intern());//stex intern()-y uxxaki gorcoxutyun a null-i vra
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(userInfo.getName());

    }
}
