package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.Player;
import com.soccer.web.serviceimps.PlayerServiceImp;

public class CreateCommand extends Command {
	public CreateCommand(HttpServletRequest request) {
		setRequest(request);
		setAction(action);
		setDomain(domain);
		super.execute(); //setview 만들고 있음...
		this.execute(); //이건 회원가입만듬.
	
	}
	@Override
	public void execute() {
		Player param = new Player();
		param.setPlayerId(request.getParameter("playerId"));
		param.setSolar(request.getParameter("solar"));
		
		//PlayerServiceImp.getInstance().join(param); 얘가 boolean 를 리턴함
		if(PlayerServiceImp.getInstance().join(param)) {
			System.out.println("회원가입 성공!");
		}else {
			System.out.println("회원가입 실패!");
		}
		
	}

}
