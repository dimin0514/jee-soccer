<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../common/head.jsp"/>
<div>1</div>
<div><img id="soccer_intro" src="${img}/soccer_intro.jpg"/>


</div>

<div>3</div>
<div>4</div>
<div>
	5
	<form id="login_form">	
		<div id="login_tab">
			<div id="login_tab_item_1">
				USERNAME <input id="username" class="input_text" type="text" name="playerId"
					style="width: 100%" />
			</div>
			<div id="login_tab_item_2">
				<input id="login_btn" type="button" value="로그인"
					style="width: 100%; height: 100%" />
			</div>
			<div id="login_tab_item_3">
				PASSWORD <input id="userpw" class="input_text" type="text" name="solar"
					style="width: 100%" />
			</div>

		</div>
		<input type="hidden" name="action" value="login"
			style="width: 100%; height: 100%" /> <input type="hidden" name="page"
			value="home" style="width: 100%; height: 100%" />
	</form>
</div>
<div>6</div>
<div>7</div>
<div>8
	<h3 id="join_a"><a id="join" href="#">회원가입</a></h3>
</div>
<div>9</div>
<jsp:include page="../common/foot.jsp"/>
<script>
app.init('${ctx}');
</script>
