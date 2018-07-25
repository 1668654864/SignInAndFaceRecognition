package databaseModule;

import java.sql.*;

public class Test {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/sign_in_database?"
			+ "characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT%2B8";
	static final String USER = "root";
	static final String PASS = "passwd";
	public static void main(String args[]) throws Exception{
		Class.forName(JDBC_DRIVER);
		System.out.println("Connecting to database");
		Connection conn = null;
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		System.out.println("Createing statement...");
		Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT Tname, Tnum, Tsex FROM Teacher";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			String name = rs.getString("tname");
			String num  = rs.getString("tnum");
			String sex  = rs.getString("tsex");
			System.out.println("Name: " + name);
			System.out.println("Num : " + num);
			System.out.println("Sex : " + sex);
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
