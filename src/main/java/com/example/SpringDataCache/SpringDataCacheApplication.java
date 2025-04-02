package com.example.SpringDataCache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringDataCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataCacheApplication.class, args);
	}

}
