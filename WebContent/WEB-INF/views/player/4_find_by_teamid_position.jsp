<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 4.팀아이디로 해당 팀의 포지션의 선수 검생기능 예(ID:K02)골기퍼 -->
<h2>4.팀아이디로 해당 팀의 포지션의 선수 검생기능 예(ID:K02)골기퍼</h2>
<form id="find4">
	팀아이디 <input type="text" name="teamId" /><br/>
	포지션  <input type="text" name="position" /><br/>
	<input type="hidden" name="action" value="search">
	<input type="hidden" name="page" value="4_find_by_teamid_position">
	<input type="submit" id="test" value="전송">
</form>

<!-- 4번 결과 -->
해당 ID가 ${list.playerName}  일치하는 선수는 홍길동 입니다.
