import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class MessageAction extends ActionSupport implements ServletRequestAware {

	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;

	@Override
	public String execute() throws Exception {
		request.setAttribute("hello", "§A¦nStruts2");
		return super.execute();
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}

