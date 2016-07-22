package com.netbank.action;

import java.util.Map;
import java.util.regex.Pattern;

import javax.annotation.Resource;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.netbank.biz.*;
import com.netbank.entity.*;
import com.opensymphony.xwork2.ActionSupport;

public class PersoninfoAction extends ActionSupport implements RequestAware,SessionAware {
	//定義透過@Resource註釋植入的屬性personinfoBiz，可省略set方法
	@Resource private PersoninfoBiz personinfoBiz;
	Map<String, Object> request;
	Map<String, Object> session;	
	private Personinfo personinfo;
	
	/**
	 * 修改個人訊息
	 * @return
	 */
	public String modify(){
		//從session中取得儲存的個人訊息物件
		Personinfo per=(Personinfo) session.get("personinfo");
		//使用modify.jsp頁面表單參數更新個人訊息物件中的屬性
		per.setAddress(personinfo.getAddress());
		per.setAge(personinfo.getAge());
		per.setCardid(personinfo.getCardid());
		per.setRealname(personinfo.getRealname());
		per.setSex(personinfo.getSex());
		per.setTelephone(personinfo.getTelephone());
		//將個人訊息更新到資料庫中
		if(personinfoBiz.modifyPersoninfo(per)){
			//更新成功後，將個人訊息物件重新存入session儲存
			session.put("personinfo",per);
			request.put("message", "修改成功!");
			return "message";
		}			
		request.put("message", "修改失敗!");
		return "message";
	}
	
	/**
	 * 修改個人訊息頁面驗證
	 */
	public void validateModify() {
		if("".equals(personinfo.getTelephone().trim())){
			personinfo.setTelephone("電話不詳");
		}
		if(!(personinfo.getAge()>18&&personinfo.getAge()<100)){
			addFieldError("personinfo.age", "年齡不符");
		}
		if(!Pattern.compile("^\\d{17}(\\d|x)$").matcher(personinfo.getCardid().toString()).matches()){
			addFieldError("personinfo.cardId", "身份證格式不正確");
		}
		if(!"電話不詳".equals(personinfo.getTelephone().trim())&&!Pattern.compile("^(?:1[358]\\d{9}|\\d{3,4}-\\d{8,9})$").matcher(personinfo.getTelephone()).matches()){
			addFieldError("personinfo.telephone", "電話格式不正確");
		}
	}
	
	public Personinfo getPersoninfo() {
		return personinfo;
	}
	public void setPersoninfo(Personinfo personinfo) {
		this.personinfo = personinfo;
	}
	
	public void setRequest(Map<String, Object> request) {
		this.request=request;

	}

	public void setSession(Map<String, Object> session) {
		this.session=session;

	}

}
