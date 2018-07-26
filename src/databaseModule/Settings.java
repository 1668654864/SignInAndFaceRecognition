package databaseModule;

/*
 * 数据库配置文件，里面的账户和密码应根据自己的情况配置
 * @author: 刘旭
 * */
class Settings {
	// 数据库驱动
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	
	// 数据库链接
	// 设定字符集为UTF-8，不使用SSL，服务器时区为GMT+8
	static final String DB_URL = "jdbc:mysql://120.79.32.6/sign_in_database"
			+ "?characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=GMT%2B8";
	
	// 账户和密码，设置成自己的
	static final String USER = "luciano";
	static final String PASS = "passwd";
}
