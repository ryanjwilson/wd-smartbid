package com.jspc.intelliquote.view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import com.jspc.intelliquote.controller.ViewManager;
import com.jspc.intelliquote.ui.EstimatesTab;

public class Dashboard extends JTabbedPane implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private ViewManager manager;
	private EstimatesTab interiorTab;
	private EstimatesTab exteriorTab;
	
	public Dashboard(ViewManager manager) {
		super(JTabbedPane.TOP);
		
		this.manager = manager;
		this.interiorTab = new EstimatesTab();
		this.exteriorTab = new EstimatesTab();
		
		this.add("Interior Estimates", interiorTab);
		this.add("Exterior Estimates", exteriorTab);
		this.setBorder(new EmptyBorder(15, 0, 0, 0));
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		Component source = (Component) e.getSource();
		
		if (source.equals(interiorTab.getDeleteButton())) {
			System.out.println("clicked delete from interior tab");
		} else if (source.equals(interiorTab.getCreateButton())) {
			System.out.println("clicked create from interior tab");
		} else if (source.equals(exteriorTab.getDeleteButton())) {
			System.out.println("clicked delete from exterior tab");
		} else if (source.equals(exteriorTab.getCreateButton())) {
			System.out.println("clicked create from exterior tab");
		} else {
			System.out.println("Unhandled command [" + source + "]");
		}
	}
}