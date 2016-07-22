package dao;



/**
 * Friend entity. @author MyEclipse Persistence Tools
 */

public class Friend  implements java.io.Serializable {


    // Fields    

     private Integer idfriend;
     private String username;
     private String fname;


    // Constructors

    /** default constructor */
    public Friend() {
    }

    
    /** full constructor */
    public Friend(String username, String fname) {
        this.username = username;
        this.fname = fname;
    }

   
    // Property accessors

    public Integer getIdfriend() {
        return this.idfriend;
    }
    
    public void setIdfriend(Integer idfriend) {
        this.idfriend = idfriend;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getFname() {
        return this.fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
   








}