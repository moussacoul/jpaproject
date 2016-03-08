/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import entites.Experience;
import entites.ExperienceFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Moussa
 */

@ManagedBean
@SessionScoped
public class ExperienceBean {
    
    @EJB
    private ExperienceFacade expFacade;
    
    private String annee;
    private String type;
    private int duree;
    private String ville;
    private String pays;
    private String Commentaire;
    private Experience experience = new Experience();
    public ExperienceBean() {
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
        experience.setAnnee(annee);
        experience.setCommentaire(Commentaire);
        experience.setNbMois(duree);
        experience.setPays(pays);
        experience.setVille(ville);
        experience.setType(type);
        
        expFacade.create(experience);
        return "cv";
    }
    
    
}
