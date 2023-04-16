/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import models.EmployeDepartement;

/**
 *
 * @author Ekko
 */
public interface IEmployeDepartementDao {
    boolean addEmployeDepartement(EmployeDepartement employeDepartement);
    boolean updateEmployeDepartement(EmployeDepartement employeDepartement);
    boolean deleteEmployeDepartement(EmployeDepartement employeDepartement);
    EmployeDepartement findEmployeDepartementById(int id);
    List<EmployeDepartement> findAllEmployeDepartements();
}
