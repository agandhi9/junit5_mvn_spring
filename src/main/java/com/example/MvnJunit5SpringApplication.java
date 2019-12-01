package com.example;

import com.example.config.IntegrationConfig;
import com.example.config.OpensourcecmsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
		IntegrationConfig.class,
		OpensourcecmsConfig.class
})
public class MvnJunit5SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvnJunit5SpringApplication.class, args);
	}

}
