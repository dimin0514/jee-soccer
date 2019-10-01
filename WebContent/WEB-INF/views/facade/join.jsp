<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<div></div>
<div><h3>2. 회원가입 화면</h3></div>
<div></div>
<div></div>
<div>
<form id="join_form">
playerId <input id="join_playerId" type="text" name="playerId" /><br>
playerName <input type="text" name="playerName"	 /><br>
teamName <input type="text" name="teamName"	style="width: 80%" /><br>
teamId <input type="text" name="teamId"	style="width: 80%" /><br>
ePlayerName <input type="text" name="ePlayerName"	style="width: 80%" /><br>
nickName <input type="text" name="nickName"	style="width: 80%" /><br>
joinYear <input type="text" name="joinYear"	style="width: 80%" /><br>
position <input type="text" name="position"	style="width: 80%" /><br>
backNo <input type="text" name="backNo"	style="width: 80%" /><br>
nation <input type="text" name="nation"	style="width: 80%" /><br>
birthDate <input type="text" name="birthDate"	style="width: 80%" /><br>
solar <input id="join_solar" type="text" name="solar"	style="width: 80%" /><br>
height <input type="text" name="height"	style="width: 80%" /><br>
weight <input type="text" name="weight"	style="width: 80%" /><br>
<input type="hidden" name="action" value="create"/>
<input type="hidden" name="page" value="login"/>
<input id="join_btn" type="button" id="test" value="가입하기"/>
<input type="submit" id="cancle" value="취소"/>
<br>
</form>
</div>
<div></div>
<div></div>

<div><h3><a id="back" href="#">뒤로가기</a></h3></div>
<div></div>



<script>
app.init('${ctx}');
</script>
