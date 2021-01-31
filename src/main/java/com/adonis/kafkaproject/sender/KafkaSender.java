package com.adonis.kafkaproject.sender;

public interface KafkaSender {

    void sendMessage(String topicName, String message);
}
