<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 쿼리 -->
<h2> 5. 수원팀(ID: K02)키가 170 이상 선수 이면서 성이 고씨인 선수</h2>


<form id="find5" action="<%=request.getContextPath()%>/player.do?">
	팀아이디 : <input type="text" name="TeamId" />
	이름의 성 <input type="text" name="playerName" />
	키 <input type="text" name="height"/>
	<input type="hidden" name="action" value="find5" />
	<input type="hidden" name="page" value="5_find_by_teamid_height_name" />
	<input type="submit" value="전송" />

</form>

<!-- 결과 -->