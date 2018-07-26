package databaseModule;

import java.sql.*;

/*
 * 所有数据库表的父类
 * @author: 刘旭
 */
public abstract class Database {
	/*
	 * 获取数据库连接
	 * @return: 数据库连接，若连接数据库失败，返回值为null
	 * @author: 刘旭
	 */
	static Connection getConection() {
		Connection conn = null;
		try {
			System.out.println("Loading JDBC Driver: " + Settings.JDBC_DRIVER);
			// 动态载入数据库驱动
			Class.forName(Settings.JDBC_DRIVER);
			System.out.println("Connecting to database...");
			// 连接数据库
			conn = DriverManager.getConnection(Settings.DB_URL, Settings.USER, Settings.PASS);
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load JDBC Driver");
			e.printStackTrace();
		} catch (SQLException se) {
			System.out.println("Failed to connect to database");
		}
		return conn;
	}
}