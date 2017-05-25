<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	import ="jspexp.z01_database.*,jspexp.z02_vo.*, java.util.*"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="UTF-8"/>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>justification</title>
		<style type="text/css">
		</style>
		<script src="${path}/com/jquery-1.10.2.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				
				$("input[type=button]").click(function(){
					// cart버튼은 제외
					if( $(this).attr("id") != "cart"){
						$("#product").val( $(this).attr("id") );
						$("form").submit();
					}else{
						// 장바구니에 있는 물건 목록으로 이동 Controller
						$(location).attr("href","${path}/prodList")						
					}
				});
			})
		</script>
	</head>
	<body><center>
		<h1>쇼핑몰</h1>
		<form method="post">
			<input type="hidden" name="product" id="product"/>
			<table width="500pt" border>
				<tr align="center">
					<td width="50%">사과</td>
					<td><input type="button" id="apple" value="장바구니담기"/></td>
				</tr>
				<tr align="center">
					<td width="50%">바나나</td>
					<td><input type="button" id="banana" value="장바구니담기"/></td>
				</tr>
				<tr align="center">
					<td width="50%">딸기</td>
					<td><input type="button" id="straw" value="장바구니담기"/></td>
				</tr>	
				<tr align="center"><td colspan="2">
					<input type="button" id="cart" value="현재 장바구니 확인"/>
				</td></tr>							
			</table>
		</form>
	</body>
</html>