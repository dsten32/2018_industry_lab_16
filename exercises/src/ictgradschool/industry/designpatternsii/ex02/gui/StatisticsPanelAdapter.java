package ictgradschool.industry.designpatternsii.ex02.gui;

import ictgradschool.industry.designpatternsii.ex02.model.Course;
import ictgradschool.industry.designpatternsii.ex02.model.CourseListener;

import javax.swing.table.AbstractTableModel;

public class StatisticsPanelAdapter extends AbstractTableModel implements CourseListener {
	/**********************************************************************
	 * YOUR CODE HERE
	 */
	@Override
	public void courseHasChanged(Course course) {
		fireTableDataChanged();
	}


	@Override
	public int getRowCount() {
		return 1;
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		return null;
	}
}
