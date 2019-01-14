package ictgradschool.industry.designpatternsii.ex02.model;


import javax.swing.table.AbstractTableModel;

public class CourseAdapter extends AbstractTableModel implements CourseListener  {
	/**********************************************************************
	 * YOUR CODE HERE
	 */
	private Course model;

	//create a new course adapter that sets the course model
	// it has ben given and adds the courselistener via the
	// course method "addCourseListener()"
	public CourseAdapter(Course model) {
		this.model = model;
		model.addCourseListener(this);
	}

	//just calls the fireTableDataChanged method so the table knows to update
	@Override
	public void courseHasChanged(Course course) {
		fireTableDataChanged();
	}

	//gets the size of the model (ie #of student objects contained)
	// to set as the num of table rows
	@Override
	public int getRowCount() {
		return model.size();
	}

	//can see any way to determine how many columns to add that is robust.
	// just going to hardwire as 7 for each student variable.
	@Override
	public int getColumnCount() {
		return 7;
	}

	//set to return the result from the student object in the current row(??)
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return model.getResultAt(rowIndex);
	}
}