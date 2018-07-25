package databaseModule;

public class SignIn extends Database {
	private Course garrange;
	private Student gstudent;
	public Course getGarrange() {
		return garrange;
	}
	public Student getGstudent() {
		return gstudent;
	}
	public void setGarrange(Course garrange) {
		this.garrange = garrange;
	}
	public void setGstudent(Student gstudent) {
		this.gstudent = gstudent;
	}
}
