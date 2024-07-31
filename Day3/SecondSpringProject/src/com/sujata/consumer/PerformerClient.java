package com.sujata.consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.config.PerformerConfig;
import com.sujata.producer.Performer;
import com.sujata.producer.Singer;

/*
 * Spring says while being component consumer, don't instantiate any component
 * and spring container will run the life cycle(calling constructor, setter etc. ) of all components
 * 
 * Spring Container : BeanFactory, ApplicationContext
 * to run the life cycle of all the components spring container require the configuration file(Java , XML)
 * which tells spring container about all the components whose life cycle will be executed by spring container
 * 
 *  Configuration can be specified either with java code or with annotation or with xml
 * 
 * 
 * IOC : Inversion of Control
 * Separating the dependency logic from the actual business logic of an application, so that your application will be loosly coupled.
 * 
 * We Achive IOC with dependency injection : constructor and setter
 */
public class PerformerClient {

	public static void main(String[] args) {

//		Performer p1=new Singer("LALALALA");
//		p1.perform();

		AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(
				PerformerConfig.class);

		Performer p1 = (Performer) springContainer.getBean("Avni");

		p1.perform();

		Performer p2 = (Performer) springContainer.getBean("Jatin");

		p2.perform();

	}

}
