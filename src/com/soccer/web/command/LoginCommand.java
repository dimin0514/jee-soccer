package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;
import com.soccer.web.domains.Player;
import com.soccer.web.serviceimps.PlayerServiceImp;

public class LoginCommand extends Command{
	
	public LoginCommand(HttpServletRequest request) throws Exception {
		
		System.out.println("5.로그인 커멘더 들어옴");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s ",
				request.getParameter("playerId"), 
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		
		setRequest(request);
		setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf("."))); //payer.do 에서 player만 가져오는 거...
		setAction(request.getParameter("action"));
		execute();
	}

		@Override
		public void execute() {
			String playerId = request.getParameter("playerId");
			String solar = request.getParameter("solar");
			Player player = new Player();
			player.setPlayerId(playerId);
			player.setSolar(solar);
			player = PlayerServiceImp.getInstance().login(player);
			System.out.println("10. DB에서 커멘드로 전달된 로그인 객체는?"+player);
			
			if(player.getPlayerId() ==null) {
				setPage("fail");
				System.out.println("로그인실패");
			}else {
				setPage(request.getParameter("page"));
				System.out.println("로그인성공");
			}
			super.execute();
	

	}

}