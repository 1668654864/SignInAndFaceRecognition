package databaseModule;

import java.sql.*;

public class Major extends Database{
	private String mname;
	private String mnum;
	
	/*
	 * ͨ��Major�������ȡ���ݿ���major���е�����
	 * @param: num ����ѯ��Major������
	 * @return: ��ѯ����major����û����ؼ�¼������null
	 * @author: ����
	 */
	public Major getMajorByPrimaryKey(String num) {
		Major maj = null;
		try {
			Connection conn = getConection();
			System.out.println("Createing statement...");
			Statement stmt = conn.createStatement();
			String sql;
			sql = String.format("SELECT mname, mnum FROM major WHERE mnum = %s;", num);
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				maj = new Major();
				maj.mname = rs.getString("mname");
				maj.mnum  = rs.getString("mnum");
			}
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println("Failed to query database");
			se.printStackTrace();
		}
		return maj;
	}
	
	public String getMname() {
		return mname;
	}
	public String getMnum() {
		return mnum;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public void setMnum(String mnum) {
		this.mnum = mnum;
	}
}
