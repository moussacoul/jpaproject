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
@Table(name = "experience")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Experience.findAll", query = "SELECT e FROM Experience e"),
    @NamedQuery(name = "Experience.findByIdExperience", query = "SELECT e FROM Experience e WHERE e.idExperience = :idExperience"),
    @NamedQuery(name = "Experience.findByAnnee", query = "SELECT e FROM Experience e WHERE e.annee = :annee"),
    @NamedQuery(name = "Experience.findByCommentaire", query = "SELECT e FROM Experience e WHERE e.commentaire = :commentaire"),
    @NamedQuery(name = "Experience.findByNbMois", query = "SELECT e FROM Experience e WHERE e.nbMois = :nbMois"),
    @NamedQuery(name = "Experience.findByPays", query = "SELECT e FROM Experience e WHERE e.pays = :pays"),
    @NamedQuery(name = "Experience.findByType", query = "SELECT e FROM Experience e WHERE e.type = :type"),
    @NamedQuery(name = "Experience.findByVille", query = "SELECT e FROM Experience e WHERE e.ville = :ville")})
public class Experience implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_experience")
    private Integer idExperience;
    @Size(max = 255)
    @Column(name = "annee")
    private String annee;
    @Size(max = 255)
    @Column(name = "commentaire")
    private String commentaire;
    @Column(name = "nb_mois")
    private Integer nbMois;
    @Size(max = 255)
    @Column(name = "pays")
    private String pays;
    @Size(max = 255)
    @Column(name = "type")
    private String type;
    @Size(max = 255)
    @Column(name = "ville")
    private String ville;
    @JoinTable(name = "userexperience", joinColumns = {
        @JoinColumn(name = "id_experience", referencedColumnName = "id_experience")}, inverseJoinColumns = {
        @JoinColumn(name = "id_user", referencedColumnName = "id_user")})
    @ManyToMany
    private List<User> userList;

    public Experience() {
    }

    public Experience(Integer idExperience) {
        this.idExperience = idExperience;
    }

    public Integer getIdExperience() {
        return idExperience;
    }

    public void setIdExperience(Integer idExperience) {
        this.idExperience = idExperience;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Integer getNbMois() {
        return nbMois;
    }

    public void setNbMois(Integer nbMois) {
        this.nbMois = nbMois;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
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
        hash += (idExperience != null ? idExperience.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Experience)) {
            return false;
        }
        Experience other = (Experience) object;
        if ((this.idExperience == null && other.idExperience != null) || (this.idExperience != null && !this.idExperience.equals(other.idExperience))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Experience[ idExperience=" + idExperience + " ]";
    }
    
}
