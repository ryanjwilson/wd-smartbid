package com.jspc.intelliquote.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSplitPane;

import com.jspc.intelliquote.controller.ViewManager;
import com.jspc.intelliquote.model.Address;
import com.jspc.intelliquote.model.Customer;
import com.jspc.intelliquote.ui.QuoteListModel;
import com.jspc.intelliquote.ui.QuoteSidebar;
import com.jspc.intelliquote.ui.ActionGroup;
import com.jspc.intelliquote.ui.QuoteEditor;
import com.jspc.intelliquote.ui.QuoteList;

public class Dashboard extends JSplitPane implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private ViewManager manager;
	
	/**
	 * Creates an instance of this class.
	 * 
	 * @param manager the controller managing this view
	 */
	
	public Dashboard(ViewManager manager) {
		super(JSplitPane.HORIZONTAL_SPLIT);
		
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
		System.out.println("Dashboard::actionPerformed");
		
		manager.placeholder();
	}
	
	/*
	 * Initializes, configures, and lays out this component and any subcomponents.
	 */
	
	private void initialize() {
		this.setResizeWeight(0.1);
		this.setDividerSize(0);
		
		/////// begin temporary test data
		
		String[] columns = { "Customer Information" };
		Customer[] customers = new Customer[10];
		
		for (int i = 0; i < customers.length; i++) {
			customers[i] = new Customer("John", "Doe", new Address(123, "Main", "Street", "Somewhere", "NJ", "12345"), "someone@test.com", "5555555555");
		}
		
		/////// end temporary test data
		
		ActionGroup actionGroup = new ActionGroup(manager);
		QuoteListModel model = new QuoteListModel(columns, customers);
		QuoteList list = new QuoteList(model);
		QuoteSidebar sidebar = new QuoteSidebar(manager, actionGroup, list);
		QuoteEditor editor = new QuoteEditor(manager);
		
		this.add(sidebar);
		this.add(editor);
	}
}