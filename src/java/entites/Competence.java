/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Moussa
 */
@Entity
@Table(name = "competence")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Competence.findAll", query = "SELECT c FROM Competence c"),
    @NamedQuery(name = "Competence.findByIdComp", query = "SELECT c FROM Competence c WHERE c.idComp = :idComp"),
    @NamedQuery(name = "Competence.findByDomaine", query = "SELECT c FROM Competence c WHERE c.domaine = :domaine"),
    @NamedQuery(name = "Competence.findByModule", query = "SELECT c FROM Competence c WHERE c.module = :module")})
public class Competence implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_comp")
    private Integer idComp;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "commentaire")
    private String commentaire;
    @Size(max = 255)
    @Column(name = "domaine")
    private String domaine;
    @Size(max = 255)
    @Column(name = "module")
    private String module;
    @JoinTable(name = "usercompetence", joinColumns = {
        @JoinColumn(name = "id_comp", referencedColumnName = "id_comp")}, inverseJoinColumns = {
        @JoinColumn(name = "id_user", referencedColumnName = "id_user")})
    @ManyToMany
    private List<User> userList;

    public Competence() {
    }

    public Competence(String commentaire, String domaine, String module, List<User> userList) {
        this.commentaire = commentaire;
        this.domaine = domaine;
        this.module = module;
        this.userList = userList;
    }
    
    

    public Competence(Integer idComp) {
        this.idComp = idComp;
    }

    public Integer getIdComp() {
        return idComp;
    }

    public void setIdComp(Integer idComp) {
        this.idComp = idComp;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @XmlTransient
    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComp != null ? idComp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Competence)) {
            return false;
        }
        Competence other = (Competence) object;
        if ((this.idComp == null && other.idComp != null) || (this.idComp != null && !this.idComp.equals(other.idComp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Competence[ idComp=" + idComp + " ]";
    }
    
}
