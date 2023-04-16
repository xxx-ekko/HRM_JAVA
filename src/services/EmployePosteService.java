/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;
import java.util.List;

import dao.IEmployePosteDao;
import models.EmployePoste;
import utils.EntityManagerUtil;

/**
 *
 * @author Ekko
 */
public class EmployePosteService implements IEmployePosteDao {
    
    private IEmployePosteDao employePosteDao;
    private EntityManagerUtil emUtil;
    
    public EmployePosteService() {
        this.emUtil = EntityManagerUtil.getInstance();
        this.employePosteDao = emUtil.getEmployePosteDao();
    }

    @Override
    public List<EmployePoste> getAllEmployePostes() {
        return employePosteDao.getAllEmployePostes();
    }

    @Override
    public EmployePoste findEmployePosteById(int id) {
        return employePosteDao.findEmployePosteById(id);
    }

    @Override
    public void addEmployePoste(EmployePoste employePoste) {
        emUtil.executeInsideTransaction(entityManager -> {
            employePosteDao.addEmployePoste(employePoste);
        });
    }

    @Override
    public void updateEmployePoste(EmployePoste employePoste) {
        emUtil.executeInsideTransaction(entityManager -> {
            employePosteDao.updateEmployePoste(employePoste);
        });
    }

    @Override
    public void deleteEmployePoste(EmployePoste employePoste) {
        emUtil.executeInsideTransaction(entityManager -> {
            employePosteDao.deleteEmployePoste(employePoste);
        });
    }
}
