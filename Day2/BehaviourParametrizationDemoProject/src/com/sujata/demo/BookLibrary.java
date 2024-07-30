package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookLibrary {

	private List<Book> books=new ArrayList<>();

	public BookLibrary() {
		books.add(new Book(1, "BookA", "Author A", 1200, 800));
		books.add(new Book(2, "BookB", "Author B", 4500, 1800));
		books.add(new Book(3, "BookC", "Author C", 2700, 1100));
		books.add(new Book(4, "BookD", "Author A", 1000, 700));
		books.add(new Book(5, "BookE", "Author B", 200, 850));
		books.add(new Book(6, "BookF", "Author A", 5600, 4000));
		books.add(new Book(7, "BookI", "Author A", 3800, 1500));
		books.add(new Book(8, "BookJ", "Author D", 1200, 8100));
	}

	public List<Book> getAllBooks() {
		return books;
	}
	
	//Behavior Parameterization
	public List<Book> searchBook(BookPredicate bookPredicate) {
		
//		List<Book> bookList=new ArrayList();
//		for(Book book:books) {
//			if(bookPredicate.test(book))
//				bookList.add(book);
//		}
		
		List<Book> bookList=books.stream().
				filter(book->bookPredicate.test(book)).
				collect(Collectors.toList());
		return bookList;
	}
	
	
	public List<Book> getBookWrittenByAuthorA(){
		List<Book> bookList=new ArrayList();
		for(Book book:books) {
			if(book.getAuthorName().equalsIgnoreCase("Author A"))
				bookList.add(book);
		}
		return bookList;
	}
	
	public List<Book> getExpensiveBooks(){
		List<Book> bookList=new ArrayList();
		for(Book book:books) {
			if(book.getPrice()>3500)
				bookList.add(book);
		}
		return bookList;
	}
	
	
}
