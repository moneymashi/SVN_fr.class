<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% request.setCharacterEncoding("EUC-KR");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<title>Insert title here</title>
<%
/*
������ �ִ� ����?[  ](1~3) - 1�ܰ�
[1��][2��][3��](2�ܰ�)
�������������� ������ ���� ���� ȹ��
Ʋ���� �ٽ� page �̵�
*/
%>
<script>
$(function(){
	//var ranPos = (parseInt)(Math.random()*3+1);
	$("input[type='button']").on("click",function(){
		//console.log($(this).val());
		$("input[name ='label']").val($(this).val());
		$("form").submit();
	});
});
</script>
</head>
<body>
<form action="a11_responseEx_redirect.jsp" method="post">
������ �ִ� ����?[<input name="label"/>]<br>
<input type="button" value="1��" name="btn">
<input type="button" value="2��" name="btn">
<input type="button" value="3��" name="btn">
</form>
</body>
</html>