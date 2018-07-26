package databaseModule;

import java.sql.*;

public class Test {
	public static void main(String args[]) throws Exception{
		Connection conn = Database.getConection();
		System.out.println("Createing statement...");
		Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT tname, tnum, tsex FROM teacher";
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
