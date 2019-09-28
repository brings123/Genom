package com.esi.genom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.esi.genom.fileUpload.FileStorageProperties;
@EnableConfigurationProperties({
    FileStorageProperties.class
})
@SpringBootApplication
public class GenomApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenomApplication.class, args);
	}

}
