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
		<s:set name="bs" value="#{'��': {'Spring2.0', 'J2EE','Ajax'},
'David': {'JavaScript: The Definitive Guide'},
'Johnson': {'Expert One-on-One J2EE Design and Development'}}" />
		<s:form action="x">
			<s:doubleselect label="�п���z���w���Ϯ�" size="3" name="author"
				list="#bs.keySet()" doubleList="#bs[top]" doubleSize="3"
				doubleName="book" />
		</s:form>
	</body>
</html>
