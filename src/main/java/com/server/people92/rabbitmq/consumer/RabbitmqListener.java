package com.server.people92.rabbitmq.consumer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RabbitmqListener {

    private static final String RABBITMQ_TEST_QUEUE = "rabbitmq.test.queue";

    @RabbitListener(queues = RABBITMQ_TEST_QUEUE)
    public void receiveRabbitmqMessage(String message){

        log.info("==== rabbitmq result => {}", message);
    }
}
