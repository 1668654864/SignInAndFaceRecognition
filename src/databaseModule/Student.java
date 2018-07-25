package databaseModule;

/*
 * —ß…˙¿‡
 * @author: ¡ı–Ò
 */
public class Student extends Database{
	private String sname;
	private String snum;
	private Classes  sclass;
	private String sex;
	private String sid;
	
	public String getSname() {
		return sname;
	}
	
	public String getSnum() {
		return snum;
	}
	
	public Classes getSclass() {
		return sclass;
	}
	public String getSex() {
		return sex;
	}
	
	public String getSid() {
		return sid;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public void setSnum(String snum) {
		this.snum = snum;
	}
	
	public void setSclass(Classes sclass) {
		this.sclass = sclass;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void setSid(String sid) {
		this.sid = sid;
	}
}
