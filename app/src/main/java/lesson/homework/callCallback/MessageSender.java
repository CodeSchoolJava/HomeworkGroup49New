package lesson.homework.callCallback;

public class MessageSender {
 private OnSendListener listener;

 public void setListener(OnSendListener listener){
     this.listener=listener;
 }

 public OnSendListener getListener(){
     return listener;
 }

 public void sendMessage(String message){
     if (listener!=null){
         listener.send(message);
     }
 }
}
