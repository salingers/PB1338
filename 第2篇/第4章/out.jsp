<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
	<head>
		<title>out物件簡單案例</title>
	</head>

	<body>
		<h1>	out物件範例		</h1><br>
		<p>
			緩沖區大小為：<%=out.getBufferSize()%><br>
			是否自動清除緩沖區：<%=out.isAutoFlush()%><br>
			緩沖區目前所剩：<%=out.getRemaining()%><br>
		</p>
	</body>
</html>
