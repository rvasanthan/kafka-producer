package com.adonis.kafkaproject.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class DefaultKafkaSenderImpl implements KafkaSender {

    @Value("${adonis.kafka.topic.default}")
    private String defaultTopicName;

    @Autowired
    KafkaTemplate kafkaTemplate;


    @Override
    public void sendMessage(String topicName, String message) {
        kafkaTemplate.send(topicName, message);
    }
}
