/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managedBean;

import entites.Linguistique;
import entites.LinguistiqueFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Moussa
 */
@ManagedBean
@SessionScoped
public class LangueBean {
    
    @EJB
    private LinguistiqueFacade langFacade;
    private String niveau;
    private String nom;
    private Linguistique langue = new Linguistique();

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

    public Linguistique getLangue() {
        return langue;
    }

    public void setLangue(Linguistique langue) {
        this.langue = langue;
    }
   
    
    
    public String createLangue(){
        
        langue.setNiveau(niveau);
        langue.setNomLing(nom);
        langFacade.create(langue);
        
        return "cv";
    }
    
    
}
