package databaseModule;

public class Arrange extends Database {
	private int aid;
	private Course acourse;
	private int aweek;
	private int aday;
	private int atime;
	public int getAid() {
		return aid;
	}
	public Course getAcourse() {
		return acourse;
	}
	public int getAweek() {
		return aweek;
	}
	public int getAday() {
		return aday;
	}
	public int getAtime() {
		return atime;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public void setAcourse(Course acourse) {
		this.acourse = acourse;
	}
	public void setAweek(int aweek) {
		this.aweek = aweek;
	}
	public void setAday(int aday) {
		this.aday = aday;
	}
	public void setAtime(int atime) {
		this.atime = atime;
	}
}
