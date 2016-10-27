package wzl.struts2.action;

import wzl.struts2.domian.Rectangle;
import com.opensymphony.xwork2.ActionSupport;

public class AreaAction extends ActionSupport
{
	private Rectangle rectangle;

	public Rectangle getRectangle()
	{
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle)
	{
		this.rectangle = rectangle;
	}

	public String execute()
	{
		return "success";
	}
}
