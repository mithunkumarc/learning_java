package com.example.demo.controller;


import com.example.demo.engine.Producer;
import com.example.demo.engine.SecondProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;
    private final SecondProducer secondProducer;

    @Autowired
    KafkaController(Producer producer,SecondProducer secondProducer) {
        this.producer = producer;
        this.secondProducer = secondProducer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
        this.secondProducer.sendMessage("second topic : "+ message);
    }
}