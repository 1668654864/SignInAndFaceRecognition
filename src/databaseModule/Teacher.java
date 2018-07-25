package databaseModule;

public class Teacher extends Database {
	private String tname;
	private String tnum;
	private String tsex;
	public String getTname() {
		return tname;
	}
	public String getTnum() {
		return tnum;
	}
	public String getTsex() {
		return tsex;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public void setTnum(String tnum) {
		this.tnum = tnum;
	}
	public void setTsex(String tsex) {
		this.tsex = tsex;
	}
}
