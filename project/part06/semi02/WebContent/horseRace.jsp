<%@page import="java.util.ArrayList"%>
<%@page import="dao.DAO_PlayerInfo"%>
<%@page import="vo.PlayerInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="EUC-KR" />
<c:set var="path" value="${pageContext.request.contextPath}" />
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-toggle.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/stylish-portfolio.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css">
<link href="css/game.css?ver=2" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/jquery-ui.css">
<title>justification</title>
</head>
<%
	DAO_PlayerInfo dao = new DAO_PlayerInfo();
	PlayerInfo vo = (PlayerInfo) session.getAttribute("user");
	PlayerInfo sch = dao.checkDuplicatedId(vo.getPid());
	PlayerInfo dump = new PlayerInfo();
	ArrayList<PlayerInfo> playerList= dao.searchPlayer(dump);
	session.setAttribute("playerList", playerList);
	session.setAttribute("user", sch);
%>


<body>
	<div id="game-container" class="container-fluid">
	<div class="row">
			<div id="finalResult" class=" table-responsive">
			<br><br>
			</div>
		</div>
		<div class="row" id="canvas-container">
			<div class="col-sm-10 col-sm-offset-1">
				<canvas id="game" width="1455px" height="850px"
					style="border-radius: 0px 0px 8px 8px"></canvas>
			</div>
		</div>
		<div class="row">
			<div class="col-md-8" id="menus">
				<div class="row">
					<h1>pent A corn 경마장</h1>
					<br>
					<h3>1등할 말을 골라주세요.</h3>
				</div>
				<img src="img/number1.png" class="numberImg img-responsive"> <img
					src="img/number2.png" height="50%" class="numberImg img-responsive">
				<img src="img/number3.png" height="50%"
					class="numberImg img-responsive">
				<div class="row">
					<div
						class="col-md-6 col-md-offset-3 col-sm-offset-1 table-responsive"
						id="mainView">
						<table id="horseTable" class="table">
							<tr>
								<td>1번 말</td>
								<td>2번 말</td>
								<td>3번 말</td>
								<td>4번 말</td>
								<td>5번 말</td>
							</tr>
							<tr align="center">
								<td class="horseExplain"><img src="img/goldenHorse.png"
									class="horseImg img-responsive"><br>
									<div class="status  hidden-sm">
										특징 : 최고속력은 느리지만<br>적당한 체력과<br>속력을 지녔습니다. <br>배당률
										: 1.8 배
									</div></td>
								<td class="horseExplain"><img src="img/brownHorse.png"
									class="img-responsive horseImg "><br>
									<div class="status  hidden-sm">
										특징 : 꾸준히 앞으로<br>나아가는 말입니다.<br>배당률 : 1.9 배
									</div></td>
								<td class="horseExplain"><img src="img/blackHorse.png"
									class="img-responsive horseImg"><br>
									<div class="status  hidden-sm">
										특징 : 뒤쳐지지 않고 꾸준히<br>앞으로 달려갑니다<br> 배당률 : 2.0 배<br>

									</div></td>
								<td class="horseExplain"><img src="img/grayHorse.png"
									class="img-responsive horseImg"><br>
									<div class="status  hidden-sm">
										특징 : 잘 지치지 않지만<br>치고 나가는<br>속도가 느립니다. <br>배당률 :
										2.3 배
									</div></td>
								<td class="horseExplain"><img src="img/whiteHorse.png"
									class="img-responsive horseImg"><br>
									<div class="status  hidden-sm">
										특징 : 쉽게 쳐지지만<br>나가야 할 때는<br>폭발적으로 달립니다. <br>배당률
										: 2.5 배
									</div></td>
						</table>
					</div>
					<div
						class="col-md-2 col-md-offset-1 col-sm-offset-1 well table-responsive"
						style="color: black;">
						<table class="table table-condensed horseTable">
							<tr>
								<td>랭킹 1위:</td>
								<td>${playerList[0].pid }</td>
							</tr>
							<tr>
								<td>랭킹 2위:</td>
								<td>${playerList[1].pid }</td>
							</tr>
							<tr>
								<td>랭킹 3위:</td>
								<td>${playerList[2].pid }</td>
							</tr>
							<tr>
								<td>랭킹 4위:</td>
								<td>${playerList[3].pid }</td>
							</tr>
							<tr>
								<td>선택한 말</td>
								<td><div class="col-md-12">
										<label id="selectedHorse"></label>
									</div></td>
							</tr>
							<tr>
								<td><div class="col-md-12">현재 소지액</div></td>
								<td><div class="col-md-12">
										<label><fmt:formatNumber type="currency"
												value="${user.curMoney }" /></label>
									</div></td>
							</tr>
							<tr>
								<td colspan="2">배팅액
									<div class="col-md-12">
										<input type="text" id="amount" readonly
											style="border: 0; color: #f6931f; font-weight: bold; text-align: center"><br>
										<br>
										<div id="slider"></div>
									</div>
								</td>
							</tr>
							<tr>
								<td colspan="2" class="col-md-12"><input type="checkbox"
									id="betBtn" checked data-toggle="toggle" data-on="Betting!!"
									data-off="Cancel betting" data-onstyle="success"
									data-style="slow" data-offstyle="danger"></td>
							</tr>
						</table>
					</div>
				</div>
				<div class="col-md-4 col-md-offset-4 col-sm-offset-1">
					<br>
					<button type="button" class="btn btn-primary btn-lg btn-block"
						id="start-menu">S T A R T</button>
					<br> <br>
				</div>
			</div>
		</div>

		<div id="gameResult" align="center" class="row"></div>
		<input type="hidden" id="gameState" />
	</div>



</body>
<script src="http://code.jquery.com/jquery-1.10.2.js?ver=1 "></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js?ver=1"></script>
<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap-toggle.min.js"></script>
<script type="text/javascript" src="js/game_manager.js?ver=3"
	charset="UTF-8"></script>
<script type="text/javascript" src="js/menu_manager.js?ver=3"
	charset="UTF-8"></script>
<script type="text/javascript">
	var player = [ {
		id : "${user.pid}",
		curMoney : parseInt('${user.curMoney}'),
		playerBetMoney : parseInt('${user.curMoney}') / 2,
		hnum : NaN
	}, {
		id : "${playerList[0].pid == user.pid ? playerList[1].pid :playerList[0].pid }",
		curMoney : 10000,
		playerBetMoney : 6000,
		hnum : NaN
	}, {
		id : "${playerList[1].pid ==user.pid? playerList[2].pid: playerList[1].pid}",
		curMoney : 600000,
		playerBetMoney : 600000,
		hnum : NaN
	}, {
		id : "${playerList[2].pid == user.pid ? playerList[3].pid: playerList[2].pid}",
		curMoney : 50000,
		playerBetMoney : 1000,
		hnum : NaN
	}, {
		id : "${playerList[3].pid == user.pid ? playerList[4].pid: playerList[3].pid}",
		curMoney : 6000,
		playerBetMoney : 3000,
		hnum : NaN
	} ]

	$(function() {
		$("#slider").slider({
			value : player[0].curMoney / 2,
			min : 100,
			max : player[0].curMoney,
			step : 100,
			slide : function(event, ui) {
				$("#amount").val(ui.value.toLocaleString('krw', {
					style : 'currency',
					currency : 'krw'
				}));
				player[0].playerBetMoney = parseInt(ui.value);
				console.log(player[0].playerBetMoney);
			}
		});
		$("#amount").val($("#slider").slider("value").toLocaleString('krw', {
			style : 'currency',
			currency : 'krw'
		}));
	});
</script>

</html>