package com.bigshoulders.JunitTest;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private Book book= new Book("null");
	List<Book> library = new ArrayList<Book>();
	public Library(){
		
	}
	public void addBook(Book book){
		library.add(book);
	}
	public Book getBooksByTitle(String title){
		for(Book book : library){
			if(book.getTitle().equals(title)){
				return book;
			}
			
		}
		System.out.println("no book");
		return null;
	}
	public int getNumBooks(){
		return library.size();
	}
	public void removeBook(String title) throws Exception {
		
			if( library.remove(getBooksByTitle(title)))
				throw new Exception("Book not Found");	
	}

}
