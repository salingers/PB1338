package action;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import dao.Db;

public class KeyAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	public List getName(String key) throws SQLException {
		Db db = new Db();
		ResultSet rs = db.getKeyWord(key);
		List list = new ArrayList();
		ResultSetMetaData md = rs.getMetaData();
		int columnCount = md.getColumnCount(); // Map rowData;
		while (rs.next()) { 
			Map rowData = new HashMap();
			for (int i = 1; i <= columnCount; i++) {
				rowData.put(md.getColumnName(i), rs.getObject(i));
			}
			list.add(rowData);
		}
		return list;
	}
}
