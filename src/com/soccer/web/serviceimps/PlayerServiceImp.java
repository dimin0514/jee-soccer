package com.soccer.web.serviceimps;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

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
	public boolean join(Player param) {
		return PlayerDAOImp.getInstance().insertPlayer(param);
		
	}
	
	@Override
	public Player login(Player param) {
		System.out.println("★★★ 6. PlayerServiceImpl 의 login() 으로 이동 ★★★ ");
		System.out.println(String.format("param 값 출력 : %s, %s ",
				param.getPlayerId(), 
				param.getSolar()));
		
		return PlayerDAOImp.getInstance().selectByPlayerIdSolar(param);
	}
	
	@Override
	public List<String> findPositions() {
		//PlayerDAO dao=new PlayerDAOImp(); 반복사용되니깐 위로 빼고 생성자에다가~~
		//List<String> positions= PlayerDAOImp.getInstance().selectPositions();
		return PlayerDAOImp.getInstance().selectPositions();
	}

	@Override
	public List<String> findByTeamIdPosition(Player param) {
		//PlayerDAO dao = new PlayerDAOImp();
		List<String> players = PlayerDAOImp.getInstance().selectByTeamIdPosition(param);
		return players;
		//return PlayerDAOImp.getInstance().selectByTeamIdPosition();
	}
	
	@Override
	public List<Player> findByTeamIdHeightPosition(Player param) {
		//PlayerDAO dao = new PlayerDAOImp();
		List<Player> players = PlayerDAOImp.getInstance().selectByTeamIdHeightPosition(param);
		return players;
	}





}
