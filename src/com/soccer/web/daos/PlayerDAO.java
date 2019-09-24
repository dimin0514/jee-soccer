package com.soccer.web.daos;

import java.util.List;

import com.soccer.web.domains.Player;

public interface PlayerDAO {
	// 2. 포지션 종류(중복제거,없으면 빈공간)
	public List<String> selectPositions();
	
	public List<Player> selectByTeamIdPosition();
	
	public List<Player> selectByTeamIdHeightPosition();

}
