package com.soccer.web.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.Player;
import com.soccer.web.pool.Constants;
import com.soccer.web.serviceimps.PlayerServiceImp;

public class SearchCommand extends Command {
	public SearchCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath()
				.substring(1,request.getServletPath().indexOf(".")));
		setAction(action);
		execute();

	}
	@Override
	public void execute() {
		switch(request.getParameter("page")) {
		case "a_position": 
			request.setAttribute("positions", PlayerServiceImp.getInstance().findPositions());
			
			break;
		case "4_find_by_teamid_position" : 
			
			Player player = new Player();
			player.setTeamId(request.getParameter("teamId"));
			player.setPosition(request.getParameter("position"));
			System.out.println("들어가는 팀id는?"+request.getParameter("teamId"));
			request.setAttribute("list", PlayerServiceImp.getInstance().findByTeamIdPosition(player));
			System.out.println("리스트는?"+request.getAttribute("list"));
			break;
		}


		view = String.format(Constants.DOUBLE_PATH, domain, "main");
	}

}
