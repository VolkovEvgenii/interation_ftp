package ru.volkov.integration.ftp;

import org.springframework.messaging.Message;

public class MessagePrinter {

    public void print(Message<?> message) {
        System.out.println(message);
    }
}
