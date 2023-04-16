/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.IPosteDao;
import java.util.List;
import models.Poste;

/**
 *
 * @author Ekko
 */
public class PosteService {
    private IPosteDao posteDao;

    public PosteService(IPosteDao posteDao) {
        this.posteDao = posteDao;
    }

    public boolean ajouterPoste(Poste poste) {
        return posteDao.ajouter(poste);
    }

    public boolean supprimerPoste(int id) {
        return posteDao.supprimer(id);
    }

    public boolean modifierPoste(Poste poste) {
        return posteDao.modifier(poste);
    }

    public List<Poste> listerPostes() {
        return posteDao.lister();
    }

    public Poste trouverPosteParId(int id) {
        return posteDao.trouverParId(id);
    }
}
