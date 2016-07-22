<%@ page contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>使用者登錄</title>
		<script src="prototype-1.4.0.js" type="text/javascript">
		</script>
		<script src="json.js" type="text/javascript">
		</script>
		<script language="JavaScript">
			function validateName()
			{		
				//請求的位址
				var url = 'jsonValidateLoginName.action';
				var params = 'loginName='+document.getElementById('loginName').value;
				//建立Ajax.Request物件，對應於傳送請求
				var myAjax = new Ajax.Request(
				url,
				{
					//請求模式：POST
					method:'post',
					//請求參數
					parameters:params,
					//指定回調函數
					onComplete: processResponse,
					//是否異步傳送請求
					asynchronous:true
				});
			}
			function processResponse(request)
			{
				
				$("message").innerHTML = request.responseText.parseJSON().message;
			}	
		</script>
	</head>
	<body>
		<center>
		<h3>請輸入登錄訊息</h3>
		<s:actionerror/>
		<span id="message" style="color:red;font-weight:bold"></span>
		<s:form>
			<s:textfield id="loginName" name="loginName" label="使用者名稱" onblur="validateName();"/>
			<s:textfield name="loginPwd" label="密碼"/>
			<s:textfield name="age" label="年齡"/>
			<s:submit value="登錄"/>
		</s:form>		
		</center>
	</body>
</html>