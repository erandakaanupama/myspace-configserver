package com.eab.myspaceconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyspaceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspaceConfigServerApplication.class, args);
	}

}
