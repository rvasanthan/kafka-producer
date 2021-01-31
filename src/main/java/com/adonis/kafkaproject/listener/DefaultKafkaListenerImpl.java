package com.adonis.kafkaproject.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DefaultKafkaListenerImpl implements KafkaSubscriber {

    @Override
    @KafkaListener(topics = "${adonis.kafka.topic-quickstart}", groupId = "foo", containerFactory = "kafkaListenerContainerFactory")
    public void listen(String message) {
        System.out.println("Getting a message from a Listener");
        System.out.println(message);
    }
}
