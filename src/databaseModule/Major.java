package databaseModule;

import java.sql.*;

public class Major extends Database{
	private String mname;
	private String mnum;
	
	/*
	 * 通过Major的主码读取数据库中major表中的数据
	 * @param: num 所查询的Major的主码
	 * @return: 查询到的major，若没有相关记录，返回null
	 * @author: 刘旭
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
