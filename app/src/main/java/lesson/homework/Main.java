package lesson.homework;

import lesson.homework.callCallBack.MassageReceiver;
import lesson.homework.callCallBack.MassageSender;

public class Main {
    public static void main(String[] args) {

        MassageReceiver massageReceiver = new MassageReceiver();
        MassageSender massageSender = new MassageSender();
        massageSender.setListener(massageReceiver);
        massageSender.sendMessage(" uxarkelem");

    }
}
