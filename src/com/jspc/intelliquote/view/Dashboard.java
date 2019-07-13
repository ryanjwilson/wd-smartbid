package com.jspc.intelliquote.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	private void initialize() {
		this.setResizeWeight(0.2);
		this.setDividerSize(0);
		
		/////// begin temporary test data
		
		String[] columns = { "Customer Information" };
		Customer[] customers = new Customer[10];
		
		for (int i = 0; i < customers.length; i++) {
			customers[i] = new Customer("John", "Doe", new Address(123, "Main", "Street", "Somewhere", "NJ", "12345"), "someone@test.com", "5555555555");
		}
		
		/////// end temporary test data
		
		QuoteSidebar sidebar = new QuoteSidebar(new ActionGroup(), new QuoteList(new QuoteListModel(columns, customers)));
		QuoteEditor editor = new QuoteEditor();
		
		this.add(sidebar);
		this.add(editor);
	}
}