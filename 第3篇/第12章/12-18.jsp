<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
		<title>�ϥ�s:updownselect���ͥi�W�U�h���ﶵ���U�Կ����</title>
		<s:head />
	</head>
	<body>
		<h3>
			�ϥ�s:updownselect���ͥi�W�U�h���ﶵ���U�Կ����
		</h3>
		<s:form>
			<!-- �ϥ�²�涰�X�Ӳ��ͥi�W�U�h���ﶵ���U�Կ���� -->
			<s:updownselect name="a" label="�п���z���w���Ϯ�" labelposition="top"
				moveUpLabel="�V�W�h��"
				list="{'Spring2.0' , 'J2EE' , 'JavaScript: The Definitive Guide'}" />
			<!-- �ϥ�²��Map����Ӳ��ͥi�W�U�h���ﶵ���U�Կ����
�B�ϥ�emptyOption="true"�W�[�@�Ӫſﶵ-->
			<s:updownselect name="b" label="�п���z�Q����X�����" labelposition="top"
				moveDownLabel="�V�U�h��"
				list="#{'Spring2.0':'2006�~10��' , 'J2EE':'2007��4��' , 'Ajax':'2007�~6��'}"
				listKey="key" emptyOption="true" listValue="value" />
			<s:bean name="com.struts.BookService" id="bs" />
		<!-- �ϥζ��X�̩�h��JavaBean�רҨӥi�W�U�h���ﶵ�����ͤU�Կ���� -->
			<s:updownselect name="c" label="�п���z���w���ϮѪ��@��" labelposition="top"
				selectAllLabel="�������" multiple="true" list="#bs.books"
				listKey="author" listValue="name" />
		</s:form>
	</body>
</html>
