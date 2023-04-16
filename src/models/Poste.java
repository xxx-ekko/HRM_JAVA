/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Ekko
 */
@Entity
@Table(name = "poste")
@NamedQueries({
    @NamedQuery(name = "Poste.findAll", query = "SELECT p FROM Poste p"),
    @NamedQuery(name = "Poste.findById", query = "SELECT p FROM Poste p WHERE p.id = :id"),
    @NamedQuery(name = "Poste.findByNom", query = "SELECT p FROM Poste p WHERE p.nom = :nom"),
    @NamedQuery(name = "Poste.findBySalaireMin", query = "SELECT p FROM Poste p WHERE p.salaireMin = :salaireMin"),
    @NamedQuery(name = "Poste.findBySalaireMax", query = "SELECT p FROM Poste p WHERE p.salaireMax = :salaireMax")})
public class Poste implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @Column(name = "salaire_min")
    private float salaireMin;
    @Basic(optional = false)
    @Column(name = "salaire_max")
    private float salaireMax;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPoste", fetch = FetchType.EAGER)
    private List<EmployePoste> employePosteList;

    public Poste() {
    }

    public Poste(Integer id) {
        this.id = id;
    }

    public Poste(Integer id, String nom, float salaireMin, float salaireMax) {
        this.id = id;
        this.nom = nom;
        this.salaireMin = salaireMin;
        this.salaireMax = salaireMax;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getSalaireMin() {
        return salaireMin;
    }

    public void setSalaireMin(float salaireMin) {
        this.salaireMin = salaireMin;
    }

    public float getSalaireMax() {
        return salaireMax;
    }

    public void setSalaireMax(float salaireMax) {
        this.salaireMax = salaireMax;
    }

    public List<EmployePoste> getEmployePosteList() {
        return employePosteList;
    }

    public void setEmployePosteList(List<EmployePoste> employePosteList) {
        this.employePosteList = employePosteList;
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
        if (!(object instanceof Poste)) {
            return false;
        }
        Poste other = (Poste) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Poste[ id=" + id + " ]";
    }
    
}
