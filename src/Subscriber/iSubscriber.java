package Subscriber;
import Model.Message;

public interface ISubscriber {
    String getId();
    void onMessage(Message message) throws InterruptedException;
}
