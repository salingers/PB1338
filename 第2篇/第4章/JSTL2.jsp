<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>JSTL簡單案例</title>
  </head>
  
  <body>
                 <c:if test="${1>2}" >
                 <c:out value="1大於2"></c:out>
                 </c:if>
                 <c:if test="${1<2}" >
                    <c:out value="1小於2"></c:out>
                 </c:if>
  </body>
</html>
