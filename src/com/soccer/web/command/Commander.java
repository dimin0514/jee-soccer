package com.soccer.web.command;

import com.soccer.web.enums.*;

import javax.servlet.http.HttpServletRequest;

public class Commander {
	
	public static Command direct(HttpServletRequest request) {
		System.out.println("★★★ 3. Commander.direct() 들어옴 ★★★ ");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s ",
				request.getParameter("playerId"), 
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		
		Command cmd = null;
		
		
		try {
			switch(Action.valueOf(request.getParameter("action").toUpperCase())) {   // 이넘이 대문자 쓰니깐 touppercase로 대문자로 만들어줌!!
			case MOVE : 
				cmd = new MoveCommand(request);
				break;
			case CREATE :
				cmd = new CreateCommand(request);
				break;
			case SEARCH : break;
			case UPDATE : break;
			case DELETE : break;
			case LOGIN : 
				cmd = new LoginCommand(request);
				break;
			default :
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cmd;
	}

}