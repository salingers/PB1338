package com.zxpm.action;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport implements RequestAware,SessionAware {
	Map<String, Object> request;
	Map<String, Object> session;
	public void setRequest(Map<String, Object> request) {
		this.request=request;		
	}
	public void setSession(Map<String, Object> session) {
		this.session=session;		
	}
	private File doc;      
	private String fileName;      
	private String contentType;       
	public void setDoc(File file)  {          
		this.doc = file;   
	}
	public void setDocFileName(String fileName){          
		this.fileName = fileName;      
		}       
	public void setDocContentType(String contentType){          
		this.contentType = contentType;      
	}       
   @Override 
   public String execute() throws Exception{  
	    // 得到目前web專案下的/pic目錄的在本機的絕對路徑，若果沒有這個資料夾則會建立        
	    String targetDirectory = ServletActionContext.getServletContext().getRealPath("/pic");          
	    //更名上傳檔案         
	    String targetFileName = generateFileName(fileName);          
	    //在指定目錄建立檔案          
	    File target = new File(targetDirectory, targetFileName);          
	    //把要上傳的檔案copy過去         
	    FileUtils.copyFile(doc, target);  
	    //將檔案相對路徑存入session中，以便後面寫入資料表goods中
	    session.put("filepath", "pic/"+targetFileName);
	    return "success";      
    }      
    //更名上傳檔案（非必須）      
    public String generateFileName(String fileName){          
    	String formatDate = new SimpleDateFormat("yyMMddHHmmss").format(new Date());          
    	int random = new Random().nextInt(10000);          
    	int position = fileName.lastIndexOf(".");          
    	String extension = fileName.substring(position);           
    	return formatDate + random + extension;      
    }       
    public String getFileName(){          
    	return fileName;      
    }
}
