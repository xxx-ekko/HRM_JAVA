/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.IEmployeDepartementDao;

import models.EmployeDepartement;

import java.util.List;

/**
 *
 * @author Ekko
 */
public class EmployeDepartementService {
    private final IEmployeDepartementDao employeDepartementDao;
    
    public EmployeDepartementService(IEmployeDepartementDao employeDepartementDao) {
        this.employeDepartementDao = employeDepartementDao;
    }
    
    public boolean createEmployeDepartement(EmployeDepartement employeDepartement) {
        return employeDepartementDao.addEmployeDepartement(employeDepartement);
    }
    
    public boolean updateEmployeDepartement(EmployeDepartement employeDepartement) {
        return employeDepartementDao.updateEmployeDepartement(employeDepartement);
    }
    
    public boolean deleteEmployeDepartement(EmployeDepartement employeDepartement) {
        return employeDepartementDao.deleteEmployeDepartement(employeDepartement);
    }
    
    public EmployeDepartement findEmployeDepartementById(int id) {
        return employeDepartementDao.findEmployeDepartementById(id);
    }
    
    public List<EmployeDepartement> findAllEmployeDepartements() {
        return employeDepartementDao.findAllEmployeDepartements();
    }
}
