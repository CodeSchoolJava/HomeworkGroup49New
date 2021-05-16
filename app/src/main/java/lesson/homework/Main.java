package lesson.homework;

import lesson.homework.callcallback.MessageReceiver;
import lesson.homework.callcallback.MessageSender;

public class Main {
    public static void main(String[] args) {
        MessageReceiver messageReceiver = new MessageReceiver();
        MessageSender messageSender = new MessageSender();
        messageSender.setListener(messageReceiver);
        messageSender.sendMessage("Hello World ");
    }
}