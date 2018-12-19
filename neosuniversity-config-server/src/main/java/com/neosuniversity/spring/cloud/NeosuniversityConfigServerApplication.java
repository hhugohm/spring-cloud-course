package com.neosuniversity.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class NeosuniversityConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeosuniversityConfigServerApplication.class, args);
	}

}

