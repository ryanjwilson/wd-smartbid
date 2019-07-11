package com.jspc.intelliquote.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ActionGroup extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JTextField searchField;
	private JButton createButton, deleteButton;
	
	/**
	 * Constructs an instance of the @ActionGroup class.
	 */
	
	public ActionGroup() {
		super(new BorderLayout());
		
		this.searchField = new JTextField(50);
		this.createButton = new JButton("New");
		this.deleteButton = new JButton("Delete");
		
		this.initialize();
	}
	
	/*
	 * Dispatches an @ActionEvent to the parent class.
	 * 
	 * @param e the @ActionEvent to be dispatched
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		((ActionListener) this.getParent()).actionPerformed(e);		// dispatch event to parent
	}
	
	/**
	 * Gets the search text field.
	 * 
	 * @return the search text field of this component
	 */
	
	public JTextField getSearchField() {
		return searchField;
	}
	
	/**
	 * Gets the create button.
	 * 
	 * @return the create button of this component
	 */
	
	public JButton getCreateButton() {
		return createButton;
	}
	
	/**
	 * Gets the delete button.
	 * 
	 * @return the delete button of this component
	 */
	
	public JButton getDeleteButton() {
		return deleteButton;
	}
	
	/*
	 * Initializes and configures this component and any subcomponents.
	 */
	
	private void initialize() {		
		JPanel buttons = new JPanel(new GridLayout(0, 2));
		buttons.add(deleteButton);
		buttons.add(createButton);
		
		searchField.addActionListener(this);
		createButton.addActionListener(this);
		deleteButton.addActionListener(this);
		
		this.add(searchField, BorderLayout.WEST);
		this.add(buttons, BorderLayout.EAST);
		this.setBorder(new EmptyBorder(10, 5, 10, 5));
	}
}