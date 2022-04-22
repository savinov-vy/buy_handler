package ru.savinov.buyhandler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafKaConsumerService {

    @KafkaListener(topics = "basket", groupId = "group_id")
    public void consume(String message) {
        System.out.println(message);
    }
}