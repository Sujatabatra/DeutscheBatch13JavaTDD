package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Dancer;
import com.sujata.producer.Drum;
import com.sujata.producer.Guitar;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;
import com.sujata.producer.Tabla;

/*
 * Spring Container will look for all the classes in the package and subpackages of the package metioned in @ComponentScan
 * and will run the life cycle of all the classes being annotated with @Component  
 */
@Configuration
@ComponentScan(basePackages = "com.sujata.producer")
public class PerformerConfig {
	


}
