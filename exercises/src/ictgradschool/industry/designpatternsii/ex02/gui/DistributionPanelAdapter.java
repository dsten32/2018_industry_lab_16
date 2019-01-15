package ictgradschool.industry.designpatternsii.ex02.gui;

import ictgradschool.industry.designpatternsii.ex02.model.Course;
import ictgradschool.industry.designpatternsii.ex02.model.CourseListener;

import javax.swing.table.AbstractTableModel;

public class DistributionPanelAdapter implements CourseListener {
    /**********************************************************************
     * YOUR CODE HERE
     */
  DistributionPanel panel;
    Course course;

    public void setCourse(Course course) {
        this.course = course;
        course.addCourseListener(this);
    }



  public DistributionPanelAdapter(DistributionPanel panel, Course course){
      this.panel=panel;
      course.addCourseListener(this);
  }

    @Override
    public void courseHasChanged(Course course) {
        panel.repaint();
    }


}
