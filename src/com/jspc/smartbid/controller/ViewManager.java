package com.jspc.smartbid.controller;

import java.awt.CardLayout;
import java.awt.Container;

public class ViewManager {
	
	private Container views;
	
	/**
	 * Constructs an instance of the @ViewManager class.
	 * 
	 * @param views the collection of views to manage
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
	
	/**
	 * Placeholder controller action triggered by views.
	 */
	
	public void placeholder() {
		System.out.println("ViewManager::placeholder");
	}
}