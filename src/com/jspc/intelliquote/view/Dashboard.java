package com.jspc.intelliquote.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.jspc.intelliquote.controller.ViewManager;

public class Dashboard extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private ViewManager manager;
	
	public Dashboard(ViewManager manager) {
		super();
		
		this.manager = manager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}