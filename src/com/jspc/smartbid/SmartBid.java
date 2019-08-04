package com.jspc.smartbid;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import com.jspc.smartbid.controller.ViewManager;
import com.jspc.smartbid.view.Dashboard;

public class SmartBid extends JFrame {
	private static final long serialVersionUID = 1L;
		
	/*
	 * Creates and shows the application window and its subcomponents.
	 */
	
	private void createAndShowGUI() {
		JPanel views = new JPanel(new CardLayout());
		ViewManager manager = new ViewManager(views);
		
		// add child views to the parent container
		
//		views.add(new Dashboard(manager), Utils.DASHBOARD_VIEW);
//		views.add(new Settings(manager), Utils.SETTINGS_VIEW);
		
		// configure the application frame
		
//		this.add(views);
		this.add(new Dashboard(manager));
		this.setTitle("J&S Painting Contractors");
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
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SmartBid().createAndShowGUI();
			}
		});		
	}
}