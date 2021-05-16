package lesson.homework.callCallBack;

public class MassageReceiver implements OnSendListener {

    @Override
    public void send(String message) {
        System.out.println("es staca dzer namaky" + message);
    }
}
