package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}


	public void destroy() {
		super.destroy(); 

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		if("niukor".equals(user) && "123456".equals(pass)){
			out.print("<font seize=20 color=red>歡迎你，niukor</font>");
		}else{
			out.print("<h2>使用者名稱或密碼錯誤！</h2>");
		}

		out.flush();
		out.close();
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void init() throws ServletException {
		
	}

}
