package dao;

import java.sql.Timestamp;


/**
 * Message entity. @author MyEclipse Persistence Tools
 */

public class Message  implements java.io.Serializable {


    // Fields    

     private Integer idmessage;
     private String username;
     private String liuname;
     private String message;
     private Timestamp messagetime;


    // Constructors

    /** default constructor */
    public Message() {
    }

    
    /** full constructor */
    public Message(String username, String liuname, String message, Timestamp messagetime) {
        this.username = username;
        this.liuname = liuname;
        this.message = message;
        this.messagetime = messagetime;
    }

   
    // Property accessors

    public Integer getIdmessage() {
        return this.idmessage;
    }
    
    public void setIdmessage(Integer idmessage) {
        this.idmessage = idmessage;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getLiuname() {
        return this.liuname;
    }
    
    public void setLiuname(String liuname) {
        this.liuname = liuname;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getMessagetime() {
        return this.messagetime;
    }
    
    public void setMessagetime(Timestamp messagetime) {
        this.messagetime = messagetime;
    }
   








}