package com.hibtest2;

import com.hibtest2.dao.BaseHibernateDAO;
import com.hibtest2.entity.Books;
import com.hibtest2.entity.Publishers;

public class TestM2OAndO2M extends BaseHibernateDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestM2OAndO2M m2o_o2m=new TestM2OAndO2M();
		//m2o_o2m.testAdd_1();
		//m2o_o2m.testAdd_2();
		//m2o_o2m.testAdd_3();
		//m2o_o2m.testAdd_4();
		//m2o_o2m.testDelete_1();
		//m2o_o2m.testDelete_2();
		m2o_o2m.testUpdate();
	}
	public void testAdd_1(){
        //加入出版社訊息
		Publishers publishers=new Publishers();
		publishers.setName("電子工業出版社");
		super.add(publishers);		
	}
	public void testAdd_2(){		
	    //載入得到電子工業出版社實體物件
		Publishers dzgy=(Publishers)super.get(Publishers.class, new Integer(4));
		//新增圖書物件
		Books book1=new Books();		
		book1.setTitle("單元測試之道C#版");
		book1.setAuthor("（美）托馬斯等");
		//將電子工業出版社物件設定到實體物件Books的publishers屬性中
		book1.setPublishers(dzgy);
		//將圖書物件儲存到資料庫
		super.add(book1);	
		//新增圖書物件
		Books book2=new Books();
		book2.setTitle("C++網路寫程式，卷冊1");
		book2.setAuthor("（美）施密特");
		//將電子工業出版社物件設定到實體物件Books的publishers屬性中
		book2.setPublishers(dzgy);
		//將圖書物件儲存到資料庫
		super.add(book2);	
	}

	public void testAdd_3(){
	    //建立水利水電出版社物件
		Publishers publishers=new Publishers();
		publishers.setName("水利水電出版社");
		//建立第一個Books物件
		Books book1=new Books();		
		book1.setTitle("二級C語系程式設計");
		book1.setAuthor("侯東昌，宋智玲等");	
	    //建立第二個Book物件			
		Books book2=new Books();
		book2.setTitle("Visual Basic.NET");
		book2.setAuthor("徐振明主編");		
		//建立Publishers物件和Books物件的一對多雙向關聯關系，
		//只需從Publishers一方進行維護即可
		publishers.getBks().add(book1);
		publishers.getBks().add(book2);
		//儲存Publishers物件
		super.add(publishers);
	}
	
	public void testAdd_4(){
		//建立一個Publishers物件
    	Publishers publishers=new Publishers();
		publishers.setName("西安電子科技大學出版社");
		//建立兩個Books物件
		Books book1=new Books();		
		book1.setTitle("Windows CE套用程式設計");
		book1.setAuthor("張勇,許波編著");
		Books book2=new Books();
		book2.setTitle("MATLAB及其在...");
		book2.setAuthor("陳懷琛 編著");
		//由於將關聯關系交給Books來維護，所以在儲存時必須明確地
	    //將Publishers設定給Books，即Books必須呼叫setPublishers()方法
		book1.setPublishers(publishers);
		book2.setPublishers(publishers);		
	    //建立Publishers物件和Books物件的一對多雙向關聯關系，並儲存Publishers物件
		publishers.getBks().add(book1);
		publishers.getBks().add(book2);		
		super.add(publishers);
	}
	
	public void testDelete_1(){
		//載入待移除的Books物件
		Books book=(Books)super.get(Books.class, new Integer(4939));
	    //呼叫父類別的delete方法移除物件
		super.delete(book);
	}
	
	public void testDelete_2(){
		//載入水利水電出版社物件
		Publishers publisher=(Publishers)super.get(Publishers.class, new Integer(5));
		super.delete(publisher);	
	}
	
	public void testUpdate(){
	    //載入"Windows CE套用程式設計"圖書實體物件
		Books web_yykf=(Books)super.get(Books.class, new Integer(4958));
		//載入"西安電子科技大學出版社"和"機械工業出版社"兩個出版社實體物件
	    Publishers xadz=(Publishers)super.get(Publishers.class, new Integer(6));
		Publishers jxgy=(Publishers)super.get(Publishers.class, new Integer(3));
		//從"西安電子科技大學出版社"物件的 bks屬性中移除圖書"Windows CE套用程式設計"，
		//並新增到"機械工業出版社"的bks屬性中，同時將"機械工業出版社"設定到該圖書物件中
	    xadz.getBks().remove(web_yykf);	
	    jxgy.getBks().add(web_yykf);
		web_yykf.setPublishers(jxgy);
	    //更新"Windows CE套用程式設計"圖書物件
		super.update(web_yykf);
	}


}
