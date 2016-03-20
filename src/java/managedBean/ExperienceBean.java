/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import entites.Experience;
import entites.ExperienceFacade;
import entites.Formation;
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
public class ExperienceBean implements Serializable{
    
    @EJB
    private ExperienceFacade expFacade;
    @Inject    
    private UserManagedBean userSession;  
    private String annee;
    private String type;
    private int duree;
    private String ville;
    private String pays;
    private String Commentaire;
    private boolean status = false;
    //User user = UserManagedBean.getCurrentUser();
    
    public ExperienceBean() {
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getCommentaire() {
        return Commentaire;
    }

    public void setCommentaire(String Commentaire) {
        this.Commentaire = Commentaire;
    }
    
    public String createExprerience(){
       
        List<User> userList = new ArrayList<User>();
        userList.add(userSession.getCurrentUserFacade().find(userSession.getUserId()));
        Experience experience = new Experience(annee, Commentaire, duree, pays, type, ville, userList,status);
        expFacade.create(experience);
        /*
        experience.setAnnee(annee);
        experience.setCommentaire(Commentaire);
        experience.setNbMois(duree);
        experience.setPays(pays);
        experience.setVille(ville);
        experience.setType(type);*/
        
       /*expFacade.create(experience);
       experience.addUser(user);
        user.addExperience(experience);
        experience = new Experience();*/
        return "cv";
    }
    
    public List<Experience>allExperience(){
        //createExprerience();
        System.out.println(userSession.getUserId()+" tttttttttttttttttttttttttttt");
        System.out.println(expFacade.getExperienceByUserId(userSession.getUserId()));
        return expFacade.getExperienceByUserId(userSession.getUserId());
    }
    
    public List<Experience>allExperience(int id){
        
        return expFacade.getExperienceByUserId(userSession.getUserId());
    }
    public String remove(){
        for(Experience e :expFacade.getExperienceByUserId(userSession.getUserId())){
            if(e.getAnnee().equals(annee)){
                //competenceFacade.remove(c);
                expFacade.remove(e);
            }
        }
        
        return "cv";
    }
    
}
