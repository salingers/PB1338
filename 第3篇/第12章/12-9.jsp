<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Struts2��ñ�w</title>
  </head>
  
  <body>
           <s:bean name="com.struts.Person" var="per">
             <s:param name="name" value="'�i�T'"></s:param>
             <s:param name="sex" value="'�k'"></s:param>
           </s:bean>
           
           <!-- �NjavaBean�רҩ��w�]�d�� -->
                                    �w�]�d�򤤪��G<br/>
           <s:set value="#per" name="p"/>
           <s:property value="#p.name"/><br>
           <s:property value="#p.sex"/><br/><br/>
             <!-- �NjavaBean�רҩ��application�d�� -->
             application�d�򤤪��G<br/>
           <s:set value="#per" name="p1" scope="application"/>
           <s:property value="#application.p1.name"/><br>
           <s:property value="#application.p1.sex"/><br/><br/>
             <!-- �NjavaBean�רҩ��request�d�� -->
          request   �d�򤤪��G<br/>
           <s:set value="#per" name="p2" scope="request"/>
           <s:property value="#request.p2.name"/><br>
           <s:property value="#request.p2.sex"/><br/><br/>
             <!-- �NjavaBean�רҩ��session�d�� -->
             session�d�򤤪��G<br/>
           <s:set value="#per" name="p3" scope="session"/>
              <s:property value="#session.p3.name"/><br>
        <s:property value="#session.p3.sex"/><br/><br/>
  </body>
</html>
