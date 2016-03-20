/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import entites.Competence;
import entites.CompetenceFacade;
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
public class CompetenceBean implements Serializable{

    @EJB
    private CompetenceFacade competenceFacade;
     @Inject    
    private UserManagedBean userSession;  
     private String domaine;
    private String module;
    private String Commentaire;

    
   
   // User user = UserManagedBean.getCurrentUser();
    
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
        
        List<User> userList =new ArrayList<User>();
        userList.add(userSession.getCurrentUserFacade().find(userSession.getUserId()));
        Competence competence = new Competence(Commentaire, domaine, module, userList);
        
        /*competence.setDomaine(domaine);
        competence.setModule(module);
        competence.setCommentaire(Commentaire);*/
        
        competenceFacade.create(competence);
        return "cv";
    }
    public List<Competence>allCompetence(){
        //createFormation();
       // user.setFormationList(new ArrayList<Formation>());
        System.out.println(userSession.getUserId()+" tttttttttttttttttttttttttttt");
        System.out.println(competenceFacade.getCompetenceByUserId(userSession.getUserId()));
        return competenceFacade.getCompetenceByUserId(userSession.getUserId());
    }
    public List<Competence>allCompetence(int id){
        
        return competenceFacade.getCompetenceByUserId(id);
    }
    public String remove(){
        for(Competence c :competenceFacade.getCompetenceByUserId(userSession.getUserId())){
            if(c.getModule().equals(module)){
                //competenceFacade.remove(c);
                competenceFacade.remove(c);
            }
        }
        
        return "cv";
    }
    
    
}
