package com.soccer.web.services;

import java.util.List;

import com.soccer.web.domains.Player;

public interface PlayerService {
	//0 조인
	public boolean join(Player param);
	//1로그인
	public Player login(Player param);
	/**
	 * 2. 포지션 종류(중복제거,없으면 빈공간)
	 * SELECT DISTINCT POSITION 포지션
	 * FROM PLAYER
	 */
	public List<String> findPositions();
	//4. 수원팀(ID: K02)골키퍼
	public List<String> findByTeamIdPosition(Player param);
	// 5. 팀id, 키, 플레이어 ,성
	public List<Player> findByTeamIdHeightPosition(Player param);



}
