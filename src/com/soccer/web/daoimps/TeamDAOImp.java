package com.soccer.web.daoimps;

import com.soccer.web.daos.TeamDAO;

public class TeamDAOImp implements TeamDAO{
	private static TeamDAOImp instance = new TeamDAOImp();

	public static TeamDAOImp getInstance() {
		return instance;
	}
	private TeamDAOImp() {
	}

}
