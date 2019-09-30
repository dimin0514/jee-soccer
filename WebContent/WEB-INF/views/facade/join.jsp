<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../common/head.jsp"/>

<div>1</div>
<div><h2>2. 회원가입 화면</h2></div>
<div>3</div>
<div>4</div>
<div>5
<form id="join_1">
USERNAME <input type="text" name="playerId" /><br>
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
solar <input type="text" name="solar"	style="width: 80%" /><br>
height <input type="text" name="height"	style="width: 80%" /><br>
weight <input type="text" name="weight"	style="width: 80%" /><br>
<input type="submit" id="test" value="전송"/><input type="submit" id="cancle" value="취소"/><br>
</form>

	
</div>
<div>6</div>
<div>7 </div>

<div><h3><a id="back" href="#">뒤로가기</a></h3></div>
<div>9</div>



<script>
app.init('${ctx}');
</script>
<jsp:include page="../common/foot.jsp"/>