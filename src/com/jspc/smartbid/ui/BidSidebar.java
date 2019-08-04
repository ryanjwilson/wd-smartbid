package com.jspc.smartbid.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import com.jspc.smartbid.controller.ViewManager;

public class BidSidebar extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	private ViewManager manager;
	private ActionGroup actionGroup;
	private BidList bidList;
	
	/**
	 * Creates an instance of this class.
	 * 
	 * @param actionGroup the button group for manipulating records
	 * @param bideList the list of records to be rendered
	 */
	
	public BidSidebar(ViewManager manager, ActionGroup actionGroup, BidList bidList) {
		super();
		
		this.manager = manager;
		this.actionGroup = actionGroup;
		this.bidList = bidList;
		
		this.initialize();
	}
	
	/**
	 * Responds to action events originating within this component.
	 * 
	 * @param e the event
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("BidSidebar::actionPerformed");
		
		manager.placeholder();
	}
	
	/*
	 * Initializes, configures, and lays out this component and any subcomponents.
	 */
	
	private void initialize() {
		this.setLayout(new BorderLayout(0, 7));
		this.setBorder(new EmptyBorder(25, 25, 25, 25));
		
		this.add(actionGroup, BorderLayout.NORTH);
		this.add(new JScrollPane(bidList), BorderLayout.CENTER);
	}
}