package com.gegesha;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import items.wsdl.GetCityForecastByZIPResponse;

@SpringBootApplication
public class DemoconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoconsumerApplication.class, args);
	
	}
		@Bean
		CommandLineRunner lookup(WeatherClient weatherClient) {
			return args -> {
				String zipCode = "94304";

				if (args.length > 0) {
					zipCode = args[0];
				}
				GetCityForecastByZIPResponse response = weatherClient.getCityForecastByZip(zipCode);
			};
		
	}
	
	
}
