/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Moussa
 */
@Stateless
public class ExperienceFacade extends AbstractFacade<Experience> {

    @PersistenceContext(unitName = "jpaprojectPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ExperienceFacade() {
        super(Experience.class);
    }
    
    public List<Experience> getExperienceByUserId(int user_id){
        
        Query query = em.createQuery("select u.experienceList from User u where u.idUser =" +user_id);
        List<Experience> userExperience = query.getResultList() ;

        return userExperience ;
    }
}
