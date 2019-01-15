package ictgradschool.industry.designpatternsii.ex02.gui;

import ictgradschool.industry.designpatternsii.ex02.model.Course;
import ictgradschool.industry.designpatternsii.ex02.model.CourseListener;

import javax.swing.table.AbstractTableModel;
import java.awt.event.ComponentListener;

public class StatisticsPanelAdapter implements CourseListener {


	/**********************************************************************
	 * YOUR CODE HERE
	 */
	StatisticsPanel panel;

	public void setCourse(Course course) {
		this.course = course;

	}

	Course course;

	public  StatisticsPanelAdapter(StatisticsPanel panel,Course course){
		this.panel=panel;
		course.addCourseListener(this);
	}

	@Override
	public void courseHasChanged(Course course) {
		panel.repaint();
	}



}
