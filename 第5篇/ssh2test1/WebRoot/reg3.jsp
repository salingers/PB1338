<%@ page contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>�ϥΪ̵n��</title>
		<script src="prototype-1.4.0.js" type="text/javascript">
		</script>
		<script src="json.js" type="text/javascript">
		</script>
		<script language="JavaScript">
			function validateName()
			{		
				//�ШD����}
				var url = 'jsonValidateLoginName.action';
				var params = 'loginName='+document.getElementById('loginName').value;
				//�إ�Ajax.Request����A������ǰe�ШD
				var myAjax = new Ajax.Request(
				url,
				{
					//�ШD�Ҧ��GPOST
					method:'post',
					//�ШD�Ѽ�
					parameters:params,
					//���w�^�ը��
					onComplete: processResponse,
					//�O�_���B�ǰe�ШD
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
		<h3>�п�J�n���T��</h3>
		<s:actionerror/>
		<span id="message" style="color:red;font-weight:bold"></span>
		<s:form>
			<s:textfield id="loginName" name="loginName" label="�ϥΪ̦W��" onblur="validateName();"/>
			<s:textfield name="loginPwd" label="�K�X"/>
			<s:textfield name="age" label="�~��"/>
			<s:submit value="�n��"/>
		</s:form>		
		</center>
	</body>
</html>