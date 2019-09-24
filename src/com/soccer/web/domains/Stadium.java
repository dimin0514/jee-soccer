package com.soccer.web.domains;
import java.io.Serializable;
import lombok.Data;

@Data
public class Stadium implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String stadiumId,stadiunName,hometeamId,seatCount,address,ddd,tel;

}
