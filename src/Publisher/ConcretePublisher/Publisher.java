package Publisher.ConcretePublisher;

import Publisher.IPublisher;
import Model.Message;
import Controller.KafkaController;

public class Publisher implements IPublisher {
    private final String id;
    private final KafkaController kafkaController;

    public Publisher(String id, KafkaController kafkaController) {
        this.id = id;
        this.kafkaController = kafkaController;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void publish(String topicId, Message message) throws IllegalArgumentException {
        kafkaController.publish(this, topicId, message);
        System.out.println("Publisher " + id + " published: " + message.getMessage() + " to topic " + topicId);
    }
}
