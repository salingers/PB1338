<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>DWR's HelloWorld</title>
		<script type='text/javascript' src='/struts2dwr/dwr/engine.js'></script>
 		<script type='text/javascript' src='/struts2dwr/dwr/interface/Hello.js'></script>
		<script type="text/javascript" src="jq/jquery-1.6.2.js"></script>

		<script type="text/javascript">
		$(document).ready(function(){

			
			$("#hi").click(function(){
					var user = $("#user").val();
					Hello.sayHello(user,callback);
				});
				function callback(msg){   
					$("#result").text(msg); 
				}  
			});
		</script>
	</head>
	<body>
		<input id="user" type="text" />
		<input type='button' value='打招呼' id="hi" />
		<div id="result"></div>
	</body>
</html>
