package com.jspc.intelliquote.ui;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;

import com.jspc.intelliquote.constants.Utils;
import com.jspc.intelliquote.model.Customer;

public class QuoteList extends JTable implements TableCellRenderer {
	private static final long serialVersionUID = 1L;
			
	/**
	 * Creates an instance of this class.
	 * 
	 * @param model the underlying data model for this table
	 */
		
	public QuoteList(QuoteListModel model) {
		super(model);
		
		this.initialize();
	}
	
	/**
	 * Paints one or more rows, columns, or cells of this table.
	 * 
	 * @param g a graphics object for painting
	 */
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		this.paintEmptyRows(g);
	}
	
	/**
	 * Renders non-selected table rows with alternating background colors.
	 * 
	 * @param renderer the TableCellRenderer to prepare
	 * @param row the row of the table to render
	 * @param column the column of the row to render
	 * @return the rendered table row
	 */
	
	@Override
	public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
		final Component c = super.prepareRenderer(renderer, row, column);
		
		if (!this.isRowSelected(row)) {
			c.setBackground(row % 2 == 0 ? Utils.LIGHT_TBL_BG : Utils.DARK_TBL_BG);		// alternate background colors
		} else {
			c.setBackground(Utils.SELECTED_TBL_BG);
		}
		
		return c;
	}
	
	/**
	 * Provides a customer rendering for each cell in this table.
	 * 
	 * @param table the table in which to render the component
	 * @param value the value from the underlying table model
	 * @param isSelected whether or not the cell is selected
	 * @param hasFocus whether or not the cell has focus
	 * @param row the row of the table being rendered
	 * @param column the column of the row being rendered
	 * @return the component to be rendered
	 */
	
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		Customer customer = (Customer) value;
				
		JLabel title = new JLabel(customer.getFormattedName());
		JLabel subtitle = new JLabel(customer.getAddress().format());
		Border margin = new EmptyBorder(0, 10, 0, 0);
		
		title.setBorder(margin);
		title.setFont(Utils.TBL_TITLE);
		
		subtitle.setBorder(margin);
		subtitle.setFont(Utils.TBL_SUBTITLE);
		
		if (isSelected) {
			title.setBackground(Utils.SELECTED_TBL_BG);
			title.setForeground(Utils.WHITE);
			
			subtitle.setBackground(Utils.SELECTED_TBL_BG);
			subtitle.setForeground(Utils.WHITE);
		}
		
		GridLayout cellLayout = new GridLayout(2, 0);
		cellLayout.setVgap(-10);
		
		JPanel cell = new JPanel(cellLayout);
		cell.add(title);
		cell.add(subtitle);
		
		return cell;
	}
	
	/*
	 * Initializes, configures, and lays out this component and any subcomponents.
	 */
	
	private void initialize() {
		this.setRowHeight(50);
		this.setFillsViewportHeight(true);
		this.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.setTableHeader(null);
		this.setDefaultRenderer(Object.class, this);
	}
	
	/*
	 * Paints alternating background colors for empty table rows.
	 * 
	 * @param g graphics object for painting
	 */
	
	private void paintEmptyRows(Graphics g) {
		Graphics graphics = g.create();
		Rectangle emptyRow = this.getCellRect(this.getRowCount() - 1, 0, true);
		
		if (this.getVisibleRect().height > emptyRow.y) {
			int row = (emptyRow.y - 1) + this.getRowHeight();
			int actualRow = this.getRowCount() - 1;
			
			// alternate background colors for empty rows
									
			while (row < this.getHeight()) {				
				graphics.setColor(actualRow % 2 == 0 ? Utils.DARK_TBL_BG : Utils.LIGHT_TBL_BG);
				graphics.fillRect(0, row, this.getWidth(), this.getHeight());
				
				row = row + this.getRowHeight();
				actualRow = actualRow + 1;
			}
		}
	}
}