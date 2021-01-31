package com.adonis.kafkaproject.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${adonis.kafka.topic-quickstart}")
    private String quickStart;

    @Bean
    NewTopic quickStart() {
        return TopicBuilder.name(quickStart).build();
    }
}
