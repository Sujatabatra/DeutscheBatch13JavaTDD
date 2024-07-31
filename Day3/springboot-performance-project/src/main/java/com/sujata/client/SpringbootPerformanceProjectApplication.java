package com.sujata.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.producer.Performer;

//@SpringBootApplication : @Configuration + @ComponentScan 
@SpringBootApplication(scanBasePackages = "com.sujata.producer")
public class SpringbootPerformanceProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(SpringbootPerformanceProjectApplication.class, args);
		
		Performer p1=(Performer)springContainer.getBean("Atharva");
		p1.perform();
	}

}
