package com.jspc.smartbid.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.jspc.smartbid.controller.ViewManager;

public class BidEditor extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private ViewManager manager;

	/**
	 * Creates an instance of this class.
	 */
	
	public BidEditor(ViewManager manager) {
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
		System.out.println("BidEditor::actionPerformed");
		
		manager.placeholder();
	}
	
	private void initialize() {
		this.add(new JLabel("Placeholder for BidEditor component."));
	}
}