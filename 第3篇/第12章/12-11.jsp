<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>�ϥ�s:doubleselect���ͦ��p�U�Ԧ����</title>
		<s:head />
	</head>
	<body>
		<h3>
			�ϥ�s:doubleselect���ͦ��p�U�Ԧ����
		</h3>
		<s:form action="x">
			<s:doubleselect label="�п���z���w���Ϯ�" name="author" list="{'��', 'David'}"
				doubleList="top == '��' ? {'Spring2.0', 'J2EE' , 'Ajax'} : {'JavaScript: The Definitive Guide'}"
				doubleName="book" />
		</s:form>
	</body>
</html>
