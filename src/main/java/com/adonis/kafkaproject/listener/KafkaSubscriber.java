package com.adonis.kafkaproject.listener;

public interface KafkaSubscriber {

    void listen(String message);
}
