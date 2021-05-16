package lesson.homework;
import lesson.homework.callCallBack.*;

public class Main {
    public static void main(String[] args) {

        MessageRecaever recaever = new MessageRecaever();
        MessageSender sender = new MessageSender();
        sender.setTest(recaever);
        sender.sendMessage("hello world , humans & animals");
    }
}
