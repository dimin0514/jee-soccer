package com.soccer.web.serviceimps;

import com.soccer.web.services.StadiumService;

public class StadiumServiceImp implements StadiumService {
	 private static StadiumServiceImp instance =new StadiumServiceImp();

	public static StadiumServiceImp getInstance() {
		return instance;
	}
	private StadiumServiceImp() {
	}
	 

}
