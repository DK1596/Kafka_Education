package com.example.kafkaexample.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "testone", groupId = "groupId")
    public void listener(String data) {
        System.out.println("Listener received: " + data + " 🐸");
    }
}
