<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>�ϥ�s:select���ͤU�Կ����</title>
		<s:head />
	</head>
	<body>
		<h3>
			�ϥ�s:select���ͤU�Կ����
		</h3>
		<s:form>
			<!-- �ϥ�²�涰�X�Ӳ��ͤU�Կ���� -->
			<s:select name="a" label="�п���z���w���Ϯ�" labelposition="top"
				multiple="true"
			list="{'Spring2.0' , 'J2EE' , 'JavaScript: The Definitive Guide'}" />
			<!-- �ϥ�²��Map����Ӳ��ͤU�Կ���� -->
			<s:select name="b" 
label="�п���z�Q����X�����" labelposition="top"
				list="#{'Spring2.0':'2006�~10��' , 'J2EE':'2007��4��' , 'Ajax':'2007�~6��'}"
				listKey="key" listValue="value" />
			<s:bean name="com.struts.BookService" id="bs" />
			<!-- �ϥζ��X�̩�h��JavaBean�רҨӲ��ͤU�Կ���� -->
			<s:select name="b" label="�п���z���w���Ϯ�" labelposition="top"
				multiple="true" list="#bs.books" listKey="author"
 listValue="name" />
		</s:form>
	</body>
</html>
