<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>JSTL簡單案例</title>
  </head>
  
  <body>
                  <c:set var="number" value="5"></c:set>
                  <c:out value="${number}"></c:out>
  </body>
</html>
