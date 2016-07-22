<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>DWR's HelloWorld</title>
		<script type='text/javascript' src='/struts2dwr/dwr/engine.js'></script>
 		<script type='text/javascript' src='/struts2dwr/dwr/interface/Hello.js'></script>
		<script type='text/javascript' src='/struts2dwr/dwr/util.js'></script>

		<script type="text/javascript">
	    function hello(){   
	        var user = $('user').value;   
	        Hello.sayHello(user,callback);   
	       }   
	       function callback(msg){   
	    	   dwr.util.setValue('result',msg);   
	       }  
		</script>
	</head>
	<body>
		<input id="user" type="text" />
		<input type='button' value='打招呼' onclick='hello();' />
		<div id="result"></div>
	</body>
</html>
