<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Struts2標簽庫</title>
  </head>
  
  <body>
           <s:bean name="com.struts.Person" var="per">
             <s:param name="name" value="'張三'"></s:param>
             <s:param name="sex" value="'男'"></s:param>
           </s:bean>
           
           <!-- 將javaBean案例放到預設範圍中 -->
                                    預設範圍中的：<br/>
           <s:set value="#per" name="p"/>
           <s:property value="#p.name"/><br>
           <s:property value="#p.sex"/><br/><br/>
             <!-- 將javaBean案例放到application範圍中 -->
             application範圍中的：<br/>
           <s:set value="#per" name="p1" scope="application"/>
           <s:property value="#application.p1.name"/><br>
           <s:property value="#application.p1.sex"/><br/><br/>
             <!-- 將javaBean案例放到request範圍中 -->
          request   範圍中的：<br/>
           <s:set value="#per" name="p2" scope="request"/>
           <s:property value="#request.p2.name"/><br>
           <s:property value="#request.p2.sex"/><br/><br/>
             <!-- 將javaBean案例放到session範圍中 -->
             session範圍中的：<br/>
           <s:set value="#per" name="p3" scope="session"/>
              <s:property value="#session.p3.name"/><br>
        <s:property value="#session.p3.sex"/><br/><br/>
  </body>
</html>
