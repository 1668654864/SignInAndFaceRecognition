package databaseModule;

import java.sql.*;

/*
 * �������ݿ��ĸ���
 * @author: ����
 */
public abstract class Database {
	/*
	 * ��ȡ���ݿ�����
	 * @return: ���ݿ����ӣ����������ݿ�ʧ�ܣ�����ֵΪnull
	 * @author: ����
	 */
	static Connection getConection() {
		Connection conn = null;
		try {
			System.out.println("Loading JDBC Driver: " + Settings.JDBC_DRIVER);
			// ��̬�������ݿ�����
			Class.forName(Settings.JDBC_DRIVER);
			System.out.println("Connecting to database...");
			// �������ݿ�
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