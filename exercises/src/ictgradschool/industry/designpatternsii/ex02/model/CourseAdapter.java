package ictgradschool.industry.designpatternsii.ex02.model;


import javax.swing.table.AbstractTableModel;

public class CourseAdapter extends AbstractTableModel implements CourseListener  {
	/**********************************************************************
	 * YOUR CODE HERE
	 */
	private Course model;
	private final int STU_ID=0;
	private final int STU_FNAME=2;
	private final int STU_LNAME=1;
	private final int STU_EXAM=3;
	private final int STU_TEST=4;
	private final int STU_ASS=5;
	private final int STU_OVERALL=6;


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

		switch (columnIndex){
			case STU_ID:
				return model.getResultAt(rowIndex)._studentID;
			case STU_LNAME:
				return model.getResultAt(rowIndex)._studentSurname;
			case STU_FNAME:
				return model.getResultAt(rowIndex)._studentForename;
			case STU_EXAM:
				return model.getResultAt(rowIndex).getAssessmentElement(StudentResult.AssessmentElement.Exam);
			case STU_TEST:
				return model.getResultAt(rowIndex).getAssessmentElement(StudentResult.AssessmentElement.Test);
			case STU_ASS:
				return model.getResultAt(rowIndex).getAssessmentElement(StudentResult.AssessmentElement.Assignment);
			case STU_OVERALL:
				return model.getResultAt(rowIndex).getAssessmentElement(StudentResult.AssessmentElement.Overall);
		}


		return model.getResultAt(rowIndex)._studentID;
	}
}