package wzl.struts2.converter;

import java.util.Map;
import ognl.DefaultTypeConverter;
import wzl.struts2.domian.Rectangle;
public class RectangleConverter extends DefaultTypeConverter{
	 	@Override
	 	/*
	 	 * context �O���A�ഫ���Ҫ��W�U��
�@�@ 	 * value �O���n�ഫ���Ѽ�,��V���P,value�����A�]�O���P��.
�@�@ 	 * toType�O�ഫ�᪺�ت����A,
�@�@              * �Ǧ^�ȬO : �ഫ�᪺�ت����A, ��V���P,���A�]�O���P��.
	 	 */
	    public Object convertValue(final Map context, 
              final Object value, final Class toType){
	 
		 	//�q���r���ର Rectangle����
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
	        //�q�����ର�r��
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
