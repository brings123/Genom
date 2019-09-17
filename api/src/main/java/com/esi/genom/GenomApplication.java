package com.esi.genom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class GenomApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenomApplication.class, args);
	}

}
