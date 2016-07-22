package action;

import com.opensymphony.xwork2.ActionSupport;

public class ResourceAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String user;

	@Override
	public String execute() throws Exception {

		System.out.println(getText("content"));
		//以下在ACtion中輸出帶占位符的國際化訊息
		String s[] ={getUser(),"玩游戲！"};
		String msg = getText("welcome",s);
		System.out.print(msg);
		return super.execute();
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}
