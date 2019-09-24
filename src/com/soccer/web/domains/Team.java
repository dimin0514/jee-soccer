package com.soccer.web.domains;
import java.io.Serializable;
import lombok.Data;

@Data
public class Team implements Serializable {
	private static final long serialVersionUID = 1L;
	private String teamId,regionName,teamName,eTeamName,orig,stadiumId,zipCode1,zipCode2,adress,ddd,tel,fax,homepage,owner;

}
