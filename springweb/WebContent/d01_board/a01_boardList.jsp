<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>justification</title>
		<link rel="stylesheet" 
		href="${path}/a00_com/a00_com.css" >
		<style type="text/css">
		</style>
		<script src="${path}/com/jquery-1.10.2.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$("#schbtn").click(function(){
					$("form").submit();
				});
			})
		</script>
	</head>
	<body>
		<center>
		<h3>게시판</h3>
		<!-- 조회 항목 -->
		<form method="post">
		<table>
			<tr><td>제목</td><td><input type="text" name="subject" 
									value="${empsch.subject}"/></td>
				<td>작성자</td><td><input type="text" name="writer"
									value="${empsch.writer}"/></td></tr>
			<tr><td>내용</td><td><input type="text" name="content"
									value="${empsch.content}"/><td></td><td></td></tr>	
			<tr><td colspan="4" style="text-align:right;">
					<input type="button" id="regbtn" value="등록"/>
					<input type="button" id="schbtn" value="검색"/>
				</td></tr>	
		</table>
		</form>
		<table>
			<tr><th>번호</th><th>제목</th><th>작성자</th><th>작성일</th></tr>
			<tr><td colspan="4">작성된 글이 없습니다!!</td></tr>
		</table>
	</body>
</html>