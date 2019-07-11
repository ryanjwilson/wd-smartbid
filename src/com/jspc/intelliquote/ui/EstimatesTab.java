package com.jspc.intelliquote.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EstimatesTab extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private IntelliQuoteTable table;
	private JScrollPane scrollPane;
	private ActionGroup actionGroup;
	
	private String[] columns = {
		"Customer",
		"Address",
		"Email",
		"Phone",
		"Status",
		"Last Modified"
	};
	
	/**
	 * Constructs an instance of the @InteriorTab class.
	 */
	
	public EstimatesTab() {
		super(new BorderLayout());
		
		String[][] data = new String[100][columns.length];
		for (int i = 0; i < data.length; i++) {
			data[i] = new String[] {
				"Last, First", "123 Main St., Somewhere, NJ 07065", "someone@test.com", "(555) 555-5555", "Pending", "Jul 10, 2019, at 11:37pm"
			};
		}
		
		this.table = new IntelliQuoteTable(data, columns);
		this.scrollPane = new JScrollPane(this.table);
		this.actionGroup = new ActionGroup();

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
	 * Gets the table.
	 * 
	 * @return the table of this component
	 */
	
	public IntelliQuoteTable getTable() {
		return table;
	}
	
	/**
	 * Gets the scroll pane.
	 * 
	 * @return the scroll pane of this component
	 */
	
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	
	/**
	 * Gets the search field.
	 * 
	 * @return the search field of this component's @ActionGroup
	 */
	
	public JTextField getSearchField() {
		return actionGroup.getSearchField();
	}
	
	/**
	 * Gets the create button.
	 * 
	 * @return the create button of this component's @ActionGroup
	 */
	
	public JButton getCreateButton() {
		return actionGroup.getCreateButton();
	}
	
	/**
	 * Gets the delete button.
	 * 
	 * @return the delete button of this component's @ActionGroup
	 */
	
	public JButton getDeleteButton() {
		return actionGroup.getDeleteButton();
	}
	
	/*
	 * Initializes and configures this component and any subcomponents.
	 */
	
	private void initialize() {
		this.add(actionGroup, BorderLayout.NORTH);
		this.add(scrollPane, BorderLayout.CENTER);
		this.setBorder(new EmptyBorder(0, 25, 25, 25));
	}
}