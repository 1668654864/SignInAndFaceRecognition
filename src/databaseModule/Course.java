package databaseModule;

public class Course extends Database {
	private String rname;
	private String rnum;
	private Classes rclass;
	private Teacher rteacher;
	private int rsign;
	public String getRname() {
		return rname;
	}
	public String getRnum() {
		return rnum;
	}
	public Classes getRclass() {
		return rclass;
	}
	public Teacher getRteacher() {
		return rteacher;
	}
	public int getRsign() {
		return rsign;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public void setRnum(String rnum) {
		this.rnum = rnum;
	}
	public void setRclass(Classes rclass) {
		this.rclass = rclass;
	}
	public void setRteacher(Teacher rteacher) {
		this.rteacher = rteacher;
	}
	public void setRsign(int rsign) {
		this.rsign = rsign;
	}
}
