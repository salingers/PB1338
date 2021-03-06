<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<HTML>
<HEAD>
<TITLE>登錄</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<script language="javascript">
	var xmlHttpRequest;
	//建立XMLHttpRequest物件案例
	function createXmlHttpRequest(){
		if(window.ActiveXObject){
		    //若果是IE瀏覽器
			return new ActiveXObject("Microsoft.XMLHTTP");
		}else if(window.XMLHttpRequest){
		    //其他非IE瀏覽器
			return new XMLHttpRequest();
		}
	}
	
	//當使用者名稱輸入框失去焦點觸發onblur事件時，
	//用於檢驗使用者名稱是否已經存在的JavaScript方法
	function checkUserExists(textBox){
		var username = textBox.value;
		if (!username){
			alert("使用者名稱不能為空");
			textBox.focus();
			return ;
		}		
		//傳送請求到伺服器的請求字串，以判斷使用者名稱是否存在	
		var url = "doCheckUserExists.action?loginName="+username;
		//建立XMLHttpRequest物件
		xmlHttpRequest = createXmlHttpRequest();
		//設定回調函數，其中onreadystatechange為XMLHttpRequest物件的一個事件，
		//callBackFunction是一個JavaScript方法名。當XMLHttpRequest物件的狀態發生變化時，
		//呼叫callBackFunction方法
		xmlHttpRequest.onreadystatechange = callBackFunction;
		//起始化XMLHttpRequest物件。其中，第一個參數表示傳送請求的模式；
		//第二個參數表示請求的Url；第三個參數表示請求是同步還是異步，
		//這裡為true，表示異步。即傳送請求後，繼續執行後面的敘述	    
	    xmlHttpRequest.open("GET",url,true);
	    //傳送請求
	    xmlHttpRequest.send(null);
	}
	//回調函數，每當XMLHttpRequest狀態發生變化時，都會呼叫該函數
	function callBackFunction(){
	    //表示接收結果完畢
		if(xmlHttpRequest.readyState == 4){     
		    //伺服器的狀態碼，200標準
            if(xmlHttpRequest.status == 200){
               //responseText中包括了伺服器的響應字串
               var b = xmlHttpRequest.responseText;
               if (b=="true"){
               		alert("使用者名稱已經存在");
               }else{
       			    alert("使用者名稱可以使用");
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
				<td>使用者登錄：</td>
				<td>&nbsp;</td>
			</tr>		
			<tr>				
				<td><s:textfield id="loginName" name="loginName" label="使用者名稱" onblur="return checkUserExists(this);"  /></td>
			<tr>				
				<td><s:textfield name="loginPwd" label="密碼" /></td>
			<tr>
				<td><s:submit value="登錄"/></td>			
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
