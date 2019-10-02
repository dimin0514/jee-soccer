package com.soccer.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soccer.web.command.Commander;
import com.soccer.web.command.MoveCommand;
import com.soccer.web.command.Receiver;
import com.soccer.web.command.Sender;
import com.soccer.web.domains.Player;
import com.soccer.web.pool.Constants;
import com.soccer.web.serviceimps.PlayerServiceImp;
import com.soccer.web.enums.*;

@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("1.-->player jsp에서 컨트롤러 들어옴"); 
		//playerId solar action page

		System.out.println(String.format("리쿼스트 값 출력 : %s,%s,%s,%s",
				request.getParameter("playerId"),
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		Receiver.init(request);
		
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case CREATE: request.setAttribute("page","login"); break;
		case LOGIN : request.setAttribute("page", "main"); break;
		case SEARCH: request.setAttribute("page",request.getParameter("page"));break;

		default:break;
		
		}
		System.out.println("page"+request.getAttribute("page"));
		
		
		Sender.forward(request, response); // 도착지.. movecommand 는 종료됨 즉음. 즉 request 떠나면 죽음
	}

}
