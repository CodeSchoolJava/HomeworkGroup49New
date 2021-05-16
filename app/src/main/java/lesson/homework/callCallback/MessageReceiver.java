package lesson.homework.callCallback;

public class MessageReceiver implements OnSendListener {
    @Override
    public void send(String message) {
        System.out.println("es staca dzer namaky" +" "+ message);
    }
}
