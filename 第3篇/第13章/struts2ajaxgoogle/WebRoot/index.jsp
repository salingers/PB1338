<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Struts2 Ajax Google</title>
<script type='text/javascript' src='/struts2ajaxgoogle/dwr/engine.js'></script>
<script type='text/javascript'
	src='/struts2ajaxgoogle/dwr/interface/KeyWrod.js'></script>
<script type="text/javascript" src="jq/jquery-1.6.2.js"></script>
<script type="text/javascript">
	$(document).ready(function()
	{

		$("#serch").keyup(function()
		{
			var key = $("#serch").val();

			KeyWrod.getName(key, callback);
		});

		function callback(date)
		{
			var key = "";

			for (i = 0; i < date.length; i++)
			{
				key = key + date[i].name + "<br>";
			}

			$("#result").html("<b>" + key + "</b>");
		}

	});
</script>
</head>
<body>
	<center>
		<img src="img/logo_cn.png" style="padding-top: 58px;"> <br>
		<br> <input type="text" id="serch"
			style="width: 600px; height: 38px; font-size: 20px; font-weight: bold;" />
		<input type="button" id="sub" value="Google 搜尋" style="height: 40px" /><br />
		<div id="result"></div>
	</center>
</body>
</html>