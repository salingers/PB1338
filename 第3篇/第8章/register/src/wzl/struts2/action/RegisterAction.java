package wzl.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
public class RegisterAction extends ActionSupport{
	//登錄人id
	private int id;
	//登錄人姓名
	private String name;
	//登錄人年齡
	private int age;
	//登錄人體重
	private double weight;
	//登錄人性別
	private String sex;
	//登錄人職位
	private String position;	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
    //其它屬性的 setter,getter方法......
	public String execute(){
		//實際開發中呼叫背景業務邏輯或是存取資料庫
		return "success";
	}	
}
