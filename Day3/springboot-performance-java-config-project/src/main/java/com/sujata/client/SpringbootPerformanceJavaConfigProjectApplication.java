package com.sujata.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sujata.producer.Dancer;
import com.sujata.producer.Drum;
import com.sujata.producer.Guitar;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Performer;
import com.sujata.producer.Singer;
import com.sujata.producer.Tabla;

@SpringBootApplication
public class SpringbootPerformanceJavaConfigProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(SpringbootPerformanceJavaConfigProjectApplication.class, args);
	
		Performer p1=(Performer)springContainer.getBean("Harsh");
		p1.perform();
	}
	
	
	@Bean
	public Singer Avni() {
		return new Singer("LALALALA");   //constructor injection
	}
	
	@Bean(name = "Atharva")
	public Juggler getJuggler() {
		Juggler juggler=new Juggler();
		juggler.setBalls(4);   //setter injection
		return juggler;
		
	}
	
	@Bean(name="Harsh")
	public Dancer getDancer() {
		Dancer dancer=new Dancer();
		dancer.setStyle("Western");
		return dancer;
	}
	
	@Bean
	public Drum drum() {
		return new Drum();
	}
	
	@Bean
	public Tabla tabla() {
		return new Tabla();
	}
	
	@Bean 
	public Guitar guitar() {
		return new Guitar();
	}
	
	@Bean(name="Jatin")
	public Instrumentalist getInstrumentalist() {
		return new Instrumentalist(guitar());
	}

}
