package com.soccer.web.daoimps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.soccer.web.daos.PlayerDAO;
import com.soccer.web.domains.Player;
import com.soccer.web.factory.DatabaseFactory;
import com.soccer.web.pool.Constants;

public class PlayerDAOImp implements PlayerDAO{
	private static PlayerDAOImp instance = new PlayerDAOImp(); 
	private static Connection conn;       //전부 공유중...
	public static PlayerDAOImp getInstance() {return instance;}
	private PlayerDAOImp() {}

	@Override
	public List<String> selectPositions() {
		List<String> positions = new ArrayList<>();
		try {
			String sql = "SELECT DISTINCT POSITION \n" + 
					"FROM PLAYER";
			
			ResultSet rs= DatabaseFactory
					.creatDatabase(Constants.VENDER)
					.getConnection()
					.prepareStatement(sql)
					.executeQuery();
			
			while(rs.next()){
				positions.add(rs.getString("position"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return positions;
	}

	@Override
	public List<Player> selectByTeamIdPosition() {
		
		return null;
	}

	@Override
	public List<Player> selectByTeamIdHeightPosition() {
		
		return null;
	}

}
