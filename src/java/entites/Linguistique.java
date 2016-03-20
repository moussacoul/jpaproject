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
@Table(name = "linguistique")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Linguistique.findAll", query = "SELECT l FROM Linguistique l"),
    @NamedQuery(name = "Linguistique.findByIdLing", query = "SELECT l FROM Linguistique l WHERE l.idLing = :idLing"),
    @NamedQuery(name = "Linguistique.findByNiveau", query = "SELECT l FROM Linguistique l WHERE l.niveau = :niveau"),
    @NamedQuery(name = "Linguistique.findByNomLing", query = "SELECT l FROM Linguistique l WHERE l.nomLing = :nomLing")})
public class Linguistique implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idLing")
    private Integer idLing;
    @Size(max = 255)
    @Column(name = "niveau")
    private String niveau;
    @Size(max = 255)
    @Column(name = "nomLing")
    private String nomLing;
    @Column(name = "status")
    private Boolean status;
    @JoinTable(name = "userlinguistique", joinColumns = {
        @JoinColumn(name = "idLing", referencedColumnName = "idLing")}, inverseJoinColumns = {
        @JoinColumn(name = "id_user", referencedColumnName = "id_user")})
    @ManyToMany
    private List<User> userList;

    public Linguistique() {
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Linguistique(String niveau, String nomLing, List<User> userList, boolean  st) {
        this.niveau = niveau;
        this.nomLing = nomLing;
        this.userList = userList;
        this.status=st;
    }

    public Linguistique(Integer idLing) {
        this.idLing = idLing;
    }

    public Integer getIdLing() {
        return idLing;
    }

    public void setIdLing(Integer idLing) {
        this.idLing = idLing;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getNomLing() {
        return nomLing;
    }

    public void setNomLing(String nomLing) {
        this.nomLing = nomLing;
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
        hash += (idLing != null ? idLing.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Linguistique)) {
            return false;
        }
        Linguistique other = (Linguistique) object;
        if ((this.idLing == null && other.idLing != null) || (this.idLing != null && !this.idLing.equals(other.idLing))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Linguistique[ idLing=" + idLing + " ]";
    }
    
}
