<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div></div>
<div><img id="soccer_intro" src="${img}/soccer_intro.jpg"/>


</div>

<div></div>
<div></div>
<div>
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
			style="width: 100%; height: 100%" /> 
			<input type="hidden" name="page" value="main" style="width: 100%; height: 100%" />
	</form>
</div>
<div></div>
<div></div>
<div>
	<h3 id="join_a"><a id="join" href="#">회원가입</a></h3>
</div>
<div></div>

<script>
app.init('${ctx}');
</script>
