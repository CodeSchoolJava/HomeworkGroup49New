package lesson.homework.callcallback;

public class MessageReceiver implements OnSendListener {

    @Override
    public void send(String message) {
        System.out.println("Es staca dzer message : " + message);
    }
}