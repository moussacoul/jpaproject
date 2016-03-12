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
public class FormationFacade extends AbstractFacade<Formation> {

    @PersistenceContext(unitName = "jpaprojectPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FormationFacade() {
        super(Formation.class);
    }
    
    /*public List<Integer> getFormationByUserId(Integer id_formation) {

    Query query = em.createNamedQuery("select u from userformation u where u.id_user =" +id_formation).setParameter("id_formation", id_formation) ;
    
    List<Integer> userformation = query.getResultList() ;
    
     return userformation ;
}*/
    public List<Formation> getFormationByUserId(int user_id) {

    Query query = em.createQuery("select u.formationList from User u where u.idUser = "+user_id );
    
    List<Formation> userformation = query.getResultList() ;
    
     return userformation ;
    }
    
   /* public void entityManager(Formation f){
        em.persist(f);
    }*/
    
    
    
}
