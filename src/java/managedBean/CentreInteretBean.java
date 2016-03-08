/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import entites.Centreinteret;
import entites.CentreinteretFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Moussa
 */

@ManagedBean
@SessionScoped
public class CentreInteretBean {
    
    @EJB
    private CentreinteretFacade ciFacade;
    private String commentaire;
    private String nom;
    private Centreinteret ci= new Centreinteret();
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
        ci.setNomCi(nom);
        ci.setCommentaire(commentaire);
        ciFacade.create(ci);
        
        return "cv";
    }
    
}
