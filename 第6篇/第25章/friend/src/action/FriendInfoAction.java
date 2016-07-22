package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import biz.SelectBiz;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.Friend;
import dao.User;

public class FriendInfoAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		ActionContext actionContext = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) actionContext.get(ServletActionContext.HTTP_REQUEST);

	    String name = new String(request.getParameter("name").getBytes("ISO8859_1"), "utf-8"); 
		
		SelectBiz selectBiz = new SelectBiz();
		List list = selectBiz.getfriendinfo(name);
		request.setAttribute("friendinfolist", list);
		request.setAttribute("infoname", name);
		return SUCCESS;
	}
	
	public String allFriend() throws Exception {
		ActionContext actionContext = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) actionContext.get(ServletActionContext.HTTP_REQUEST);

	    String name = new String(request.getParameter("name").getBytes("ISO8859_1"), "utf-8"); 
	    SelectBiz selectBiz = new SelectBiz();
	    List list = selectBiz.getFriend(name);
	    request.setAttribute("allfriendlist", list);
		return SUCCESS;
	}
}
