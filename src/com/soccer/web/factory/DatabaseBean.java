package com.soccer.web.factory;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

import lombok.Data;

@Data
public class DatabaseBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String url, userid, password,dirver;
	private Connection conn;
	
	
	public DatabaseBean(String driver,String url, String userid, String password) {
		this.url = url;
		this.userid=userid;
		this.password = password;
		this.dirver=driver;
		
	}
	public Connection getConnection() {
		//Connection conn = null; 지워버려야 계속 유지되면서 사용됨.
		try {
			Class.forName(dirver);
			conn = DriverManager.getConnection(url,userid,password);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
