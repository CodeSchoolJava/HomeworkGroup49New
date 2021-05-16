package lesson.homework.callCallback;

public class MessageSender {
    private OnSendListener listener;

    public OnSendListener getListener() {
        return listener;
    }

    public void setListener(OnSendListener listener) {
        this.listener = listener;

        }
        public void sendMassage(String massage){
        if (listener !=null){
            listener.send(massage);
        }
        }

    }

