package com.bigshoulders.JunitTest;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FindABookView extends JFrame {
	JTextField titleField;
	JLabel resultsLabel;
	JButton findButton;
	JButton cancelButton;
	
	public FindABookView(){
		super("Find A Book");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container content = this.getContentPane();
		JLabel titleLabel = new JLabel("Title");
		content.add(titleLabel);
		findButton= new JButton("Find");
		content.add(findButton);
		cancelButton = new JButton("Cancel");
		content.add(cancelButton);
		titleField= new JTextField("Enter The Title");
		content.add(titleField);
		resultsLabel = new JLabel("Results");
		
		
		
		
		
	}

}
