/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import entites.Formation;
import entites.FormationFacade;
import entites.User;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Moussa
 */
@ManagedBean
@SessionScoped
public class FormationBean {

    
    @EJB
    private FormationFacade formationFacade ;
    
    private String nomF;
    private String anneeF;
    private String LieuF;
    private String Commentaire;
    private Formation formation = new Formation();
    User user = UserManagedBean.getCurrentUser();
    public FormationBean(){
        formationFacade = new FormationFacade();
        
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
       
        formation.setAnneeFormation(anneeF);
        formation.setCommentaireFormation(Commentaire);
        formation.setLieuFormation(LieuF);
        formation.setNomFormation(nomF);
        this.formationFacade.create(formation);
        
        formation.addUser(user);
        user.addFormation(formation);
        
       //a
        
       /* UserManagedBean user = (UserManagedBean) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("pass");
      
        String mesParametres = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().values().toString(); 
        System.out.println(user +"   ttttttttttttttttttttttttttttttt" + mesParametres);    
        formation.getUserList().add(formation.getIdFormation(), UserManagedBean.idUser);*/
        
        return "cv";
    }
    public List<Formation>allFormation(){
        createFormation();
        return user.getFormationList();
    }
}
