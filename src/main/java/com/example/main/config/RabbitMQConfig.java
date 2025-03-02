package com.example.main.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConfig {
	@Value("${rabbitmq.queue}")
	private String queue;
	
	@Value("${rabbitmq.exchange}")
	private String exchange;
	
	@Value("${rabbitmq.routing_key}")
	private String routing_key;

	@Bean
	public Queue queue() {
		return new Queue(queue);
	}
	
	@Bean
	public TopicExchange exchange() {
		return new TopicExchange(exchange);
	}
	
	@Bean
	public Binding binding() {
		return BindingBuilder
				.bind(queue())
				.to(exchange())
				.with(routing_key);
	}
}
