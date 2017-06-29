<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>justification</title>
		<style type="text/css">
			body {
				margin: 40px 10px;
				padding: 0;
				font-family: "Lucida Grande",Helvetica,Arial,Verdana,sans-serif;
				font-size: 14px;
			}
		
			#calendar {
				max-width: 900px;
				margin: 0 auto;
			}
		
		
		</style>
		<link href='${path}/i01_calen/fullcalendar.min.css' rel='stylesheet' />
		<link href='${path}/i01_calen/fullcalendar.print.min.css' rel='stylesheet' media='print' />
		<script src='${path}/i01_calen/lib/moment.min.js'></script>
		<script src='${path}/i01_calen/lib/jquery.min.js'></script>
		<script src='${path}/i01_calen/fullcalendar.min.js'></script>		

		<script type="text/javascript">
			var dteinfo;
			$(document).ready(function(){
				$.ajax({
					type:"post",
					url:"calendar.do?method=list",
					dataType:"json",
					success:function( data ){
						dteinfo= data.list;
						loadView();
					}
				});
			});
			function loadView(){
				$('#calendar').fullCalendar({
					header: {
						left: 'prev,next today',
						center: 'title',
						right: 'month,agendaWeek,agendaDay'
					},
					defaultDate: '2017-06-29',
					navLinks: true, // can click day/week names to navigate views
					selectable: true,
					selectHelper: true,
					select: function(start, end) {
						var title = prompt('Event Title:');
						var eventData;
						if (title) {
							eventData = {
								title: title,
								start: start,
								end: end
							};
							$('#calendar').fullCalendar('renderEvent', eventData, true); // stick? = true
						}
						$('#calendar').fullCalendar('unselect');
					},
					editable: true,
					eventLimit: true, // allow "more" link when too many events
					// id, title, start, end, url
					events:dteinfo 
				});				
				
				
			}		


		</script>
	</head>
	<body>
		<div id='calendar'></div>
	</body>
</html>