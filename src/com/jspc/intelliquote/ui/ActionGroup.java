package com.jspc.intelliquote.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jspc.intelliquote.constants.Utils;

public class ActionGroup extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JButton create;
	private JButton view;
	private JButton send;
	private JButton delete;
	private JTextField search;
	
	/**
	 * Creates an instance of this class.
	 */
	
	public ActionGroup() {
		super();
		
		this.create = new JButton("Create Quote");
		this.view = new JButton("View PDF");
		this.send = new JButton("Send to Customer");
		this.delete = new JButton("Delete Quote");
		this.search = new JTextField(10);
				
		this.initialize();
	}
	
	/**
	 * Responds to action events originating within this component.
	 * 
	 * @param e the event
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionGroup::actionPerformed");
	}
	
	/*
	 * Initializes, configures, and lays out this component and any subcomponents.
	 */
	
	private void initialize() {
		this.setLayout(new BorderLayout(0, 3));
		this.configureButtons();
		this.configureSearch();
		
		JPanel subgroup = new JPanel(new GridLayout(0, 3));
		subgroup.add(view);
		subgroup.add(send);
		subgroup.add(delete);
		
		this.add(create, BorderLayout.NORTH);
		this.add(subgroup, BorderLayout.CENTER);
		this.add(search, BorderLayout.SOUTH);
	}
	
	/*
	 * Configures the buttons in this component.
	 */
	
	private void configureButtons() {
		create.setPreferredSize(Utils.BTN_SIZE);
		create.setForeground(Utils.WHITE);
		create.setBackground(Utils.CREATE_BTN_BG);
		create.setFocusable(false);
		create.addActionListener(this);
		
		view.setPreferredSize(Utils.BTN_SIZE);
		view.setForeground(Utils.WHITE);
		view.setBackground(Utils.VIEW_BTN_BG);
		view.setFocusable(false);
		view.addActionListener(this);
		
		send.setPreferredSize(Utils.BTN_SIZE);
		send.setForeground(Utils.WHITE);
		send.setBackground(Utils.SEND_BTN_BG);
		send.setFocusable(false);
		send.addActionListener(this);
		
		delete.setPreferredSize(Utils.BTN_SIZE);
		delete.setForeground(Utils.WHITE);
		delete.setBackground(Utils.DELETE_BTN_BG);
		delete.setFocusable(false);
		delete.addActionListener(this);
	}
	
	/*
	 * Configures the search text field in this component.
	 */
	
	private void configureSearch() {
		search.setPreferredSize(Utils.TEXTFIELD_SIZE);
	}
}