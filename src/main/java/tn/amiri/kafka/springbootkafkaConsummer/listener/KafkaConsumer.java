package tn.amiri.kafka.springbootkafkaConsummer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import tn.amiri.kafka.springbootkafkaConsummer.model.User;


@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test2", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "Kafka_Example_json", groupId = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}