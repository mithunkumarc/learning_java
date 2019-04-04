package com.example.demo.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.example.demo.model.Email;

@Component
public class Receiver2 {

	
	@JmsListener(destination = "mailbox.topic", containerFactory = "topicListenerFactory")
    public void receiveTopicMessage(Email email) {
        System.out.println("Received : topic : 2 <" + email + ">");
    }
    
	
	
	@JmsListener(destination = "mailbox.queue", containerFactory = "queueListenerFactory")
    public void receiveQueueMessage(Email email) {
        System.out.println("Received : queue : 2<" + email + ">");
    }
}
