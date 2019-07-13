package com.jspc.intelliquote.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class QuoteEditor extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	/**
	 * Creates an instance of this class.
	 */
	
	public QuoteEditor() {
		super();
		
		this.initialize();
	}
	
	/**
	 * Responds to action events originating within this component.
	 * 
	 * @param e the event
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("QuoteEditor::actionPerformed");
	}
	
	private void initialize() {
		this.add(new JLabel("Placeholder for QuoteEditor component."));
	}
}