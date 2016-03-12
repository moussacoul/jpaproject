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
public class CentreinteretFacade extends AbstractFacade<Centreinteret> {

    @PersistenceContext(unitName = "jpaprojectPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CentreinteretFacade() {
        super(Centreinteret.class);
    }
    public List<Centreinteret>getCentreInteretByUserId(int user_id) {

    Query query = em.createQuery("select u.centreinteretList from User u where u.idUser = "+user_id );
    
    List<Centreinteret> userCentreinterets = query.getResultList() ;
    
     return userCentreinterets;
    }
}
