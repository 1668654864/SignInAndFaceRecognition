package databaseModule;

public class Classes extends Database{
	private int cname;
	private String cnum;
	private Major cmajor;
	public int getCname() {
		return cname;
	}
	public String getCnum() {
		return cnum;
	}
	public Major getCmajor() {
		return cmajor;
	}
	public void setCname(int cname) {
		this.cname = cname;
	}
	public void setCnum(String cnum) {
		this.cnum = cnum;
	}
	public void setCmajor(Major cmajor) {
		this.cmajor = cmajor;
	}
}
