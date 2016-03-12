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
public class CompetenceFacade extends AbstractFacade<Competence> {

    @PersistenceContext(unitName = "jpaprojectPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompetenceFacade() {
        super(Competence.class);
    }
    public List<Competence> getCompetenceByUserId(int user_id) {

    Query query = em.createQuery("select u.competenceList from User u where u.idUser = "+user_id );
    
    List<Competence> userformation = query.getResultList() ;
    
     return userformation ;
    }
    
}
