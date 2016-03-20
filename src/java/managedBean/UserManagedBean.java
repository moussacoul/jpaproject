/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;
import entites.User;
import entites.UserFacade;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
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
@RequestScoped 

public class UserManagedBean  implements Serializable{
    private static final long serialVersionUID = 1L;

    public UserFacade getCurrentUserFacade() {
        return currentUserFacade;
    }
    
    @EJB
    private UserFacade currentUserFacade;
    private String mail;
    private String name;
    private String firstname;
    private String address;
    private Date birthdate;
    private String pass;
    private String confirmerPass;
    private String phoneNumber;
    private String titreCV;
    private static int idUser;
    private static User currentUser =null;
    
    private String login = "Moussa";
    
    

    public String getTitreCV() {
        return titreCV;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setTitreCV(String titreCV) {
        this.titreCV = titreCV;
    }
   
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
        currentUserFacade.create(u);
    }
    
    public List<User> findAll(){
        return this.currentUserFacade.findAll();
    }

   
    public String isExist() throws UnsupportedEncodingException{ // faire un select where
        currentUser = new User();
        currentUser =currentUserFacade.findByEmail(mail);
        if(currentUser!= null){
            if(currentUserFacade.find(currentUser.getIdUser()) != null && currentUser.getPass().equals(pass)){
                idUser = currentUser.getIdUser();
                name = currentUser.getNom();
                firstname = currentUser.getPrenom();
                pass = currentUser.getPass();
                phoneNumber = currentUser.getTelephone();
                titreCV = currentUser.getTitreCV();
                /*
                FacesContext context = FacesContext.getCurrentInstance();
                Map<String, String> paramMap = context.getExternalContext().getRequestParameterMap();
                String email = paramMap.get("j_idt6:email");//return current currentUser
                //currentUser = currentUserFacade.find(currentUserFacade.findByEmail(email).getIdUser());
                System.out.println(paramMap.keySet() + " okokkkkkkkkkkkkkkkkkkkkkkk" + email + "  "+currentUser.getIdUser());
                /*String mesParametres = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().values().toString(); 
                System.out.println(mesParametres.getBytes("email")+"loginnnnnnnnnnnnnnnnnnnnnn");*/
              //  currentUser = 
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
        if(mail.contains("@") && pass.equals(confirmerPass) && currentUserFacade.findByEmail(mail) == null){
            User u = new User();
            u.setEmail(mail);
            u.setPass(pass);
            this.currentUserFacade.create(u);
            currentUser = currentUserFacade.findByEmail(mail);
            idUser = currentUser.getIdUser();
            return "cv";
        }
        return "inscription";
    }
    
      public String insertUserInfo(){
          
      currentUser = currentUserFacade.insertUserInfo(pass, name, firstname, phoneNumber, birthdate, address, mail,titreCV);
      if(currentUser!=null){
          return "cv";
      }        
       
        return "informationPersonnelle";
        
    }
    
      public static User getCurrentUser(){
          return currentUser;
      }
      
      public int getUserId(){
          return idUser;
      }
}
