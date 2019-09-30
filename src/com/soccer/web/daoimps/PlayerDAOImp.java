package com.soccer.web.daoimps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.soccer.web.daos.PlayerDAO;
import com.soccer.web.domains.Player;
import com.soccer.web.factory.DatabaseFactory;
import com.soccer.web.pool.Constants;

public class PlayerDAOImp implements PlayerDAO{
	private static PlayerDAOImp instance = new PlayerDAOImp(); 
	public static PlayerDAOImp getInstance() {return instance;}
	private PlayerDAOImp() {}

	@Override
	public Player selectByPlayerIdSolar(Player param) {
		Player player = new Player();
		String sql = "SELECT *\n" + 
				"FROM PLAYER\n" + 
				"WHERE PLAYER_ID LIKE ?\n" + 
				" AND SOLAR LIKE ?";
		try {
			PreparedStatement stmt = DatabaseFactory
					.creatDatabase(Constants.VENDOR)
					.getConnection()
					.prepareStatement(sql);
			stmt.setString(1, param.getPlayerId());
			stmt.setString(2, param.getSolar());
			ResultSet rs = stmt.executeQuery();
			System.out.println("glgl"+param.getPlayerId());
			while(rs.next()) {
				player = new Player();
				player.setBackNo(rs.getString("BACK_NO"));
				player.setBirthDate(rs.getString("BIRTH_DATE"));
				player.setEPlayerName(rs.getString("E_PLAYER_NAME"));
				player.setHeight(rs.getString("HEIGHT"));
				player.setJoinYear(rs.getString("JOIN_YYYY"));
				player.setNation(rs.getString("NATION"));
				player.setNickName(rs.getString("NICKNAME"));
				player.setPlayerId(rs.getString("PLAYER_ID"));
				player.setPlayerName(rs.getString("PLAYER_NAME"));
				player.setPosition(rs.getString("POSITION"));
				player.setSolar(rs.getString("SOLAR"));
				player.setTeamId(rs.getString("TEAM_ID"));
				player.setWeight(rs.getString("WEIGHT"));
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("9. 반환된 결과값: "+player);
		return player;
	}
	
	
	@Override
	public List<String> selectPositions() {
		List<String> positions = new ArrayList<>();
		try {
			String sql = "SELECT DISTINCT POSITION \n" + 
					"FROM PLAYER";
			
			ResultSet rs= DatabaseFactory
					.creatDatabase(Constants.VENDOR)
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
		List<Player> list = new ArrayList<>();
		return list;
	}

	@Override
	public List<Player> selectByTeamIdHeightPosition(Player param) {
		
		return null;
	}
	@Override
	public List<Player> selectByMany(Player param) {
		List<Player> list = new ArrayList<>();
		
		String sql="?,?";
		
		try {
			PreparedStatement stmt = DatabaseFactory.creatDatabase(Constants.VENDOR).getConnection().prepareStatement(sql);
			stmt.setString(1, param.getBackNo());
			stmt.setString(2, param.getBirthDate());
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}


}
