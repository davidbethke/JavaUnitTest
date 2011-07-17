package com.bigshoulders.JunitTest;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FindABookViewTest {
	FindABookView view;
	AddBook addBook;
	Library library;
	

	@Before
	public void setUp() throws Exception {
		view = new FindABookView();
		library= new Library();
		addBook= new AddBook(library);
		addBook.add("The Dragons of Eden", "Carl Sagan");
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testControlValues(){
		assertEquals("Failed Title", "Find A Book", view.getTitle());
		assertEquals("Failed Title","Enter The Title",view.titleField.getText());
		assertEquals("Failed Find Button","Find",view.findButton.getText());
		assertEquals("Failed Cancel Button","Cancel",view.cancelButton.getText());
		assertEquals("Failed Results Label","Results",view.resultsLabel.getText());
		
		
	}
	@Test
	public void testFindButton(){
		view.titleField.setText("The Dragons of Eden");
		view.findButton.doClick();
		
		
	}

}
