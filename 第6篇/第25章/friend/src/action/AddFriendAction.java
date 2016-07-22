package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import biz.AddFriendBiz;
import biz.SelectBiz;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.Friend;

public class AddFriendAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {

		ActionContext actionContext = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) actionContext.get(ServletActionContext.HTTP_REQUEST);
	    String name = new String(request.getParameter("name").getBytes("ISO8859_1"), "utf-8"); 
		
	    SelectBiz selectBiz = new SelectBiz();
	    List list = selectBiz.getAllUser(name);
	    request.setAttribute("alluser", list);
		return SUCCESS;
	}
	
	public String addFriend() throws Exception {

		ActionContext actionContext = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) actionContext.get(ServletActionContext.HTTP_REQUEST);
	    String me = new String(request.getParameter("me").getBytes("ISO8859_1"), "utf-8"); 
	    String username = new String(request.getParameter("user").getBytes("ISO8859_1"), "utf-8"); 
	    
	    Friend friend = new Friend();
	    friend.setFname(username);
	    friend.setUsername(me);
	    new AddFriendBiz(friend);
	    
		return SUCCESS;
	}

}
