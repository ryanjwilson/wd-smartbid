package com.jspc.intelliquote.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class QuoteSidebar extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	private ActionGroup actionGroup;
	private QuoteList quoteList;
	
	/**
	 * Creates an instance of this class.
	 * 
	 * @param actionGroup the button group for manipulating records
	 * @param quoteList the list of records to be rendered
	 */
	
	public QuoteSidebar(ActionGroup actionGroup, QuoteList quoteList) {
		super();
		
		this.actionGroup = actionGroup;
		this.quoteList = quoteList;
		
		this.initialize();
	}
	
	/**
	 * Responds to action events originating within this component.
	 * 
	 * @param e the event
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("QuoteSidebar::actionPerformed");
	}
	
	/*
	 * Initializes, configures, and lays out this component and any subcomponents.
	 */
	
	private void initialize() {
		this.setLayout(new BorderLayout(0, 7));
		this.setBorder(new EmptyBorder(25, 25, 25, 25));
		
		this.add(actionGroup, BorderLayout.NORTH);
		this.add(new JScrollPane(quoteList), BorderLayout.CENTER);
	}
}