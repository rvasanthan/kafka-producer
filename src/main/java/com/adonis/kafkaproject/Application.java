package com.adonis.kafkaproject;

import com.adonis.kafkaproject.sender.DefaultKafkaSenderImpl;
import com.adonis.kafkaproject.sender.KafkaSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		KafkaSender sender = context.getBean(DefaultKafkaSenderImpl.class);
		sender.sendMessage("quickstart-events", "A message frorm Spring Boot");
	}
}
