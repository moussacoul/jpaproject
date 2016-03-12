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

/**
 *
 * @author Moussa
 */
@ManagedBean
@SessionScoped
public class LangueBean implements Serializable{
    
    @EJB
    private LinguistiqueFacade langFacade;
    private String niveau;
    private String nom;
   
    User user = UserManagedBean.getCurrentUser();
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
        userList.add(user);
        Linguistique langue = new Linguistique(niveau, nom, userList);
        /*langue.setNiveau(niveau);
        langue.setNomLing(nom);*/
        langFacade.create(langue);
        return "cv";
    }
    
    public List<Linguistique>allLangue(){
        //createFormation();
       // user.setFormationList(new ArrayList<Formation>());
        System.out.println(user.getIdUser()+" tttttttttttttttttttttttttttt");
        System.out.println(langFacade.getFormationByUserId(user.getIdUser()));
        return langFacade.getFormationByUserId(user.getIdUser());
    }
    
    
}
