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
@Table(name = "formation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formation.findAll", query = "SELECT f FROM Formation f"),
    @NamedQuery(name = "Formation.findByIdFormation", query = "SELECT f FROM Formation f WHERE f.idFormation = :idFormation"),
    @NamedQuery(name = "Formation.findByAnneeFormation", query = "SELECT f FROM Formation f WHERE f.anneeFormation = :anneeFormation"),
    @NamedQuery(name = "Formation.findByLieuFormation", query = "SELECT f FROM Formation f WHERE f.lieuFormation = :lieuFormation"),
    @NamedQuery(name = "Formation.findByNomFormation", query = "SELECT f FROM Formation f WHERE f.nomFormation = :nomFormation")})
public class Formation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_formation")
    private Integer idFormation;
    @Size(max = 30)
    @Column(name = "anneeFormation")
    private String anneeFormation;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "commentaireFormation")
    private String commentaireFormation;
    @Size(max = 255)
    @Column(name = "lieuFormation")
    private String lieuFormation;
    @Size(max = 255)
    @Column(name = "nomFormation")
    private String nomFormation;
    @JoinTable(name = "userformation", joinColumns = {
        @JoinColumn(name = "id_formation", referencedColumnName = "id_formation")}, inverseJoinColumns = {
        @JoinColumn(name = "id_user", referencedColumnName = "id_user")})
    @ManyToMany
    private List<User> userList;

    public Formation() {
    }

    public Formation(Integer idFormation) {
        this.idFormation = idFormation;
    }

    public Integer getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(Integer idFormation) {
        this.idFormation = idFormation;
    }

    public String getAnneeFormation() {
        return anneeFormation;
    }

    public void setAnneeFormation(String anneeFormation) {
        this.anneeFormation = anneeFormation;
    }

    public String getCommentaireFormation() {
        return commentaireFormation;
    }

    public void setCommentaireFormation(String commentaireFormation) {
        this.commentaireFormation = commentaireFormation;
    }

    public String getLieuFormation() {
        return lieuFormation;
    }

    public void setLieuFormation(String lieuFormation) {
        this.lieuFormation = lieuFormation;
    }

    public String getNomFormation() {
        return nomFormation;
    }

    public void setNomFormation(String nomFormation) {
        this.nomFormation = nomFormation;
    }

    @XmlTransient
    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    
    public void addUser(User u){
        userList.add(u);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFormation != null ? idFormation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formation)) {
            return false;
        }
        Formation other = (Formation) object;
        if ((this.idFormation == null && other.idFormation != null) || (this.idFormation != null && !this.idFormation.equals(other.idFormation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Formation[ idFormation=" + idFormation + " ]";
    }

    
    
}
