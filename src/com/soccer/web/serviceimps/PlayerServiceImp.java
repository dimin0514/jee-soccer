package com.soccer.web.serviceimps;

import java.util.List;

import com.soccer.web.daoimps.PlayerDAOImp;
import com.soccer.web.daos.PlayerDAO;
import com.soccer.web.domains.Player;
import com.soccer.web.services.PlayerService;

public class PlayerServiceImp implements PlayerService{
//	private PlayerDAO dao;
	//public PlayerServiceImp() {
		//dao = new PlayerDAOImp(); 
	//}
	
	private static PlayerServiceImp instance = new PlayerServiceImp();
	

	public static PlayerServiceImp getInstance() {
		return instance;
	}  //하나만 사용가능해서 set 이 필요가 없고 get 만 있으면 된다.!!

//	public static void setInstance(PlayerServiceImp instance) {
	//	PlayerServiceImp.instance = instance;
	//} 셋은 지움
	private PlayerServiceImp() {  //고정값이라서 private ?
	}

	@Override
	public List<String> findPositions() {
		//PlayerDAO dao=new PlayerDAOImp(); 반복사용되니깐 위로 빼고 생성자에다가~~
		//List<String> positions= PlayerDAOImp.getInstance().selectPositions();
		return PlayerDAOImp.getInstance().selectPositions();
	}

	@Override
	public List<Player> findByTeamIdPosition(Player param) {
		//PlayerDAO dao = new PlayerDAOImp();
		List<Player> players = PlayerDAOImp.getInstance().selectByTeamIdPosition();
		return players;
	}
	
	@Override
	public List<Player> findByTeamIdHeightPosition(Player param) {
		//PlayerDAO dao = new PlayerDAOImp();
		List<Player> players = PlayerDAOImp.getInstance().selectByTeamIdHeightPosition();
		return players;
	}

}
