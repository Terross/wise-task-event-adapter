package ru.leti.wise.task.event.adapter.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

import static ru.leti.wise.task.event.adapter.helper.Headers.ID;

@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaProducer {

    public static final String TOPIC = "wise.task.graph.constructor";

    private final KafkaTemplate<String, Map<String, String>> kafkaTemplate;

    public void send(Map<String, String> event){
        String key = event.get(ID);
        kafkaTemplate.send(TOPIC, key , event);
        log.info("Producer produced the message {}", event);
    }

}
