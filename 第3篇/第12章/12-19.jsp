<%@ page contentType="text/html; charset=GBK" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>
	<head>
		<title>�ϥ�s:tree�Ms:treenode��ñ�����R�A��</title>
		<sx:head />
	</head>
	<body>
		<h3>
			�ϥ�s:tree�Ms:treenode��ñ�����R�A��
		</h3>
		<sx:tree label="�Ϯ�" id="book" showRootGrid="true" showGrid="true"
			treeSelectedTopic="treeSelected">
			<sx:treenode label="��" id="yeeku">
				<sx:treenode label="Spring2.0" id="spring" />
				<sx:treenode label="J2EE" id="lightweight" />
				<sx:treenode label="Ajax" id="ajax" />
			</sx:treenode>
			<sx:treenode label="David" id="David">
				<sx:treenode label="JavaScript: The Definitive Guide"
					id="javascript" />
			</sx:treenode>
			<sx:treenode label="Johnson" id="Johnson">
				<sx:treenode label="Expert One-on-One J2EE Design and Development"
					id="j2ee" />
			</sx:treenode>
		</sx:tree>
	</body>
</html>
