<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    
    <title>EL簡單案例</title>
  </head>
  
  <body>
  <%
  request.setCharacterEncoding("utf-8");
  session.setAttribute("session","sessionScope");
  request.setAttribute("request","requestScope");
  application.setAttribute("application","applicationScope");
  pageContext.setAttribute("pageContext","pageContext");
  %>
             <h1>EL範例</h1><br>
               Param隱含物件：<br>
               姓名：${param.name}<br/>
               性別：${param.sex}<br/>
               年齡：${param.age}<br/>
               愛好：
                    <c:forEach items="${paramValues.interest}" var="interest">
                        ${interest}、
                    </c:forEach><br/><hr/>
                request範例：<br/>
                ${requestScope.request}<br/>   <hr/>  
                session範例：<br/>
                ${sessionScope.session}<br/>   <hr/>  
                application範例：<br/>
                ${applicationScope.application}<br/> <hr/>    
                pageContext範例：<br/>
                ${pageScope.pageContext}<br/>     
                    
  </body>
</html>
