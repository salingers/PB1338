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
			errorString = "使用者名稱不能為空！";
			out.println("資料非法，訊息如下：");
			out.println(errorString);
		} else {
			Pattern p = Pattern.compile("\\w{6,20}");
			Matcher m = p.matcher(userString.trim());
			if (!m.matches()) {
				errorString="使用者名稱由下劃線、數字、英文字元群組成，長度為4-20！";
				out.println("資料非法，訊息如下：");
				out.println(errorString);
			} 
		}
		
		if (pasString == null || "".equals(pasString.trim())) {
			errorString = "密碼不能為空！";
			out.println(errorString);
		} else {
			int s = pasString.trim().length();
			if (s<6 || s>30) {
				errorString="密碼長度為應該在6-30之間！";
				out.println(errorString);
			} 
		}
		
		if (errorString==null) {
			out.println("驗證成功！可以進入系統！");
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
