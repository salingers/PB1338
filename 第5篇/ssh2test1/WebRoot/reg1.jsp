<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<HTML>
<HEAD>
<TITLE>祅魁</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<script language="javascript">
	var xmlHttpRequest;
	//ミXMLHttpRequestンㄒ
	function createXmlHttpRequest(){
		if(window.ActiveXObject){
		    //璝狦琌IE聅凝竟
			return new ActiveXObject("Microsoft.XMLHTTP");
		}else if(window.XMLHttpRequest){
		    //ㄤ獶IE聅凝竟
			return new XMLHttpRequest();
		}
	}
	
	//讽ㄏノ嘿块ア礘翴牟祇onblurㄆン
	//ノ浪喷ㄏノ嘿琌竒JavaScriptよ猭
	function checkUserExists(textBox){
		var username = textBox.value;
		if (!username){
			alert("ㄏノ嘿ぃ");
			textBox.focus();
			return ;
		}		
		//肚癳叫―狝竟叫―﹃耞ㄏノ嘿琌	
		var url = "doCheckUserExists.action?loginName="+username;
		//ミXMLHttpRequestン
		xmlHttpRequest = createXmlHttpRequest();
		//砞﹚秸ㄧ计ㄤいonreadystatechangeXMLHttpRequestンㄆン
		//callBackFunction琌JavaScriptよ猭讽XMLHttpRequestン篈祇ネ跑て
		//㊣callBackFunctionよ猭
		xmlHttpRequest.onreadystatechange = callBackFunction;
		//癬﹍てXMLHttpRequestンㄤい材把计ボ肚癳叫―家Α
		//材把计ボ叫―Url材把计ボ叫―琌˙临琌钵˙
		//硂柑trueボ钵˙肚癳叫―膥尿磅︽痹瓃	    
	    xmlHttpRequest.open("GET",url,true);
	    //肚癳叫―
	    xmlHttpRequest.send(null);
	}
	//秸ㄧ计–讽XMLHttpRequest篈祇ネ跑て常穦㊣赣ㄧ计
	function callBackFunction(){
	    //ボ钡Μ挡狦Ч拨
		if(xmlHttpRequest.readyState == 4){     
		    //狝竟篈絏200夹非
            if(xmlHttpRequest.status == 200){
               //responseTextい珹狝竟臫莱﹃
               var b = xmlHttpRequest.responseText;
               if (b=="true"){
               		alert("ㄏノ嘿竒");
               }else{
       			    alert("ㄏノ嘿ㄏノ");
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
				<td>ㄏノ祅魁</td>
				<td>&nbsp;</td>
			</tr>		
			<tr>				
				<td><s:textfield id="loginName" name="loginName" label="ㄏノ嘿" onblur="return checkUserExists(this);"  /></td>
			<tr>				
				<td><s:textfield name="loginPwd" label="盞絏" /></td>
			<tr>
				<td><s:submit value="祅魁"/></td>			
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
