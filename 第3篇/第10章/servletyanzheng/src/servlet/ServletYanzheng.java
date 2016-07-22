package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletYanzheng extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ServletYanzheng() {
		super();
	}

	public void destroy() {
		super.destroy();
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("gbk");
		PrintWriter out = response.getWriter();
		String userString = request.getParameter("user");
		String pasString = request.getParameter("pass");
		String errorString = null;
		
		if (userString == null || "".equals(userString.trim())) {
			errorString = "�ϥΪ̦W�٤��ର�šI";
			out.println("��ƫD�k�A�T���p�U�G");
			out.println(errorString);
		} else {
			Pattern p = Pattern.compile("\\w{6,20}");
			Matcher m = p.matcher(userString.trim());
			if (!m.matches()) {
				errorString="�ϥΪ̦W�٥ѤU���u�B�Ʀr�B�^��r���s�զ��A���׬�4-20�I";
				out.println("��ƫD�k�A�T���p�U�G");
				out.println(errorString);
			} 
		}
		
		if (pasString == null || "".equals(pasString.trim())) {
			errorString = "�K�X���ର�šI";
			out.println(errorString);
		} else {
			int s = pasString.trim().length();
			if (s<6 || s>30) {
				errorString="�K�X���׬����Ӧb6-30�����I";
				out.println(errorString);
			} 
		}
		
		if (errorString==null) {
			out.println("���Ҧ��\�I�i�H�i�J�t�ΡI");
		}
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

	public void init() throws ServletException {
		// Put your code here
	}

}
