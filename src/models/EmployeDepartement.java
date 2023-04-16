/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ekko
 */
@Entity
@Table(name = "employe_departement")
@NamedQueries({
    @NamedQuery(name = "EmployeDepartement.findAll", query = "SELECT e FROM EmployeDepartement e"),
    @NamedQuery(name = "EmployeDepartement.findById", query = "SELECT e FROM EmployeDepartement e WHERE e.id = :id"),
    @NamedQuery(name = "EmployeDepartement.findByDateEntree", query = "SELECT e FROM EmployeDepartement e WHERE e.dateEntree = :dateEntree"),
    @NamedQuery(name = "EmployeDepartement.findByDateSortie", query = "SELECT e FROM EmployeDepartement e WHERE e.dateSortie = :dateSortie")})
public class EmployeDepartement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "date_entree")
    @Temporal(TemporalType.DATE)
    private Date dateEntree;
    @Column(name = "date_sortie")
    @Temporal(TemporalType.DATE)
    private Date dateSortie;
    @JoinColumn(name = "id_employe", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Employe idEmploye;
    @JoinColumn(name = "id_departement", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Departement idDepartement;

    public EmployeDepartement() {
    }

    public EmployeDepartement(Integer id) {
        this.id = id;
    }

    public EmployeDepartement(Integer id, Date dateEntree) {
        this.id = id;
        this.dateEntree = dateEntree;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public Employe getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(Employe idEmploye) {
        this.idEmploye = idEmploye;
    }

    public Departement getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(Departement idDepartement) {
        this.idDepartement = idDepartement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeDepartement)) {
            return false;
        }
        EmployeDepartement other = (EmployeDepartement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.EmployeDepartement[ id=" + id + " ]";
    }
    
}
