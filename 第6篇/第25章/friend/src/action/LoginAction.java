package action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import biz.SelectBiz;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String nameuser;
	private String passworduser;

	public String getNameuser() {
		return nameuser;
	}

	public void setNameuser(String nameuser) {
		this.nameuser = nameuser;
	}

	public String getPassworduser() {
		return passworduser;
	}

	public void setPassworduser(String passworduser) {
		this.passworduser = passworduser;
	}
	
	boolean login = false;
	@Override
	public String execute() throws Exception {
		SelectBiz selectBiz = new SelectBiz();
		login = selectBiz.login(this.getNameuser(), this.passworduser);
		if (login == true) {
			ActionContext actionContext = ActionContext.getContext();
			Map session = actionContext.getSession();
			session.put("user", this.getNameuser());
			
			friendList();
			messageList();
			
			return SUCCESS;
		} else {
			addFieldError("nameuser", "使用者名稱或密碼有誤！");
			return LOGIN;
		}

	}

	public void friendList() {
		SelectBiz selectBiz = new SelectBiz();
		List list = null;
		if (login == true) {
			list = selectBiz.getFriend(this.getNameuser());
			HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			request.setAttribute("friendlist", list);
		}
	}
	
	public void messageList() {
		SelectBiz selectBiz = new SelectBiz();
		List list = null;
		if (login == true) {
			list = selectBiz.getMessage(this.getNameuser());
			HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			request.setAttribute("messagelist", list);
		}
	}

}
