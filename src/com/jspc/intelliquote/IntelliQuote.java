package com.jspc.intelliquote;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class IntelliQuote extends JFrame {
	private static final long serialVersionUID = 1L;

	public IntelliQuote() {
		super();
		
	}
	
	public void createAndShowGUI() {
		
	}
	
	/**
	 * Program execution begins and ends here.
	 * 
	 * @param args command line arguments
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