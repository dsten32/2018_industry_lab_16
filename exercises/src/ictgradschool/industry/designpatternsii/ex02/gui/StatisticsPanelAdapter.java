package ictgradschool.industry.designpatternsii.ex02.gui;

import ictgradschool.industry.designpatternsii.ex02.model.Course;
import ictgradschool.industry.designpatternsii.ex02.model.CourseListener;

import javax.swing.table.AbstractTableModel;
import java.awt.event.ComponentListener;

public class StatisticsPanelAdapter extends AbstractTableModel implements CourseListener {


	/**********************************************************************
	 * YOUR CODE HERE
	 */
	StatisticsPanel panel;

	public void setCourse(Course course) {
		this.course = course;
		course.addCourseListener(this);
	}

	Course course;

	public  StatisticsPanelAdapter(StatisticsPanel panel){
		this.panel=panel;
	}

	@Override
	public void courseHasChanged(Course course) {
		panel.repaint();
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
