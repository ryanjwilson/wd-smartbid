package com.jspc.smartbid.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSplitPane;

import com.jspc.smartbid.controller.ViewManager;
import com.jspc.smartbid.model.Address;
import com.jspc.smartbid.model.Customer;
import com.jspc.smartbid.ui.BidListModel;
import com.jspc.smartbid.ui.BidSidebar;
import com.jspc.smartbid.ui.ActionGroup;
import com.jspc.smartbid.ui.BidEditor;
import com.jspc.smartbid.ui.BidList;

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
		BidListModel model = new BidListModel(columns, customers);
		BidList list = new BidList(model);
		BidSidebar sidebar = new BidSidebar(manager, actionGroup, list);
		BidEditor editor = new BidEditor(manager);
		
		this.add(sidebar);
		this.add(editor);
	}
}