/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;
import java.util.List;
import models.Employe;

/**
 *
 * @author Ekko
 */
public interface IEmployeDao {
    List<Employe> getAllEmployes();
    Employe getEmployeById(int id);
    void addEmploye(Employe employe);
    void updateEmploye(Employe employe);
    boolean deleteEmploye(int id);
}
