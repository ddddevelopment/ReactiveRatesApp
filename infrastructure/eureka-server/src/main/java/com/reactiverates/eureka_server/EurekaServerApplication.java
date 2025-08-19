package com.reactiverates.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server Application
 * 
 * Это центральный реестр сервисов для микросервисной архитектуры.
 * Все микросервисы регистрируются здесь и могут находить друг друга.
 */
@SpringBootApplication
@EnableEurekaServer  // ВАЖНО: Включает функциональность Eureka Server
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
