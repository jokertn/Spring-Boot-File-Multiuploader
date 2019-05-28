package com.multiuploader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.multiuploader.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class MultiUploaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiUploaderApplication.class, args);
	}

}
