package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command{
	
	public MoveCommand(HttpServletRequest request) throws Exception {
		setRequest(request);
		
		System.out.println("4. 무브커맨드 들어옴");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s ",
				request.getParameter("playerId"), 
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		
		setDomain(request.getServletPath()
				.substring(1,request.getServletPath().indexOf("."))); //payer.do 에서 player만 가져오는 거...
		setAction(request.getParameter("action"));
		execute();
	}
	@Override
	public void execute() {
		//super.execute(); //view 만드는곳
		//request.setAttribute("page", request.getParameter("page"));
		setPage(request.getParameter("page")); //super가 페이지 설정하는 곳인데 먼저 setpage가 되어야 super에서 나머지 생성! 순서중요??
		super.execute();
	}

}
