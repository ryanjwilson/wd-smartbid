package com.jspc.intelliquote.ui;

import javax.swing.table.AbstractTableModel;

import com.jspc.intelliquote.model.Customer;

public class QuoteListModel extends AbstractTableModel {
	private static final long serialVersionUID = 1L;
	
	private String[] columns;
	private Customer[] customers;
	
	/**
	 * Creates an instance of this class.
	 * 
	 * @param columns a list of columns for the data model
	 * @param customers a list of values for the data model
	 */
	
	public QuoteListModel(String[] columns, Customer[] customers) {
		super();
		
		this.columns = columns;
		this.customers = customers;
	}

	/**
	 * Gets the number of rows in the data model.
	 * 
	 * @return the row count
	 */
	
	@Override
	public int getRowCount() {
		return customers.length;
	}
	
	/**
	 * Gets the number of columns in the data model.
	 * 
	 * @return the column count
	 */

	@Override
	public int getColumnCount() {
		return columns.length;
	}
	
	/**
	 * Gets the value at a specified row and column.
	 * 
	 * @param rowIndex the index of the row in the table
	 * @param columnIndex the index of the column in the row
	 * @return the customer located at the specified row and column
	 */

	@Override
	public Customer getValueAt(int rowIndex, int columnIndex) {
		return customers[rowIndex];
	}
	
	/**
	 * Prevents cell editing in the table.
	 * 
	 * @param rowIndex the index of the row in the table
	 * @param columnIndex the index of the column in the row
	 * @return false
	 */
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
}