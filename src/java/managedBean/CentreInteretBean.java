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

/**
 *
 * @author Moussa
 */

@ManagedBean
@SessionScoped
public class CentreInteretBean implements Serializable{
    
    @EJB
    private CentreinteretFacade ciFacade;
    private String commentaire;
    private String nom;
    
    User user = UserManagedBean.getCurrentUser();
    public CentreInteretBean() {
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
        userList.add(user);
        Centreinteret ci= new Centreinteret(commentaire, nom, userList);
        ciFacade.create(ci);
        return "cv";
    }
    public List<Centreinteret>allCentreInteret(){
        //createFormation();
       // user.setFormationList(new ArrayList<Formation>());
        System.out.println(user.getIdUser()+" tttttttttttttttttttttttttttt");
        System.out.println(ciFacade.getCentreInteretByUserId(user.getIdUser()));
        return ciFacade.getCentreInteretByUserId(user.getIdUser());
    }
}
