package com.jspc.intelliquote.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.jspc.intelliquote.controller.ViewManager;

public class QuoteEditor extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private ViewManager manager;

	/**
	 * Creates an instance of this class.
	 */
	
	public QuoteEditor(ViewManager manager) {
		super();
		
		this.manager = manager;
		
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
		
		manager.placeholder();
	}
	
	private void initialize() {
		this.add(new JLabel("Placeholder for QuoteEditor component."));
	}
}