<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>�ϥ�s:optgroup���ͤU�Կ���ت��ﶵ�s��</title>
		<s:head />
	</head>
	<body>
		<h3>
			�ϥ�s:optgroup���ͤU�Կ���ت��ﶵ�s��
		</h3>
		<s:form>
			<!-- �ϥ�Map����Ӳ��ͤU�Կ���ت��ﶵ�s�� -->
			<s:select label="����z���w���Ϯ�" name="book"
				list="#{'Spring2.0':'����','J2EE':'��','Ajax�_��':'��'}" listKey="value"
				listValue="key">
				<s:optgroup label="Rod Johnson"
					list="#{'Expert One-on-One J2EE Design and Development':'Johnson'}"
					listKey="value" listValue="key" />
				<s:optgroup label="David Flanagan"
					list="#{'JavaScript: The Definitive Guide':'David'}"
					listKey="value" listValue="key" />
			</s:select>
		</s:form>
	</body>
</html>
