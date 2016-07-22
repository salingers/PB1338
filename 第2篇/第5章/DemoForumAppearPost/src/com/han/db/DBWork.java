package com.han.db;

public class DBWork {
	
	public int addPost(String postTitle,String postContent){
		int result;
		String sql = "insert into post(postTitle,postContent) values('"+postTitle+"','"+postContent+"');";
		DBConn dbconn = new DBConn();
		result = dbconn.noSelectInfo(sql);
		return result;
	}
}
