<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<HTML>
<HEAD>
<TITLE>�n��</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<!-- �פJdwr/interface/CheckUserExist.js�Mdwr/engine.js�A�o��ӫ��O�Z���w�q�FCheckUserExist���O�Z����  -->
<script src="dwr/interface/CheckUserExist.js"></script>
<script src="dwr/engine.js"></script>
<!-- �פJdwr/util.js�A�䤤�]�A�@�Ǥu���k -->
<script src="dwr/util.js"></script>
<script language="javascript">
    //��ϥΪ̦W�ٿ�J�إ��h�J�IĲ�oonblur�ƥ�ɡA�I�s�Ӥ�k
	function checkUserExists(textBox){ 
		var username = textBox.value;
		//�ǰe�ШD����A���A�z�LCheckUserExist���O�Z���󪽱��I�s
		//UserManager���O����checkUserExist�A�P�_�ϥΪ̦W�٬O�_�s�b�C
		//callBackFunction���B�z�T����ƪ���ƪ���ƦW
		CheckUserExist.checkUserExist(username,callBackFunction);
	}
	//�B�z�T����ƪ���ơADWR�ج[�|�NUserManager���O����
	//checkUserExist��k���浲�G�ǵ���ƪ��Ѽ�isExist�C
	function callBackFunction(isExist){		
        if (isExist==1){
            alert("�ϥΪ̦W�٤w�g�s�b�A�д��ӨϥΪ̦W�١I");
        }else if(isExist==0){
			alert("�ϥΪ̦W�٥i�H�ϥ�");
        } 
    }
</script>
</HEAD>
<BODY BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">  
  <tr>   
    <td width="495">
	<form action="reg.action" method="post">
		<table align="center">
			<tr>
				<td>�ϥΪ̵n���G</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2"><hr/></td>
			</tr>
			<tr>				
				<td><s:textfield name="loginName" label="�ϥΪ̦W��" onblur="return checkUserExists(this);"  /></td>
			</tr>
				<td> <s:textfield name="loginPwd" label="�K�X" /></td>
			<tr>
				<td><input type="submit" value="�n��" class="btn">&nbsp;</td>
				<td><input type="reset" value="���]" class="btn"></td>
			</tr>
		</table>
	</form>
	</td>    
  </tr>
  <tr>
    <td colspan="5"><br></td>
  </tr>
</table>
<br/>
</BODY>
</HTML>
