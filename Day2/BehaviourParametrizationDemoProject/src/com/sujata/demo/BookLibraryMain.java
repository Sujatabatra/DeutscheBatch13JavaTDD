package com.sujata.demo;

public class BookLibraryMain {

	public static void main(String[] args) {
		BookLibrary bookLibrary = new BookLibrary();

//		System.out.println(bookLibrary.getAllBooks());
//
//		System.out.println("================================");
//		
//		System.out.println(bookLibrary.getBookWrittenByAuthorA());
//		
//		System.out.println("=============================");
//		
//		System.out.println(bookLibrary.getExpensiveBooks());
//		
//		System.out.println("=============================");
//		
//		System.out.println(bookLibrary.searchBook(new ExpensiveBookPredicate()));
//		
//		System.out.println("=============================================");

		System.out.println(bookLibrary.searchBook(new ThickBookPredicate()));

		System.out.println("==========================");
//		System.out.println(bookLibrary.searchBook(new BookPredicate() {
//			
//			@Override
//			public boolean test(Book book) {
//				return book.getPrice()>4000;
//			}
//		}));

		System.out.println(bookLibrary.searchBook(book-> book.getPrice()>4000));
	}

}
