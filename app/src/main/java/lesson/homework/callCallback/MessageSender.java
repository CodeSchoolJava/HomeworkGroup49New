package lesson.homework.callCallback;

public class MessageSender {
    OnSendListener listener;

    public void setListener(OnSendListener listener) {
        this.listener = listener;
    }

    public OnSendListener getListener() {
        return listener;
    }
    public void sendMessage(String message){
        if(listener!=null){
            listener.functionSend(message);
        }
    }
}
