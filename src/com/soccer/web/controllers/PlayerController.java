package com.soccer.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soccer.web.domains.Player;
import com.soccer.web.pool.Constants;
import com.soccer.web.serviceimps.PlayerServiceImp;

@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String action=request.getParameter("action");
		RequestDispatcher rd = null;
		String page = request.getParameter("page");
		Player player = null; 
		//PlayerService service = new PlayerServiceImp(); 이거 지우고 싱글톤 패턴?

		switch(action) {
		case"move":
			break;
		case"test":
			rd= request.getRequestDispatcher("WEB-INF/views/4_find_by_teamid_position.jsp");
			break;
		case"find2":
			request.setAttribute("positions",PlayerServiceImp.getInstance().findPositions());
			
			System.out.println("page"+page);
			break;
			
		case"find4":
			player = new Player();
			//position= request.getParameter("position");
			player.setTeamId(request.getParameter("teamId"));
			player.setPosition(request.getParameter("position"));
			// 서비스 연결자리..
			//List<Player> t= service.findByTeamIdPosition(player);
			request.setAttribute("players",PlayerServiceImp.getInstance().findByTeamIdPosition(player));
			
			break;
			
		case"find5":
			player = new Player();
			//String TeamId=request.getParameter("teamId");
			player.setTeamId(request.getParameter("teamId"));
			//param.setTeamId(request.getParameter("teamId")); 이렇게 하면 더 빨라짐.
			player.setPlayerName(request.getParameter("playerName"));
			player.setHeight(request.getParameter("height"));
			//List<Player> t= service.findByTeamIdPosition(player);
			request.setAttribute("players", PlayerServiceImp.getInstance().findByTeamIdHeightPosition(player));
		
		}
		rd= request.getRequestDispatcher(String.format(Constants.VIEW_PATH, page)); 
		rd.forward(request, response);
	}
	


}
