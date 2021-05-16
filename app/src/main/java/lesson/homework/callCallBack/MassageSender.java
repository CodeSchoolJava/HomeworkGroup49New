package lesson.homework.callCallBack;

public class MassageSender {
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
        }

    }
}
