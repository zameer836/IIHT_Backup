package sort;

public class CourseData {
	private int courseId;
	private String courseName;
	private  String courseTeacher;
	private int duration;
	private int fees;
	
	public CourseData(int courseId, String courseName, String courseTeacher, int duration, int fees) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseTeacher = courseTeacher;
		this.duration = duration;
		this.fees = fees;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseTeacher() {
		return courseTeacher;
	}

	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "CourseData [courseId=" + courseId + ", courseName=" + courseName + ", courseTeacher=" + courseTeacher
				+ ", duration=" + duration + ", fees=" + fees + "]"+"\n";
	}
	
	
	

}