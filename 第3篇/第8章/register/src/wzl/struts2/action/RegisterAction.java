package wzl.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
public class RegisterAction extends ActionSupport{
	//�n���Hid
	private int id;
	//�n���H�m�W
	private String name;
	//�n���H�~��
	private int age;
	//�n���H�魫
	private double weight;
	//�n���H�ʧO
	private String sex;
	//�n���H¾��
	private String position;	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
    //�䥦�ݩʪ� setter,getter��k......
	public String execute(){
		//��ڶ}�o���I�s�I���~���޿�άO�s����Ʈw
		return "success";
	}	
}
