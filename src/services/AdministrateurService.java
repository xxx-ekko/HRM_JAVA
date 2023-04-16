/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;
import dao.IAdministrateurDao;
import models.Administrateur;
import utils.EntityManagerUtil;

import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author Ekko
 */

public class AdministrateurService implements IAdministrateurDao {

    private final EntityManagerUtil emUtil;

    public AdministrateurService() {
        emUtil = new EntityManagerUtil();
    }

    @Override
    public List<Administrateur> findAllAdministrateurs() {
        return emUtil.getEntityManager()
                .createQuery("SELECT a FROM Administrateur a", Administrateur.class)
                .getResultList();
    }

    @Override
    public Administrateur findAdministrateurById(int id) {
        return emUtil.getEntityManager()
                .find(Administrateur.class, id);
    }

    @Override
    public boolean createAdministrateur(Administrateur administrateur) {
        emUtil.executeInsideTransaction(entityManager -> entityManager.persist(administrateur));
        return true;
    }

    @Override
    public boolean updateAdministrateur(Administrateur administrateur) {
        emUtil.executeInsideTransaction(entityManager -> entityManager.merge(administrateur));
        return true;
    }

    @Override
    public boolean deleteAdministrateur(Administrateur administrateur) {
        emUtil.executeInsideTransaction(entityManager -> entityManager.remove(administrateur));
        return true;
    }
    
    @Override
public boolean authentifier(String prenom, String nom, String motDePasse) {
    try {
        String query = "SELECT a FROM Administrateur a WHERE a.prenom = :prenom AND a.nom = :nom AND a.motDePasse = :motDePasse";
        Administrateur administrateur = emUtil.getEntityManager()
                .createQuery(query, Administrateur.class)
                .setParameter("prenom", prenom)
                .setParameter("nom", nom)
                .setParameter("motDePasse", motDePasse)
                .getSingleResult();
        return administrateur != null;
    } catch (NoResultException e) {
        return false;
    }
}

}
