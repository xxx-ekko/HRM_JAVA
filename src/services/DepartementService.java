/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;
import dao.IDepartementDao;
import models.Departement;
import utils.EntityManagerUtil;

import javax.persistence.EntityManager;
import java.util.List;

/**
 *
 * @author Ekko
 */
public class DepartementService implements IDepartementDao {
    private final IDepartementDao departementDao;
    private final EntityManagerUtil emUtil;

    public DepartementService(IDepartementDao departementDao) {
        this.departementDao = departementDao;
        this.emUtil = new EntityManagerUtil();
    }

    @Override
    public boolean createDepartement(Departement departement) {
        return departementDao.createDepartement(departement);
    }

    @Override
    public boolean updateDepartement(Departement departement) {
        return departementDao.updateDepartement(departement);
    }

    @Override
    public boolean deleteDepartement(Departement departement) {
        return departementDao.deleteDepartement(departement);
    }

    @Override
    public Departement findDepartementById(int id) {
        return departementDao.findDepartementById(id);
    }

    @Override
    public List<Departement> findAllDepartements() {
        return departementDao.findAllDepartements();
    }
}
