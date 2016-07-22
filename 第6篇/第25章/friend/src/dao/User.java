package dao;



/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User  implements java.io.Serializable {


    // Fields    

     private Integer iduser;
     private String nameuser;
     private Integer ageuser;
     private String sexuser;
     private String emailuser;
     private String passworduser;


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(String nameuser, String passworduser) {
        this.nameuser = nameuser;
        this.passworduser = passworduser;
    }
    
    /** full constructor */
    public User(String nameuser, Integer ageuser, String sexuser, String emailuser, String passworduser) {
        this.nameuser = nameuser;
        this.ageuser = ageuser;
        this.sexuser = sexuser;
        this.emailuser = emailuser;
        this.passworduser = passworduser;
    }

   
    // Property accessors

    public Integer getIduser() {
        return this.iduser;
    }
    
    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public String getNameuser() {
        return this.nameuser;
    }
    
    public void setNameuser(String nameuser) {
        this.nameuser = nameuser;
    }

    public Integer getAgeuser() {
        return this.ageuser;
    }
    
    public void setAgeuser(Integer ageuser) {
        this.ageuser = ageuser;
    }

    public String getSexuser() {
        return this.sexuser;
    }
    
    public void setSexuser(String sexuser) {
        this.sexuser = sexuser;
    }

    public String getEmailuser() {
        return this.emailuser;
    }
    
    public void setEmailuser(String emailuser) {
        this.emailuser = emailuser;
    }

    public String getPassworduser() {
        return this.passworduser;
    }
    
    public void setPassworduser(String passworduser) {
        this.passworduser = passworduser;
    }
   








}