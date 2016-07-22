<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>JSTL簡單案例</title>
  </head>
  
  <body>

        普通循環：  
                <c:forEach begin="0" end="9" varStatus="i">
                  <c:out value="${i.index}"></c:out><br/>
                </c:forEach>
                <hr/>
        陣列循環：
           <%
                String [] arrags = {"這","是","數","群組","迭","代"};
             request.setAttribute("arrags",arrags);
           %>
           <c:forEach items="${arrags}" var="arrag">
                  <c:out value="${arrag}"></c:out><br/>
                </c:forEach>
            <hr/>
        集合循環：
            <%
            List<String> list = new ArrayList<String>();
            list.add("集");
            list.add("合");
            list.add("遍");
            list.add("歷");
            request.setAttribute("list",list);
           %>
             <c:forEach items="${list}" var="c">
                  <br/><c:out value="${c}"></c:out>
                </c:forEach>
  </body>
</html>
