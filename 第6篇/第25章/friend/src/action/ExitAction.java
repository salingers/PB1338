package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ExitAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	@Override
	public String execute() throws Exception {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		session.clear();
		return SUCCESS;
	}
}
