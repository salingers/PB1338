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
	    // �o��ثeweb�M�פU��/pic�ؿ����b������������|�A�Y�G�S���o�Ӹ�Ƨ��h�|�إ�        
	    String targetDirectory = ServletActionContext.getServletContext().getRealPath("/pic");          
	    //��W�W���ɮ�         
	    String targetFileName = generateFileName(fileName);          
	    //�b���w�ؿ��إ��ɮ�          
	    File target = new File(targetDirectory, targetFileName);          
	    //��n�W�Ǫ��ɮ�copy�L�h         
	    FileUtils.copyFile(doc, target);  
	    //�N�ɮ׬۹���|�s�Jsession���A�H�K�᭱�g�J��ƪ�goods��
	    session.put("filepath", "pic/"+targetFileName);
	    return "success";      
    }      
    //��W�W���ɮס]�D�����^      
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
