/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entites.User;
import entites.UserFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import managedBean.*;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Moussa
 */
@Named(value = "utilisateurBean")
@Dependent
public class utilisateurBean {
    
    
    @EJB
    private UserFacade userFacade;
   
   
    private User u;
    private String mail;
    private String pass;

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

    public UserFacade getUserFacade() {
        return userFacade;
    }

    public void setUserFacade(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    
    public void findAll(){
        List<User> user = this.userFacade.findAll();
        
        for(User u : user){
            System.out.println(u.getEmail()+ "  "+ u.getPass() + " ttttttttttttttttttt");
        }
        
       
       /* User u = new User();
        u.setEmail(this.getMail());
       /* u.setPass(this.getPass());
        insert(u);*/
    }
    public void insert(String email , String pass){
        
        /*u.setEmail(email);
        u.setPass(pass);
        this.mail = email;
        this.pass = pass;
        
        System.out.println(mail +"  " + this.pass);
        //this.userFacade.create(u);*/
        
        User us = new User();
        us.setEmail(email);
        us.setPass(pass);
        userFacade.create(us);
    }
    
    public utilisateurBean() {
    }
    
}
