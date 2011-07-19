package com.bigshoulders.JUnitInAction;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddNumbersView extends JFrame {
	Calculator calculator;
	JFrame view;
	JTextField number1;
	JTextField number2;
	JLabel result;
	JButton addButton;
	JButton clearButton;
	AddNumbers addNumbers;
	
	public AddNumbersView(final AddNumbers addNumbers){
		super("CalculatorAdd");
		this.addNumbers=addNumbers;
		setUp();
		
		
		
	}
	private void setUp(){
		Container content = this.getContentPane();
		number1= new JTextField("number1");
		number2= new JTextField("number2");
		result= new JLabel("result");
		addButton= new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				result.setText(Double.toString((addNumbers.addNumbers(Double.parseDouble(number1.getText()), Double.parseDouble(number2.getText())))));
				
				
			}
		});
		clearButton= new JButton("Clear");
		content.add(number1);
		content.add(number2);
		content.add(result);
		content.add(addButton);
		content.add(clearButton);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200, 300);
		
	}

}
