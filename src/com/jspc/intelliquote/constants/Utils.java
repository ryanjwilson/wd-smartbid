package com.jspc.intelliquote.constants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class Utils {
	
	/*
	 * Colors.
	 */
	
	public static final Color WHITE = new Color(255, 255, 255);
	public static final Color DARK_GREEN = new Color(18, 55, 34);
	public static final Color LIGHT_GRAY = new Color(229, 229, 229);
	public static final Color DARK_GRAY = new Color(35, 35, 35);
	public static final Color DARK_BLUE = new Color(4, 33,79);
	public static final Color DARK_RED = new Color(152, 0, 0);
	public static final Color DARK_TBL_BG = LIGHT_GRAY;
	public static final Color LIGHT_TBL_BG = WHITE;
	public static final Color SELECTED_TBL_BG = DARK_GRAY;
	public static final Color CREATE_BTN_BG = DARK_GREEN;
	public static final Color VIEW_BTN_BG = DARK_GRAY;
	public static final Color SEND_BTN_BG = DARK_BLUE;
	public static final Color DELETE_BTN_BG = DARK_RED;
	
	/*
	 * Button and text field sizes.
	 */
	
	public static final Dimension BTN_SIZE = new Dimension(0, 40);
	public static final Dimension TEXTFIELD_SIZE = new Dimension(0, 40);
	
	/*
	 * Fonts.
	 */
	
	public static final Font TBL_TITLE = new Font("Verdana", Font.BOLD, 14);
	public static final Font TBL_SUBTITLE = new Font("Verdana", Font.PLAIN, 12);
	
	/*
	 * View identifiers.
	 */
	
	public static final String DASHBOARD_VIEW = "Dashboard";
	public static final String INTERIOR_VIEW = "Interior Estimate";
	public static final String EXTERIOR_VIEW = "Exterior Estimate";	
}