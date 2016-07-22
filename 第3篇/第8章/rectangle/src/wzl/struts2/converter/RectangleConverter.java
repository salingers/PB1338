package wzl.struts2.converter;

import java.util.Map;
import ognl.DefaultTypeConverter;
import wzl.struts2.domian.Rectangle;
public class RectangleConverter extends DefaultTypeConverter{
	 	@Override
	 	/*
	 	 * context 是型態轉換環境的上下文
　　 	 * value 是須要轉換的參數,方向不同,value的型態也是不同的.
　　 	 * toType是轉換後的目的型態,
　　              * 傳回值是 : 轉換後的目的型態, 方向不同,型態也是不同的.
	 	 */
	    public Object convertValue(final Map context, 
              final Object value, final Class toType){
	 
		 	//從表單字串轉為 Rectangle物件
	        if (Rectangle.class == toType)
	        {
	            final Rectangle rectangle = new Rectangle();
	            final String[] str = (String[]) value;
	            final String[] param = str[0].split(",");
	            final double length = Double.parseDouble(param[0]);
	            final double width = Double.parseDouble(param[1]);

	            rectangle.setLength(length);
	            rectangle.setWidth(width);
	            return rectangle;
	        }
	        //從物件轉為字串
	        if (String.class == toType)
	        {
	            final Rectangle rectangle = (Rectangle) value;
	            final double length = rectangle.getLength();
	            final double width = rectangle.getWidth();
	            final String area = (length*width)+"";
	            return area;
	        }
	        return null;
	    }
}
