package ru.leti.wise.task.event.adapter.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.leti.wise.task.event.adapter.api.EventApiDelegate;
import ru.leti.wise.task.event.adapter.kafka.KafkaProducer;
import ru.leti.wise.task.event.adapter.model.HandleConstructorSolutionEvent200Response;

import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

import static ru.leti.wise.task.event.adapter.helper.Headers.ID;
import static ru.leti.wise.task.event.adapter.helper.Headers.TIMESTAMP;

@RestController
@RequiredArgsConstructor
public class EventController implements EventApiDelegate {


    private final KafkaProducer kafkaProducer;

    @Override
    public ResponseEntity<HandleConstructorSolutionEvent200Response> handleConstructorSolutionEvent(Map<String, String> body) {
        body.put(ID, UUID.randomUUID().toString());
        body.put(TIMESTAMP, OffsetDateTime.now().toString());
        kafkaProducer.send(body);
        return ResponseEntity.ok(new HandleConstructorSolutionEvent200Response().result("ok"));
    }
}

