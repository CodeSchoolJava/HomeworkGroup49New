package lesson.homework;

import lesson.homework.callCallback.MessageReceiver;
import lesson.homework.callCallback.MessageSender;

public class Main {
    public static void main(String[] args) {
        MessageReceiver receiver=new MessageReceiver();
        MessageSender sender=new MessageSender();
        sender.setListener(receiver);
        sender.sendMessage("es uxarkeci namaky");
    }
}
