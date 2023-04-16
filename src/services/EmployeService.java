/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.IEmployeDao;
import java.util.List;
import models.Employe;

/**
 *
 * @author Ekko
 */
public class EmployeService implements IEmployeDao {

    private final IEmployeDao employeDao;

    public EmployeService(IEmployeDao employeDao) {
        this.employeDao = employeDao;
    }

    @Override
    public List<Employe> getAllEmployes() {
        return employeDao.getAllEmployes();
    }

    @Override
    public Employe getEmployeById(int id) {
        return employeDao.getEmployeById(id);
    }

@Override
public void addEmploye(Employe employe) {
    employeDao.addEmploye(employe);
}

@Override
public void updateEmploye(Employe employe) {
    employeDao.updateEmploye(employe);
}

@Override
public boolean deleteEmploye(int id) {
    Employe employe = employeDao.getEmployeById(id);
    if (employe == null) {
        return false;
    }
    employeDao.deleteEmploye(id);
    return true;
}
}