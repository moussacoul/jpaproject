/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Moussa
 */
@Stateless
public class UserFacade extends AbstractFacade<User>{

    @PersistenceContext(unitName = "jpaprojectPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }

    public User findByEmail(String email) {
        try {
            return (User) em.createNamedQuery(User.findByEmail).setParameter("email", email).setMaxResults(1).getSingleResult();
        } catch (NoResultException e) {

            e.printStackTrace();
            return null;
        }
    }

    /*
    il faut faire une transaction begin .... commit
    */
    public User insertUserInfo(String pass, String name, String pren, String num, Date date, String address, String mail,String titrecv) {
        User u = findByEmail(mail);
       // em.getTransaction().begin();
        u.setAdresse(address);
        u.setNom(name);
        u.setPrenom(pren);
        u.setTelephone(num);
       // u.setDateNaissassance(date);
        u.setPass(pass);
        u.setTitreCV(titrecv);
        em.persist(u);
       // em.getTransaction().commit();
        return u;
    }

}
