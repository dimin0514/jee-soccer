var app = (()=>{
	return {
		init : (ctx)=>{
			playerService.login(ctx);
			playerService.join(ctx);
			playerService.moveJoin(ctx);
		}
		
	};

})();

var player = (()=>{
	var _playerId,_playerName,_teamId,_ePlayerName,_nickName,_joinYear,_position,_backNo,
	_nation,_birthDate,_solar,_height,_weight;
	var setPlayerId = (playerId)=>{this._playerId = playerId;}
	var setSolar = (solar)=>{this._solar = solar;}
	var getPlayerId = ()=>{return this._playerId;}
	var getSolar = ()=>{return this._solar;}
	return {
		setPlayerId : setPlayerId,
		setSolar : setSolar,
		getPlayerId : getPlayerId,
		getSolar : getSolar
	};
})();

var playerService = (()=>{
	return {
		login : (ctx)=>{
			$('#login_btn').click(()=>{
				if($('#username').val()===''||$('#userpw').val()===''){
					alert('필수값이 없습니다.');
				}else{
					alert('입력한 값 아이디'+$('#username').val());
					$('#login_form').attr('action',ctx+'/player.do');
					$('#login_form').submit();
				}

			});
		},
		join: (ctx)=>{
			$('#join_btn').click(()=>{
				if($('#join_playerId').val()===''||$('#join_solar').val()===''){
					alert('필수값이 없습니다.');
				}else{
					alert('입력한 값 아이디'+$('#username').val());
					$('#join_form').attr('action',ctx+'/player.do');
					$('#join_form').submit();
				}
			});
		},
		moveJoin: (ctx)=>{
			$('#join').click(()=>{
				alert('회원가입 이동');
				location.assign(ctx+'/facade.do?action=move&page=join');
			});
			
			$('#back').click(()=>{
				location.assign(ctx+'/index.jsp');
			});
			
		}
	};
})();
