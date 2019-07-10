package com.jspc.intelliquote.controller;

import java.awt.CardLayout;
import java.awt.Container;

public class ViewManager {
	
	private Container views;
	
	/**
	 * Constructs an instance of the @ViewManager class.
	 * 
	 * @param views the views the @ViewManager will manage
	 */
	
	public ViewManager(Container views) {
		this.views = views;
	}
	
	/**
	 * Switches the currently visible view.
	 * 
	 * @param view the view to be made visible
	 */
	
	public void switchTo(String view) {
		((CardLayout) views.getLayout()).show(views, view);
	}
}