package com.sujata.demo;

public class ThickBookPredicate implements BookPredicate {

	@Override
	public boolean test(Book book) {
		
		return book.getNoOfPages()>4000;
	}

}
