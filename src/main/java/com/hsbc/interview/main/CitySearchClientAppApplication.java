package com.hsbc.interview.main;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * Spring boot stater class
 * @author digvijayanand
 *
 */
@SpringBootApplication
@ComponentScan("com.hsbc.interview.*")
public class CitySearchClientAppApplication extends SpringBootServletInitializer  {
	
	/**
	 * Create RestTemplate bean
	 * @param builder
	 * @return RestTemplate
	 */
	@Bean
	public RestTemplate getRestTemplate(RestTemplateBuilder builder) {
		return builder.setConnectTimeout(Duration.ofMillis(3000))
	            .setReadTimeout(Duration.ofMillis(3000))
	            .build();
	}

	public static void main(String[] args) {
		
		SpringApplication.run(CitySearchClientAppApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CitySearchClientAppApplication.class);
	}

}
