package Association.OneToOne;

public class Course {
	private String Department;
	private String CourseId;
	private String CourseName;
	private String Term;

	public Course(String department, String courseId, String courseName, String term) {
		super();
		Department = department;
		CourseId = courseId;
		CourseName = courseName;
		Term = term;
	}

	// Association
	Student student;

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getCourseId() {
		return CourseId;
	}

	public void setCourseId(String courseId) {
		CourseId = courseId;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public String getTerm() {
		return Term;
	}

	public void setTerm(String term) {
		Term = term;
	}

}
