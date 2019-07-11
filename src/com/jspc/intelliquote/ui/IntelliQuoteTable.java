package com.jspc.intelliquote.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class IntelliQuoteTable extends JTable {
	private static final long serialVersionUID = 1L;
	
	private final Color DARK = new Color(176,196,222);
	private final Color LIGHT = new Color(255, 255, 255);
	private final Color BORDER = Color.BLACK;
	
	/**
	 * Constructs an instance of the @IntelliQuoteTable class.
	 * 
	 * @param data the data with which to populate the table
	 * @param columns the column headers of the table
	 */
	
	public IntelliQuoteTable(Object[][] data, Object[] columns) {
		super(data, columns);
		
		this.setShowGrid(true);
		this.setRowHeight(30);
		this.setFillsViewportHeight(true);
	}
	
	/**
	 * Paints the @IntelliQuoteTable component.
	 * 
	 * @param g a graphics object for painting
	 */
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		this.paintEmptyRows(g);
	}
	
	/**
	 * Prepares the rendered based on the underlying data model and component selection state.
	 * 
	 * @param renderer the @TableCellRenderer to prepare
	 * @param row the row of the cell to render
	 * @param column the column of the cell to render
	 * @return the @Component under the event location
	 */
	
	@Override
	public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
		final Component c = super.prepareRenderer(renderer, row, column);
		
		if (!this.isRowSelected(row)) {
			c.setBackground(row % 2 == 0 ? DARK : LIGHT);
		}
		
		return c;
	}
	
	/*
	 * Paints row and column grid lines, as well as striped background for empty table rows.
	 * 
	 * @param g graphics object for painting
	 */
	
	private void paintEmptyRows(Graphics g) {
		Graphics graphics = g.create();
		Rectangle row = this.getCellRect(this.getRowCount() - 1, 0, true);

		
		if (this.getVisibleRect().height > row.y) {
			int emptyRow = (row.y - 1) + this.getRowHeight();
			int actualRow = this.getRowCount() - 1;
			int xCoordinate = 0;
			
			// paint striped background and row grid lines for empty rows
						
			while (emptyRow < this.getHeight()) {
				graphics.setColor(actualRow % 2 == 0 ? LIGHT : DARK);
				graphics.fillRect(0, emptyRow, this.getWidth(), this.getRowHeight());
				
				graphics.setColor(BORDER);
				graphics.drawLine(0, emptyRow, this.getWidth(), emptyRow);
				
				emptyRow = emptyRow + this.getRowHeight();
				actualRow++;
			}
			emptyRow = (row.y - 1) + this.getRowHeight();
			
			// paint column grid lines for empty rows
			
			for (int i = 0; i < this.getColumnCount(); i++) {
				TableColumn column = this.getColumnModel().getColumn(i);
				xCoordinate = xCoordinate + column.getWidth();
				graphics.drawLine(xCoordinate - 1, emptyRow, xCoordinate - 1, this.getHeight());
			}
		}
	}
}