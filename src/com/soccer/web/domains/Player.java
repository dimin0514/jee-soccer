package com.soccer.web.domains;
import java.io.Serializable;
import lombok.Data;

@Data
public class Player implements Serializable {

	private static final long serialVersionUID = 1L;
	private String playerId,playerName,teamName,teamId,eplayerName,nickName,join,position;
	private String backNo,nation,birthDate,solar,height,weight;

}
