package lesson.homework.callcallback;

public class MessageSender {
    private OnSendListener listener;


    public void setListener(OnSendListener listener) {
        this.listener = listener;
    }

    public OnSendListener getListener() {
        return listener;
    }

    public void sendMessage(String message) {
        if (listener != null) {
            listener.send(message);
        }else{
            System.out.println("You don't write message!!!");
        }
    }
}