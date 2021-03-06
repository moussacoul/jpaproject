/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import entites.Formation;
import entites.FormationFacade;
import entites.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author Moussa
 */
@ManagedBean
@SessionScoped
public class FormationBean implements Serializable{

    
    @EJB
    private FormationFacade formationFacade ;
    @Inject    
    private UserManagedBean userSession;  
    private String nomF;
    private String anneeF;
    private String LieuF;
    private String Commentaire;
    private boolean status = false;
   // private 
    User currentUser = UserManagedBean.getCurrentUser();
    public FormationBean(){
       // formationFacade = new FormationFacade();
        
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public FormationFacade getFormationFacade() {
        return formationFacade;
    }

    public String getNomF() {
        return nomF;
    }

    public void setNomF(String nomF) {
        this.nomF = nomF;
    }

    public String getAnneeF() {
        return anneeF;
    }

    public void setAnneeF(String anneeF) {
        this.anneeF = anneeF;
    }

    public String getLieuF() {
        return LieuF;
    }

    public void setLieuF(String LieuF) {
        this.LieuF = LieuF;
    }

    public String getCommentaire() {
        return Commentaire;
    }

    public void setCommentaire(String Commentaire) {
        this.Commentaire = Commentaire;
    }
    
    
    // faire une trabsaction 
    public String createFormation(){
        List<User> listUser = new ArrayList<User>();
        listUser.add(userSession.getCurrentUserFacade().find(userSession.getUserId()));
        Formation formation = new Formation(anneeF, Commentaire, LieuF, nomF,listUser,status);
        formationFacade.create(formation);
        /*formation.setAnneeFormation(anneeF);
        formation.setCommentaireFormation(Commentaire);
        formation.setLieuFormation(LieuF);
        formation.setNomFormation(nomF);
        this.formationFacade.create(formation);
        
        formation.addUser(currentUser);
        currentUser.addFormation(formation);*/
        
       //a
        
       /* UserManagedBean currentUser = (UserManagedBean) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("pass");
      
        String mesParametres = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().values().toString(); 
        System.out.println(currentUser +"   ttttttttttttttttttttttttttttttt" + mesParametres);    
        formation.getUserList().add(formation.getIdFormation(), UserManagedBean.idUser);*/
        
        return "cv";
    }
    public List<Formation>allFormation(){
        
        //createFormation();
       // currentUser.setFormationList(new ArrayList<Formation>());
        System.out.println(currentUser.getIdUser()+" tttttttttttttttttttttttttttt");
       System.out.println("idddddddddddddddd userSession  "+userSession.getUserId());
        return formationFacade.getFormationByUserId(userSession.getUserId());
    }
    
    public String remove(){
        
        for(Formation f :formationFacade.getFormationByUserId(userSession.getUserId())){
            if(f.getNomFormation().equals(nomF)){
                //competenceFacade.remove(c);
                formationFacade.remove(f);
            }
        }
        
        return "cv";
    }
    public List<Formation>allFormation(int id){
        
       
        return formationFacade.getFormationByUserId(id);
    }
}
