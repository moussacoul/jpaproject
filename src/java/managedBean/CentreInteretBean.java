/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import entites.Centreinteret;
import entites.CentreinteretFacade;
import entites.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author Moussa
 */

@ManagedBean
@SessionScoped
public class CentreInteretBean implements Serializable{
    
    @EJB
    private CentreinteretFacade ciFacade;
    
    @Inject    
    private UserManagedBean userSession;  
    private String commentaire;
    private String nom;
    private boolean  status = false;
    
   // User user = UserManagedBean.getCurrentUser();
    public CentreInteretBean() {
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String createCInteret(){
        List<User> userList = new ArrayList<User>();
        userList.add(userSession.getCurrentUserFacade().find(userSession.getUserId()));
        Centreinteret ci= new Centreinteret(commentaire, nom, userList,status);
        ciFacade.create(ci);
        return "cv";
    }
    public List<Centreinteret>allCentreInteret(){
        //createFormation();
       // user.setFormationList(new ArrayList<Formation>());
        System.out.println(userSession.getUserId()+" tttttttttttttttttttttttttttt");
        System.out.println(ciFacade.getCentreInteretByUserId(userSession.getUserId()));
        return ciFacade.getCentreInteretByUserId(userSession.getUserId());
    }
     public List<Centreinteret>allCentreInteret(int id){
       
        return ciFacade.getCentreInteretByUserId(userSession.getUserId());
    }
    public String remove(){
        for(Centreinteret c :ciFacade.getCentreInteretByUserId(userSession.getUserId())){
            if(c.getNomCi().equals(nom)){
                //competenceFacade.remove(c);
                ciFacade.remove(c);
            }
        }   
        return "cv";
    }
}
