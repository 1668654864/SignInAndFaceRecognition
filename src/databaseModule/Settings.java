package databaseModule;

/*
 * ���ݿ������ļ���������˻�������Ӧ�����Լ����������
 * @author: ����
 * */
class Settings {
	// ���ݿ�����
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	
	// ���ݿ�����
	// �趨�ַ���ΪUTF-8����ʹ��SSL��������ʱ��ΪGMT+8
	static final String DB_URL = "jdbc:mysql://120.79.32.6/sign_in_database"
			+ "?characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=GMT%2B8";
	
	// �˻������룬���ó��Լ���
	static final String USER = "luciano";
	static final String PASS = "passwd";
}
