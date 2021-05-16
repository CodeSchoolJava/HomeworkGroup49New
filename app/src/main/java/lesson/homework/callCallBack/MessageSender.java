package lesson.homework.callCallBack;

public class MessageSender  {
    private OnSendLissener test ;

    public void setTest(OnSendLissener test){
        this.test = test;
    }

    public OnSendLissener getTest() {
        return test;
    }

    public void sendMessage(String message){
        if(test != null){
            test.send(message);
        }
    }
}
