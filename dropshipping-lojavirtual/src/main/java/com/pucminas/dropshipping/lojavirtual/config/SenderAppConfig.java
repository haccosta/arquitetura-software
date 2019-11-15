package com.pucminas.dropshipping.lojavirtual.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderAppConfig {

    @Value("${queue.order.name}")
    private String orderQueue;

    @Bean
    public Queue queue() {
        return new Queue(orderQueue, true);
    }
}
