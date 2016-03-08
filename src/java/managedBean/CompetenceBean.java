/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import entites.Competence;
import entites.CompetenceFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Moussa
 */
@ManagedBean
@SessionScoped
public class CompetenceBean {

    @EJB
    private CompetenceFacade competenceFacade;
     private String domaine;
    private String module;
    private String Commentaire;
    private Competence competence = new Competence();
    
    public CompetenceBean(){
        
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getCommentaire() {
        return Commentaire;
    }

    public void setCommentaire(String Commentaire) {
        this.Commentaire = Commentaire;
    }
    
    public String createCompetence(){
        competence.setDomaine(domaine);
        competence.setModule(module);
        competence.setCommentaire(Commentaire);
        
        competenceFacade.create(competence);
        return "cv";
    }
    
    
    
}
