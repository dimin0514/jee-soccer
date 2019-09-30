package com.soccer.web.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.soccer.web.enums.DBUrl;
import com.soccer.web.pool.Constants;

public class ConnTest {
		public static void main(String[] args) {
			Connection conn = null;       //전부 공유중...
			Statement stmt = null;
			ResultSet rs = null;
			//String url="jdbc:oracle:thin:@localhost:1521:xe",
			//		username = "c##bit",
			//		password = "oracle";
			
			try{
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection(DBUrl.ORACLE_URL.toString(),Constants.USERNAME,Constants.PASSWORD);
				if(conn != null) {
					System.out.println("연결성공");
					stmt = conn.createStatement(); // 스테이트먼트 한장 만들어라
					rs = stmt.executeQuery("SELECT \r\n" + 
							"    T.TEAM_NAME 소속팀, P.*\r\n" + 
							"FROM (SELECT \r\n" + 
							"    TEAM_ID,\r\n" + 
							"    POSITION 포지션, \r\n" + 
							"    BACK_NO 백넘버, \r\n" + 
							"    PLAYER_NAME 선수명,\r\n" + 
							"    HEIGHT 키\r\n" + 
							"    FROM PLAYER \r\n" + 
							"    WHERE TEAM_ID IN ('K07','K08','K09') \r\n" + 
							"        AND POSITION IN ('GK','MF') )P \r\n" + 
							"    JOIN TEAM T\r\n" + 
							"        ON P.TEAM_ID = T.TEAM_ID");
					List<String> list=new ArrayList<>();;
					while(rs.next()) {
				
						list.add(rs.getString("선수명"));
						
					}
					System.out.println("선수들의 수 : "+list);
				}else {
					System.out.println("연결실패");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}

}
