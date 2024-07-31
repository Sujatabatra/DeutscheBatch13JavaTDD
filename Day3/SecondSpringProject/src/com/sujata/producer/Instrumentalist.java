package com.sujata.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Jatin")
public class Instrumentalist implements Performer {

	//Not Hardcoded the dependency
	private Instrument instrument;

	/*
	 * Auto wiring by type, but if multiple types are there
	 * we need to pick of bean by name with the help of @Qualifier
	 */
	public Instrumentalist(@Autowired @Qualifier("guitar") Instrument instrument) {
		super();
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		System.out.print("Instrumentalist is playing :");
		instrument.play();
	}

}
