package com.sujata.producer;

import org.springframework.stereotype.Component;

/*
 * If we are not giving component any name
 *  then the name of the bean will be same that of class name but in camelCase
 */
@Component
public class Drum implements Instrument {

	@Override
	public void play() {
		System.out.println("DUM DUM DUM!!!");

	}

}
