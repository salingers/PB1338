<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>�ϥ�s:radio���ͦh�ӳ���</title>
		<s:head />
	</head>
	<body>
		<h3>
			�ϥ�s:radio���ͦh�ӳ���
		</h3>
		<s:form>
			<!-- �ϥ�²�涰�X�Ӳ��ͦh�ӳ��� -->
			<s:radio name="a" label="�п���z���w���Ϯ�" labelposition="top"
				list="{'Spring2.0' , 'Spring In Action' , 'JavaScript: The Definitive Guide'}" />
			<!-- �ϥ�²��Map����Ӳ��ͦh�ӳ��� -->
			<s:radio name="b" label="�п���z�Q����X�����" labelposition="top"
				list="#{'Spring2.0':'2006�~10��' , 'J2EE':'2007��4��' , 'Ajax':'2007�~6��'}"
				listKey="key" listValue="value" />
			<s:bean name="com.struts.BookService" id="bs" />
			<!-- �ϥζ��X�̩�h��JavaBean�רҨӲ��ͦh�ӳ��� -->
			<s:radio name="c" label="�п���z���w���Ϯ�" labelposition="top"
				list="#bs.books" listKey="author" listValue="name" />
		</s:form>
	</body>
</html>
