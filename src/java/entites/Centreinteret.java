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
@Table(name = "centreinteret")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Centreinteret.findAll", query = "SELECT c FROM Centreinteret c"),
    @NamedQuery(name = "Centreinteret.findByIdCinteret", query = "SELECT c FROM Centreinteret c WHERE c.idCinteret = :idCinteret"),
    @NamedQuery(name = "Centreinteret.findByNomCi", query = "SELECT c FROM Centreinteret c WHERE c.nomCi = :nomCi")})
public class Centreinteret implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cinteret")
    private Integer idCinteret;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "commentaire")
    private String commentaire;
    @Size(max = 255)
    @Column(name = "nom_ci")
    private String nomCi;
    @JoinTable(name = "userinteret", joinColumns = {
        @JoinColumn(name = "id_cinteret", referencedColumnName = "id_cinteret")}, inverseJoinColumns = {
        @JoinColumn(name = "id_user", referencedColumnName = "id_user")})
    @ManyToMany
    private List<User> userList;

    public Centreinteret() {
    }

    public Centreinteret(String commentaire, String nomCi, List<User> userList) {
        this.commentaire = commentaire;
        this.nomCi = nomCi;
        this.userList = userList;
    }

    public Centreinteret(Integer idCinteret) {
        this.idCinteret = idCinteret;
    }

    public Integer getIdCinteret() {
        return idCinteret;
    }

    public void setIdCinteret(Integer idCinteret) {
        this.idCinteret = idCinteret;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getNomCi() {
        return nomCi;
    }

    public void setNomCi(String nomCi) {
        this.nomCi = nomCi;
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
        hash += (idCinteret != null ? idCinteret.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Centreinteret)) {
            return false;
        }
        Centreinteret other = (Centreinteret) object;
        if ((this.idCinteret == null && other.idCinteret != null) || (this.idCinteret != null && !this.idCinteret.equals(other.idCinteret))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Centreinteret[ idCinteret=" + idCinteret + " ]";
    }
    
}
