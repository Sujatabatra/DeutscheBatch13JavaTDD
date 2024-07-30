package com.sujata.producer;

public class Instrumentalist implements Performer {

	//Not Hardcoded the dependency
	private Instrument instrument;

	public Instrumentalist(Instrument instrument) {
		super();
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		System.out.print("Instrumentalist is playing :");
		instrument.play();
	}

}
