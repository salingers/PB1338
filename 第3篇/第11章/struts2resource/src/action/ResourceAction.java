package action;

import com.opensymphony.xwork2.ActionSupport;

public class ResourceAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String user;

	@Override
	public String execute() throws Exception {

		System.out.println(getText("content"));
		//�H�U�bACtion����X�a�e��Ū���ڤưT��
		String s[] ={getUser(),"�������I"};
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
