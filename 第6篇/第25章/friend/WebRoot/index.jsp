<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
       <title>Hi,聚友網歡迎你哦~</title>
     <style type="text/css">
       		.linka{
       			color:white;
       			font-weight: bold;
       			text-decoration: none;
       			font-size: 28px;
       		}
       		li{
       			float:left; 
       			margin-right:20px;
       			display: block;
       		}
			.bod {
				border: medium dotted #F90;
			}
       </style>
</head>
  
  <body style="margin-left:0px; margin-right:0px; margin-top:0px ">
  		<div>
  			<div style="height:200px; background:url(img/bg.png);">
  				<div style="height:140px">&nbsp;</div>
            	<ul style="list-style:none; margin-left:220px "> 
            		<li ><a href="allfriendaction?name=${ user }" class="linka" target="_blank">檢視所有好友</a></li>
                    <li ><a href="allmessageaction?name=${ user }" class="linka" target="_blank">檢視所有留言</a></li>
                    <li ><a href="selectfriendaction?name=${ user }" class="linka" target="_blank">加入好友</a></li>
                    <li ><a href="exitaction" class="linka">離開系統</a></li>
            	</ul>
            </div>
            <div style="min-height: 400px;">
            		<div style="float:left; width:250px" class="bod">
            			<%@ include file="userinfo.jsp" %>
					</div>
                    <div style="margin-left:265px" class="bod">
                    	<div style="min-height:80px">
                    		<%@ include file="friendlist.jsp" %>
                    	</div>
                    	<div style="min-height: 190px">
                    		<%@ include file="messagelist.jsp" %>
                    	</div>
					</div>
            </div>
            <div style="background:#69F;text-align:center; ">版權所有&copy;聚友網</div>
  		</div>  
  </body>
</html>