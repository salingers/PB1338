<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>
�ϥ�s:optiontransferselect�Ӳ��ͩ�����M�涵���U�Ԧ����
</title>
		<s:head />
	</head>
	<body>
		<h3>
			�ϥ�s:optiontransferselect�Ӳ��ͩ�����M�涵���U�Ԧ����
		</h3>
		<s:form>
			<!-- �ϥ�²�涰�X����Ӳ��ͩ�������U�Ԧ���� -->
			<s:optiontransferselect label="�п���A���w���Ϯ�" name="cnbook"
				leftTitle="����ϮѡG" rightTitle="�~��Ϯ�"
				list="{'Spring2.0','J2EE','Ajax'}" multiple="true"
				addToLeftLabel="�V���h��" selectAllLabel="�������"
				addAllToRightLabel="�����k��" headerKey="cnKey"
				headerValue="--- �������Ϯ� ---" emptyOption="true"
				doubleList="{'Expert One-on-One J2EE Design and Development', 
'JavaScript: The Definitive Guide'}"
				doubleName="enBook" doubleHeaderKey="enKey"
				doubleHeaderValue="--- ����~��Ϯ� ---" 
doubleEmptyOption="true"
				doubleMultiple="true" />
		</s:form>
	</body>
</html>
