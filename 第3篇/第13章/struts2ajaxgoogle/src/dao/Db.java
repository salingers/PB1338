package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection con = null;
		String url = "jdbc:mysql://127.0.0.1:3306/mysql";
		String userName = "root";
		String pwd = "";
		try {
			con = DriverManager.getConnection(url, userName, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public ResultSet getKeyWord(String key){
		String sql = "select name from help_keyword where name like \""+key+"%\"";
		System.out.println(sql);
		Connection con = getConnection();
		ResultSet rs =null;
		Statement stm = null;
		try {
			stm  = con.createStatement();
			rs = stm.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

}
