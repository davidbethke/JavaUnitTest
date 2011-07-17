package com.bigshoulders.JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Ignore;

public class BookTest {
	public void testConstructBook(){
		Book book = new Book("Dune");
		assertTrue(book.getTitle().equals("Dune"));
	}

	@Test
	public void testGetTitle() {
		Book book = new Book("Dune");
		assertTrue(book.getTitle().equals("Dune"));
		
	}
	@Test
	public void testAuthor(){
		Book book = new Book("Dune","Frank Herbert");
		assertTrue(book.getAuthor().equals("Frank Herbert"));
	}
	@Ignore
	public static void assertEquals(Book expected,Book actual){
		assertTrue(expected.getTitle().equals(actual.getTitle()) && expected.getAuthor().equals(actual.getAuthor()));
		
	}

}
