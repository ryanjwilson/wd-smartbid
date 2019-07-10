package com.jspc.intelliquote;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import com.jspc.intelliquote.controller.ViewManager;
import com.jspc.intelliquote.view.Dashboard;
import com.jspc.intelliquote.view.ExteriorEstimate;
import com.jspc.intelliquote.view.InteriorEstimate;

public class IntelliQuote extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public static final String DASHBOARD = "DASHBAORD";
	public static final String INTERIOR = "INTERIOR ESTIMATE";
	public static final String EXTERIOR = "EXTERIOR ESTIMATE";
	
	
	/**
	 * Constructs an instance of the @IntelliQuote class.
	 */
	
	public IntelliQuote() {
		super();
		
		this.setTitle("J&S Painting Contractors");
	}
	
	/**
	 * Creates, configures, and adds individual views to the UI window.
	 */
	
	public void createAndShowGUI() {
		JPanel views = new JPanel(new CardLayout());
		ViewManager manager = new ViewManager(views);
		
		// add child views to the parent container
		
		views.add(new Dashboard(manager), DASHBOARD);
		views.add(new InteriorEstimate(manager), INTERIOR);
		views.add(new ExteriorEstimate(manager), EXTERIOR);
		
		// configure the application frame
		
		this.add(views);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	/**
	 * Program execution begins and ends here.
	 * 
	 * @param args command line arguments (ignored)
	 */
	
	public static void main(String[] args) {
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".contentEquals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
			try {
				UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			} catch (Exception ex) {
				UIManager.getSystemLookAndFeelClassName();
			}
		}
		
		new IntelliQuote().createAndShowGUI();
	}
}