<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<HTML>
<HEAD>
<TITLE>�n��</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<script language="javascript">
	var xmlHttpRequest;
	//�إ�XMLHttpRequest����ר�
	function createXmlHttpRequest(){
		if(window.ActiveXObject){
		    //�Y�G�OIE�s����
			return new ActiveXObject("Microsoft.XMLHTTP");
		}else if(window.XMLHttpRequest){
		    //��L�DIE�s����
			return new XMLHttpRequest();
		}
	}
	
	//��ϥΪ̦W�ٿ�J�إ��h�J�IĲ�oonblur�ƥ�ɡA
	//�Ω�����ϥΪ̦W�٬O�_�w�g�s�b��JavaScript��k
	function checkUserExists(textBox){
		var username = textBox.value;
		if (!username){
			alert("�ϥΪ̦W�٤��ର��");
			textBox.focus();
			return ;
		}		
		//�ǰe�ШD����A�����ШD�r��A�H�P�_�ϥΪ̦W�٬O�_�s�b	
		var url = "doCheckUserExists.action?loginName="+username;
		//�إ�XMLHttpRequest����
		xmlHttpRequest = createXmlHttpRequest();
		//�]�w�^�ը�ơA�䤤onreadystatechange��XMLHttpRequest���󪺤@�Өƥ�A
		//callBackFunction�O�@��JavaScript��k�W�C��XMLHttpRequest���󪺪��A�o���ܤƮɡA
		//�I�scallBackFunction��k
		xmlHttpRequest.onreadystatechange = callBackFunction;
		//�_�l��XMLHttpRequest����C�䤤�A�Ĥ@�ӰѼƪ�ܶǰe�ШD���Ҧ��F
		//�ĤG�ӰѼƪ�ܽШD��Url�F�ĤT�ӰѼƪ�ܽШD�O�P�B�٬O���B�A
		//�o�̬�true�A��ܲ��B�C�Y�ǰe�ШD��A�~�����᭱���ԭz	    
	    xmlHttpRequest.open("GET",url,true);
	    //�ǰe�ШD
	    xmlHttpRequest.send(null);
	}
	//�^�ը�ơA�C��XMLHttpRequest���A�o���ܤƮɡA���|�I�s�Ө��
	function callBackFunction(){
	    //��ܱ������G����
		if(xmlHttpRequest.readyState == 4){     
		    //���A�������A�X�A200�з�
            if(xmlHttpRequest.status == 200){
               //responseText���]�A�F���A�����T���r��
               var b = xmlHttpRequest.responseText;
               if (b=="true"){
               		alert("�ϥΪ̦W�٤w�g�s�b");
               }else{
       			    alert("�ϥΪ̦W�٥i�H�ϥ�");
               }               
            }
        }
	}
</script>
</HEAD>
<BODY BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">  
  <tr>   
    <td width="495">
	<s:form action="reg.action">
		<table align="center">
			<tr>
				<td>�ϥΪ̵n���G</td>
				<td>&nbsp;</td>
			</tr>		
			<tr>				
				<td><s:textfield id="loginName" name="loginName" label="�ϥΪ̦W��" onblur="return checkUserExists(this);"  /></td>
			<tr>				
				<td><s:textfield name="loginPwd" label="�K�X" /></td>
			<tr>
				<td><s:submit value="�n��"/></td>			
			</tr>
		</table>
	</s:form>
	</td>    
  </tr>
  <tr>
    <td colspan="5"><br></td>
  </tr>
</table>
<br/>
</BODY>
</HTML>
