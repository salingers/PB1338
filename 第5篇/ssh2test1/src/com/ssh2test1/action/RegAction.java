package com.ssh2test1.action;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh2test1.biz.UserBiz;

public class RegAction extends ActionSupport {
	//�w�q�Ω�ʸ˪��Ѽƪ��ݩ�
	private String loginName;
	private String loginPwd;
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	//�ϥ�UserBiz�ŧi�@�Ӫ���A�å[�Jset��k�Ω�̴ۨӤJ
	UserBiz userBiz;	
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	
	//�ˬd�ϥΪ̦W�٬O�_�w�ϥ�
	public String doCheckUserExists() throws IOException{
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setCharacterEncoding("gbk");
		PrintWriter out=response.getWriter();
		boolean isEixist = userBiz.isExist(loginName);
		out.print(isEixist);
		return null;		
	}
	
	//�n��
	public String reg() throws IOException{
		//�ٲ������n�����{���X
		return null;		
	}
}
