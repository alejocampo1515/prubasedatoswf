package com.bdatos.prubasedatoswild;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				// Cambiar origin en produción por la url de edl Robanesky
				String origin = "*";
				registry.addMapping("/**").allowedHeaders("Authorization", "Accept", "Content-Type", "Referer", "User-Agent").allowedOrigins(origin).allowedMethods("GET", "POST", "OPTIONS", "PUT", "DELETE");
			}
		};
	}
}
