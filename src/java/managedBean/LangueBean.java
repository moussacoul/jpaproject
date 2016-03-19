/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBean;

import entites.Linguistique;
import entites.LinguistiqueFacade;
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
public class LangueBean implements Serializable{
    
    @EJB
    private LinguistiqueFacade langFacade;
    
    @Inject    
    private UserManagedBean userSession;  
    private String niveau;
    private String nom;
   
    
    //User user = UserManagedBean.getCurrentUser();
    public LangueBean() {
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String createLangue(){
        List<User> userList = new ArrayList<User>();
        userList.add(userSession.getCurrentUserFacade().find(userSession.getUserId()));
        Linguistique langue = new Linguistique(niveau, nom, userList);
        /*langue.setNiveau(niveau);
        langue.setNomLing(nom);*/
        langFacade.create(langue);
        return "cv";
    }
    
    public List<Linguistique>allLangue(){
        //createFormation();
       // user.setFormationList(new ArrayList<Formation>());
        System.out.println(userSession.getUserId()+" tttttttttttttttttttttttttttt");
        System.out.println(langFacade.getLangueByUserId(userSession.getUserId()));
        return langFacade.getLangueByUserId(userSession.getUserId());
    }
    public String remove(){
        for(Linguistique l :langFacade.getLangueByUserId(userSession.getUserId())){
            if(l.getNomLing().equals(nom)){
                //competenceFacade.remove(c);
                langFacade.remove(l);
            }
        }
        
        return "cv";
    }
    
}
