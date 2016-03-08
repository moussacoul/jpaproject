/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;
import bean.utilisateurBean;
import entites.User;
import entites.UserFacade;
import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Moussa
 */
@ManagedBean
@SessionScoped

public class UserManagedBean  implements Serializable{
    //private static final long serialVersionUID = 1L;
    
    @EJB
    private UserFacade userFacade;
    private String mail;
    private String name;
    private String firstname;
    private String address;
    private Date birthdate;
    private String pass;
    private String confirmerPass;
    private String phoneNumber;
    private String titreCV;

    public String getTitreCV() {
        return titreCV;
    }

    public void setTitreCV(String titreCV) {
        this.titreCV = titreCV;
    }
    private static int idUser;
    private static User user = null;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
  
    
    private List<User> allUser;

   
    public String getConfirmerPass() {
        return confirmerPass;
    }

    public void setConfirmerPass(String confirmerPass) {
        this.confirmerPass = confirmerPass;
    }
    

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    } 
    public void test(){
        System.out.println("mail = " + mail + " pass = "+ pass );
        User u = new User();
        u.setEmail(mail);
        u.setPass(pass);
        userFacade.create(u);
    }
    
    public List<User> findAll(){
        return this.userFacade.findAll();
    }

   
    public String isExist(){ // faire un select where
        user =userFacade.findByEmail(mail);
        if(user!= null){
            if(userFacade.find(user.getIdUser()) != null && user.getPass().equals(pass)){
                idUser = user.getIdUser();
                String mesParametres = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().values().toString(); 
                System.out.println(mesParametres+"loginnnnnnnnnnnnnnnnnnnnnn");
             return "cv";
            }
                
            return "login";
        }
        
        /*allUser = findAll();
        for(User u : allUser){
            if(u.getEmail().equals(mail) && u.getPass().endsWith(pass)) return "cv";
        }*/
        return "login";
    }
   
    public String inscription(){
        if(mail.contains("@") && pass.equals(confirmerPass) && userFacade.findByEmail(mail) == null){
            User u = new User();
            u.setEmail(mail);
            u.setPass(pass);
            this.userFacade.create(u);
            user = userFacade.findByEmail(mail);
            idUser = user.getIdUser();
            return "cv";
        }
        return "inscription";
    }
    
      public String insertUserInfo(){
          
      user = userFacade.insertUserInfo(pass, name, firstname, phoneNumber, birthdate, address, mail,titreCV);
      if(user!=null){
          return "cv";
      }        
       
        return "informationPersonnelle";
        
    }
    
      public static User getCurrentUser(){
          return user;
      }
      
      public int getUserId(){
          return idUser;
      }
}
