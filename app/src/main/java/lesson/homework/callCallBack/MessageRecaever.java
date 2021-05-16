package lesson.homework.callCallBack;

public class MessageRecaever implements OnSendLissener {

    @Override
    public void send(String massage) {
        System.out.println("es staca dzer namaky " + massage);
    }
}
